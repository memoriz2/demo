package com.example.demo;

import com.example.demo.service.BoardService;
import com.example.demo.web.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardApiController {
    private final BoardService boardService;

    @PostMapping("/api/m1/board/save")
    public Long save(@RequestBody BoardSaveRequestDto requestDto){
        return boardService.save(requestDto);
    }



}
