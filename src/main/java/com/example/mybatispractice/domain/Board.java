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
    private String name;
    private Member member;

    public Board(String title, String content, String name, Member member) {
        this.title = title;
        this.content = content;
        this.name = name;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", memberid=" + member.getId() +
                '}';
    }
}
