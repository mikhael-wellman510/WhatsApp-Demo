package com.example.MessengersProjectExample.DAMI;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Greeting {
    private String content;
    private String name;

    @Override
    public String toString() {
        return "Greeting{" +
                "content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
