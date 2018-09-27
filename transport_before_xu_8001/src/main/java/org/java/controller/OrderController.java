package org.java.controller;

import org.java.entity.TranBranch;
import org.java.entity.TranOrder;
import org.java.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.font.TrueTypeFont;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getBranch")
    public TranBranch getBranch(@RequestBody Map<String,Object> map){
        return orderService.selBranch(map);
    }

    @RequestMapping("/add")
    public boolean addOrder(@RequestBody TranOrder tranOrder){
        System.out.println(tranOrder);
        orderService.addOrder(tranOrder);
        return true;
    }

}
