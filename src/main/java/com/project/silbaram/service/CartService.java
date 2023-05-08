package com.project.silbaram.service;

import com.project.silbaram.dto.CartDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    void addCart(CartDTO cartDTO); // 카트 추가

    List<CartDTO> getAll(); // 카트 목록 불러오기

    void remove(int lkid); // 카트 삭제
}
