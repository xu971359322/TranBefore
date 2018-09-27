package org.java.controller;

import org.java.entity.Info;
import org.java.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService service;

    @RequestMapping("/selDetailMoney")
    public Map<String,Object> selDetailMoney(@RequestBody Map<String,String> map) {
        System.out.println(Integer.parseInt(map.get("first").toString())+"    "+map.get("second"));
        return  service.selDetailMoney(Integer.parseInt(map.get("first").toString()) ,Integer.parseInt(map.get("second").toString()));
    }

    @RequestMapping("/addClientOrder")
    public boolean addClientOrder(@RequestBody Map<String,String> order){
        System.out.println("进入到了controller");
        System.out.println(order);
        return true;
    }

    @RequestMapping("/selProvincial")
    public List<Map<String,Object>> selProvincial(){
        return service.selProvincial();
    }

    @RequestMapping("/selIntProvincial")
    public List<Map<String,Object>> selIntProvincial(){
        return service.selIntProvincial();
    }

    @RequestMapping("/selProvincialMoney/{id}")
    public List<Map<String,Object>> selProvincialMoney(@RequestBody@PathVariable Integer id){
        return service.selProvincialMoney(id);
    }




   @Override
    public String toString() {
        return super.toString();
    }
}
