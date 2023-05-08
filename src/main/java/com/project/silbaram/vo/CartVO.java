package com.project.silbaram.vo;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CartVO {
    private int lkid; // 카트 번호
    private int bookId;
    private int memberId;

    // 테이블 조인으로 가져와야 할 값들
    private String name;
    private String writer;
    private int price;
}
