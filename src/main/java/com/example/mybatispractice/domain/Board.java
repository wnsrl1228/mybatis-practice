package com.example.mybatispractice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Board {

    private Long id;
    private String title;
    private String content;
    private Integer read;
    private String name;

    public Board(String title, String content, Integer read, String name) {
        this.title = title;
        this.content = content;
        this.read = read;
        this.name = name;
    }
}
