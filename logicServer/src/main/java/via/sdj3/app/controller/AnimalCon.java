package via.sdj3.app.controller;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import via.sdj3.app.config.RabbitMQConfig;
import via.sdj3.app.logic.AnimalLogic;
import via.sdj3.app.objects.Animal;

@Service
public class AnimalCon {

    private AnimalLogic logic;

    public AnimalCon(AnimalLogic logic) {
        this.logic = logic;
    }

    @RabbitListener(queues = RabbitMQConfig.ANIMALS_CREATION_QUEUE)
    public Animal createAnimal(Animal animal) {
        Animal createdAnimal = logic.createAnimal(animal);
        return createdAnimal;
    }

    @RabbitListener(queues = RabbitMQConfig.ANIMALS_GET_ID)
    public Animal getById(int id) {
        return logic.getById(id);
    }

    @RabbitListener(queues = RabbitMQConfig.ANIMALS_GET_ALL)
    public List<Animal> getAllAnimals(String msg) {
        return logic.getAllAnimals();
    }

    @RabbitListener(queues = RabbitMQConfig.ANIMALS_GET_ORIGIN)
    public List<Animal> getByOrigin(String origin) {
        return logic.getByOrigin(origin);
    }

    @RabbitListener(queues = RabbitMQConfig.ANIMALS_GET_DATE)
    public List<Animal> getByDate(String date) {
        return logic.getByDate(date);
    }
}
