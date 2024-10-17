package com.example.mybatispractice.contoller;

import com.example.mybatispractice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @DeleteMapping("/member/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id
    ) {
        memberService.delete(id);
        return ResponseEntity.ok().build();
    }
}
