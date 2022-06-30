package com.example.demo.web.dto;

import com.example.demo.domain.board.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {

    private String boTitle;
    private String boContents;

    @Builder
    public BoardSaveRequestDto(String boTitle, String boContents) {
        this.boTitle = boTitle;
        this.boContents = boContents;
    }

    public Board toEntity(){
        return Board.builder().boTitle(boTitle).boContents(boContents).build();
    }
}
