package com.example.demo.domain.board;

import com.example.demo.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boSeq;

    private String boTitle;

    private String boContents;

    @Builder
    public Board(Long boSeq, String boTitle, String boContents) {
        this.boSeq = boSeq;
        this.boTitle = boTitle;
        this.boContents = boContents;
    }
}
