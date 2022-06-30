package com.example.demo.service;

import com.example.demo.domain.board.BoardRepository;
import com.example.demo.web.dto.BoardResponseDto;
import com.example.demo.web.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardResponseDto> findAllDesc(){
        return boardRepository.findAllDesc().stream()
                .map(BoardResponseDto::new)
                .collect(Collectors.toList());
    }

    public Long save(BoardSaveRequestDto requestDto){
        return boardRepository.save(requestDto.toEntity()).getBoSeq();
    }

}
