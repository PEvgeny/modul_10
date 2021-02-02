package com.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannels {
    String DIRECTED = "directed";

    @Input(DIRECTED)
    SubscribableChannel directed();

}
