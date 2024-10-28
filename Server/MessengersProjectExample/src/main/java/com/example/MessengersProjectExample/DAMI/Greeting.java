package com.example.MessengersProjectExample.DAMI;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Greeting {
    private String content;
}
