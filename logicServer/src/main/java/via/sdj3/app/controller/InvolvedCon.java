package via.sdj3.app.controller;

import java.util.List;

import javax.script.Invocable;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import via.sdj3.app.config.RabbitMQConfig;
import via.sdj3.app.logic.InvolvedLogic;
import via.sdj3.app.objects.Animal;

@Service
public class InvolvedCon {

    private InvolvedLogic logic;

    public InvolvedCon(InvolvedLogic logic) {
        this.logic = logic;
    }

    @RabbitListener(queues = RabbitMQConfig.INVOLVED_ANIMALS)
    public List<Animal> retrieveInvolvedAnimals(int id) {
        return logic.retrieveRegNums(id);
    }

    @RabbitListener(queues = RabbitMQConfig.INVOLVED_PRODUCTS)
    public List<Integer> retrieveInvolvedProducts(int id) {
        return logic.retrieveProdNums(id);
    }
}
