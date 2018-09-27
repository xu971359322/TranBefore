package org.java.controller.xu;

import com.alibaba.fastjson.JSONObject;
import org.java.entity.TranBranch;
import org.java.entity.TranOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    private static final String REST_URL_PREFIX = "http://BEFORE-XU";

    @Autowired
    private RestTemplate restTemplate;

    //得到最近的网点
    @RequestMapping("/getBranch")
    @ResponseBody
    public JSONObject getBranch(@RequestParam("lng") double lng,@RequestParam("lat") double lat){
        System.out.println(lng+"  "+lat);
        Map<String,Object> map = new HashMap<>();
        map.put("lng",lng);
        map.put("lat",lat);
        JSONObject json = new JSONObject();
        TranBranch branch = restTemplate.postForObject(REST_URL_PREFIX + "/order/getBranch", map, TranBranch.class);
        json.put("branch",branch);
        return json;
    }

    //提交订单
    @RequestMapping("/addOrder")
    public String addOrder(TranOrder order){
        order.setOrderInTime(new Date());
        String id =UUID.randomUUID().toString();
        order.setOrderId(id);
        System.out.println(order);
        restTemplate.postForObject(REST_URL_PREFIX+"/order/add",order,boolean.class);
        return "/index";
    }


    //跳转页面
    @RequestMapping("/online")
    public String online(Model model){

        //得到我们的网点省份所在
        List<Map<String,Object>> list =restTemplate.getForObject(REST_URL_PREFIX+"/client/selIntProvincial",List.class);

        //得到全国的省份
        List<Map<String,Object>> provincial =restTemplate.getForObject(REST_URL_PREFIX+"/client/selProvincial",List.class);

        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("provincial",provincial);


        return "/online";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
