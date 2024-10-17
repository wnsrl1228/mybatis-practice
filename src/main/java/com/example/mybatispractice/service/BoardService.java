package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Board;
import com.example.mybatispractice.domain.Member;
import com.example.mybatispractice.mapper.BoardMapper;
import com.example.mybatispractice.mapper.MemberMapper;
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
    private final MemberMapper memberMapper;

    public int count() {
        return boardMapper.boardCount();
    }

    public Board findById(Long id) {
        return boardMapper.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public List<Board> findAll() {
        return boardMapper.findAll();
    }

    public Long save(Board board) {
        Member member = memberMapper.findById(1L)
                .orElseThrow(RuntimeException::new);
        board.setMember(member);

        boardMapper.save(board);
        return board.getId();
    }

    public void update(Long id, Board newBoard) {
        Board board = boardMapper.findById(id)
                .orElseThrow(RuntimeException::new);
        Member member2 = memberMapper.findById(2L)
                .orElseThrow(RuntimeException::new);
        board.setContent(newBoard.getContent());
        board.setName(newBoard.getName());
        board.setTitle(newBoard.getTitle());
        board.setMember(member2);

        boardMapper.update(board);
    }

    public void delete(Long id) {
        Board board = boardMapper.findById(id)
                .orElseThrow(RuntimeException::new);
        boardMapper.deleteById(id);
    }
}
