package com.project.silbaram.dao;

import com.project.silbaram.dto.PageRequestDTO;
import com.project.silbaram.vo.CartVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDAO {

    void insertCart(CartVO cartVO); // 카트 추가
    List<CartVO> selectAll(); // 카트 목록 불러오기
    void delete(int lkid); //카트 삭제

}
