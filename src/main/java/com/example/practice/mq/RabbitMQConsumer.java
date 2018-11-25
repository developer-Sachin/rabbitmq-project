package com.example.practice.mq;

import com.example.practice.exceptions.CustomException;
import com.example.practice.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

    private static final Logger log = LoggerFactory.getLogger("RabbitMQConsumer");

    @RabbitListener(queues = "test-queue")
    public void messageListener(final Student student){

        log.info("Message consumed : " + student);

    }
}
