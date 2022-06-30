package com.example.demo.web.dto;

import com.example.demo.domain.board.Board;
import lombok.Getter;

@Getter
public class BoardResponseDto {
    private Long boSeq;
    private String boTitle;
    private String boContents;

    public BoardResponseDto(Board entity){
        this.boSeq = entity.getBoSeq();
        this.boTitle = entity.getBoTitle();
        this.boContents = entity.getBoContents();
    }
}
