package com.example.mybatispractice.contoller;

import com.example.mybatispractice.domain.Board;
import com.example.mybatispractice.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    public final BoardService boardService;

    @GetMapping("/board/count")
    public ResponseEntity<Integer> count() {
        return ResponseEntity.ok().body(boardService.count());
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<Board> findById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok().body(boardService.findById(id));
    }

    @GetMapping("/board")
    public ResponseEntity<List<Board>> findAll() {
        return ResponseEntity.ok().body(boardService.findAll());
    }

    @PostMapping("/board")
    public ResponseEntity<Void> save(
            @RequestBody Board board
    ) {
        Long id = boardService.save(board);
        return ResponseEntity.created(URI.create("/board/" + id)).build();
    }

    @PatchMapping("/board/{id}")
    public ResponseEntity<Void> update(
            @PathVariable Long id,
            @RequestBody Board board
    ) {
        boardService.update(id, board);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/board/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id
    ) {
        boardService.delete(id);
        return ResponseEntity.ok().build();
    }
}
