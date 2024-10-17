package com.example.mybatispractice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Member {

    private Long id;
    private String name;
    private Integer age;
    private String email;

    public Member(String email, Integer age, String name) {
        this.email = email;
        this.age = age;
        this.name = name;
    }
}
