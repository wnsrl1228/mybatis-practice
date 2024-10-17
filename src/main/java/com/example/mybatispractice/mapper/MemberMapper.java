package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    // 단일 조회
    Optional<Member> findById(Long id);

    // 삭제
    void deleteById(Long id);

}
