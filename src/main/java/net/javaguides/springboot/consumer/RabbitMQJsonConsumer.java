package net.javaguides.springboot.consumer;

import net.javaguides.springboot.repository.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private final static Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumeJson(User user) {
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));

    }
}
