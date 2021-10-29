package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public final class ConsumerServiceImpl implements ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        logger.info(String.format("### => Consumed message: %s", message));
    }
}
