package com.example.practice.api;

import com.example.practice.domain.ConfigProperties;
import com.example.practice.domain.Animal;
import com.example.practice.domain.Student;
import com.example.practice.mq.RabbitMQPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    List<Animal> animals1;

    @Autowired
    private RabbitMQPublisher rabbitMQPublisher;

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/hello")
   public Student sayHello(){

        ConfigProperties config = configProperties;
        //Account aact = new Account.Builder().name("Sachin").build();
        Student student = new Student();
        student.setAge("25");
        student.setEmail("abcd@gmail");
        student.setName("John");
        rabbitMQPublisher.send(student);
        //if(true)
        //throw new CustomException("test excetion thrown");
        LOG.info("Hello " + animals1.size());
       return student;
   }

}
