package com.example.demo.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Query(value=" SELECT * FROM board ORDER BY bo_seq desc", nativeQuery = true)
    List<Board> findAllDesc();
}
