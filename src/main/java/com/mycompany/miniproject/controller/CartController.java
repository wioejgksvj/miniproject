package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CartController {
	@RequestMapping("/cart")
	public String cartMethod() {
		log.info("장바구니");
		return "cart/cart";
	}
}