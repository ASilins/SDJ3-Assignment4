package Group1.Slaughterhouse.service;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import Group1.Slaughterhouse.config.RabbitMQConfig;
import Group1.Slaughterhouse.objects.Animal;

@Service
public class AnimalServiceImpl2 implements AnimalService {

    private RabbitTemplate rabbitTemplate;

    public AnimalServiceImpl2(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public Animal create(Animal a) {
        Animal createdAnimal = (Animal) rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.ANIMALS_EXCHANGE, RabbitMQConfig.ANIMALS_CREATION_KEY, a,
                        new ParameterizedTypeReference<Animal>() {
                        });
        return createdAnimal;
    }

    @Override
    public List<Animal> getAllAnimals() {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.ANIMALS_EXCHANGE,
                        RabbitMQConfig.ANIMALS_GET_ALL_KEY,
                        "getAll",
                        new ParameterizedTypeReference<List<Animal>>() {
                        });
    }

    @Override
    public Animal getById(int id) {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.ANIMALS_EXCHANGE,
                        RabbitMQConfig.ANIMALS_GET_ID_KEY,
                        id,
                        new ParameterizedTypeReference<Animal>() {
                        });
    }

    @Override
    public List<Animal> getByOrigin(String origin) {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.ANIMALS_EXCHANGE,
                        RabbitMQConfig.ANIMALS_GET_ID_KEY,
                        origin,
                        new ParameterizedTypeReference<List<Animal>>() {
                        });
    }

    @Override
    public List<Animal> getByDate(String date) {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.ANIMALS_EXCHANGE,
                        RabbitMQConfig.ANIMALS_GET_ID_KEY,
                        date,
                        new ParameterizedTypeReference<List<Animal>>() {
                        });
    }

}
