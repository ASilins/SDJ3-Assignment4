package Group1.Slaughterhouse.service;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import Group1.Slaughterhouse.config.RabbitMQConfig;
import Group1.Slaughterhouse.objects.Animal;

@Service
public class InvolvedServiceImpl implements InvolvedService {

    private RabbitTemplate rabbitTemplate;

    public InvolvedServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public List<Animal> retrieveInvolvedAnimals(int id) {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.INVOLVED_EXCHANGE,
                        RabbitMQConfig.INVOLVED_ANIMALS_KEY,
                        id,
                        new ParameterizedTypeReference<List<Animal>>() {
                        });
    }

    @Override
    public List<Integer> retrieveInvolvedProducts(int id) {
        return rabbitTemplate
                .convertSendAndReceiveAsType(RabbitMQConfig.INVOLVED_EXCHANGE,
                        RabbitMQConfig.INVOLVED_PRODUCTS_KEY,
                        id,
                        new ParameterizedTypeReference<List<Integer>>() {
                        });
    }

}
