package com.example.orderfoodsystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderController {
    private final OrderSerivce orderSerivce;

    //메뉴 조회
    @GetMapping("/menu")
    public String getMenu(){
        return "menu";
    }
    //주문 조회
    @GetMapping("/order")
    public String getAllOrders(Model model){
        List<OrderDTO> orders = orderSerivce.getOrders();
        model.addAttribute("orders", orders);
        return "orderList";
    }
    //주문 추가
    @GetMapping("/add")
    public String addOrder(){

        return;
    }
    //주문 변경
    @PostMapping("/edit")
    public String getAllOrders(){
        orderSerivce.editOrder();
        return "orderlist";
    }
    //주문 삭제
    @PostMapping("/delete")
    public String deleteOrder(){
        orderSerivce.deleteOrder();
        return;
    }

}
