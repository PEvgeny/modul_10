package com.kafka;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GreetingMessage {
    private Long id;

    private String message;

    private String jwt;
}
