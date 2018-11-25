package com.example.practice.mq;

import com.example.practice.domain.Student;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange directExchange;

    public void send(Student student) {
        rabbitTemplate.convertAndSend(directExchange.getName(), "part-data-update-queue", student);

    }

}
