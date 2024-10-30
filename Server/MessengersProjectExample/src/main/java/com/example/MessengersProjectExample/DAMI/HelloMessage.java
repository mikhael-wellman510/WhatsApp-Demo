package com.example.MessengersProjectExample.DAMI;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class HelloMessage {
    private String name;
    private String content;

    @Override
    public String toString() {
        return "HelloMessage{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
