package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Board;
import com.example.mybatispractice.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public int count() {
        return boardMapper.boardCount();
    }

    public Board findById(Long id) {
        return boardMapper.findById(id);
    }

    public List<Board> findAll() {
        return boardMapper.findAll();
    }

    public Long save(Board board) {
        boardMapper.save(board);
        return board.getId();
    }

    public void update(Long id, Board newBoard) {
        Board board = boardMapper.findById(id);
        board.setContent(newBoard.getContent());
        board.setName(newBoard.getName());
        board.setTitle(newBoard.getTitle());
        board.setRead(newBoard.getRead());

        boardMapper.update(board);
    }

    public void delete(Long id) {
        Board board = boardMapper.findById(id);
        boardMapper.delete(id);
    }
}
