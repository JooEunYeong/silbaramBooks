package com.project.silbaram.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {
    private int lkid;
    private int bookId;
    private int memberId;

    // 테이블 조인으로 가져와야 할 값들
    private String name;
    private String writer;
    private int price;
}
