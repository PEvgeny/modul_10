package com.kafka;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageListener {
    @StreamListener(ConsumerChannels.DIRECTED)
    public void directed(String message) {
        System.out.println("Directed: " + message);
    }
}
