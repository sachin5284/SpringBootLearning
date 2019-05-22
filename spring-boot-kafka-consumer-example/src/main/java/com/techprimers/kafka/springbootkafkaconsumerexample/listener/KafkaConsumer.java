package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example_Json",groupId = "group_id",containerFactory = "kafkaListenerContainerFactory")
    public void consumeJson(User user)
    {
        System.out.println("Consumed message "+ user.getName());
    }
}
