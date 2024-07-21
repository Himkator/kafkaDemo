package com.example.kafka.kafkademo.producer.controller;

import com.example.kafka.kafkademo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/kafka/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message){
        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("Success");
    }
}
