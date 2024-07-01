package com.example.learin_spring_0701;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class User {
    private String email;
    private String name;
    private int age;
}
