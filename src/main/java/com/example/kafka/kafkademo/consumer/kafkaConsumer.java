package com.example.kafka.kafkademo.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class kafkaConsumer {
    @KafkaListener(topics = "demo", groupId = "demos")
    public void listener(String message){
        log.info("Received message: "+message);
    }
}
