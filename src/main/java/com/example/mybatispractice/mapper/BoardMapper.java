package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 단일 조회
    Board findById(Long id);    // 목록 조회
    // 목록 조회
    List<Board> findAll();
    // 생성
    void save(Board board);
    // 수정
    void update(Board board);
    // 단일 삭제
    void delete(Long id);
    // 개수
    int boardCount();
}
