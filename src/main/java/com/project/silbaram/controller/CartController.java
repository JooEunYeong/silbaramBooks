package com.project.silbaram.controller;

import com.project.silbaram.dto.CartDTO;
import com.project.silbaram.service.CartServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(value = "/silbaram", method = {RequestMethod.GET, RequestMethod.POST})
public class CartController {
    private final CartServiceImpl cartService;

    @GetMapping("/cart/cart_list")
    public void list(Model model) {
        model.addAttribute("dtoList", cartService.getAll());
        log.info("cart_list...");
    }

    // 수정중인 코드 (ajax로 삭제 처리 위해 백업)
    @GetMapping("/cart/cart_list/{lkid}")
    public void deleteFromCart(@PathVariable int lkid) {
        log.info("deleteFromCart.....");
        cartService.remove(lkid);
    }


}
