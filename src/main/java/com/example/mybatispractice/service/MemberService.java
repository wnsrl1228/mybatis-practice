package com.example.mybatispractice.service;

import com.example.mybatispractice.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public void delete(Long id) {
        memberMapper.deleteById(id);
    }
}
