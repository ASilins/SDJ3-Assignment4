package via.sdj3.app.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Exchanges
    public static final String ANIMALS_EXCHANGE = "animals.exchange";
    public static final String INVOLVED_EXCHANGE = "involved.exchange";

    // Queue names
    public static final String ANIMALS_CREATION_QUEUE = "creation.queue";
    public static final String ANIMALS_GET_ALL = "get.all.queue";
    public static final String ANIMALS_GET_ID = "get.id.queue";
    public static final String ANIMALS_GET_ORIGIN = "get.origin.queue";
    public static final String ANIMALS_GET_DATE = "get.date.queue";

    public static final String INVOLVED_ANIMALS = "involved.animals.queue";
    public static final String INVOLVED_PRODUCTS = "involved.products.queue";

    // Routing keys
    public static final String ANIMALS_CREATION_KEY = "creation.key";
    public static final String ANIMALS_GET_ALL_KEY = "get.all.key";
    public static final String ANIMALS_GET_ID_KEY = "get.id.key";
    public static final String ANIMALS_GET_ORIGIN_KEY = "get.origin.key";
    public static final String ANIMALS_GET_DATE_KEY = "get.date.key";

    public static final String INVOLVED_ANIMALS_KEY = "involved.animals.key";
    public static final String INVOLVED_PRODUCTS_KEY = "involved.products.key";

    // Exchanges

    @Bean
    public Exchange animalExchange() {
        return new DirectExchange(ANIMALS_EXCHANGE);
    }

    @Bean
    public Exchange involvedExchange() {
        return new DirectExchange(INVOLVED_EXCHANGE);
    }

    // Queues

    @Bean
    public Queue creationQueue() {
        return new Queue(ANIMALS_CREATION_QUEUE);
    }

    @Bean
    public Queue getAllQueue() {
        return new Queue(ANIMALS_GET_ALL);
    }

    @Bean
    public Queue getIdQueue() {
        return new Queue(ANIMALS_GET_ID);
    }

    @Bean
    public Queue getOriginQueue() {
        return new Queue(ANIMALS_GET_ORIGIN);
    }

    @Bean
    public Queue getDateQueue() {
        return new Queue(ANIMALS_GET_DATE);
    }

    @Bean
    public Queue getInvolvedAnimalsQueue() {
        return new Queue(INVOLVED_ANIMALS);
    }

    @Bean
    public Queue getInvolvedProductsQueue() {
        return new Queue(INVOLVED_PRODUCTS);
    }

    // Bindings

    @Bean
    public Binding bindCreation() {
        return BindingBuilder.bind(creationQueue()).to(animalExchange())
                .with(ANIMALS_CREATION_KEY).noargs();
    }

    @Bean
    public Binding bindGetAll() {
        return BindingBuilder.bind(getAllQueue()).to(animalExchange())
                .with(ANIMALS_GET_ALL_KEY).noargs();
    }

    @Bean
    public Binding bindGetById() {
        return BindingBuilder.bind(getIdQueue()).to(animalExchange())
                .with(ANIMALS_GET_ID_KEY).noargs();
    }

    @Bean
    public Binding bindGetByOrigin() {
        return BindingBuilder.bind(getOriginQueue()).to(animalExchange())
                .with(ANIMALS_GET_ORIGIN_KEY).noargs();
    }

    @Bean
    public Binding bindGetByDate() {
        return BindingBuilder.bind(getDateQueue()).to(animalExchange())
                .with(ANIMALS_GET_DATE_KEY).noargs();
    }

    @Bean
    public Binding bindInvolvedAnimals() {
        return BindingBuilder.bind(getInvolvedAnimalsQueue()).to(animalExchange())
                .with(INVOLVED_ANIMALS_KEY).noargs();
    }

    @Bean
    public Binding bindInvolvedProducts() {
        return BindingBuilder.bind(getInvolvedProductsQueue()).to(animalExchange())
                .with(INVOLVED_PRODUCTS_KEY).noargs();
    }

    // JSON

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
