package org.java.controller.xu;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/client")
public class ClientController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://BEFORE-XU";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/selDetailMoney")
    @ResponseBody
    public JSONObject selDetailMoney(@RequestParam("first") String first, @RequestParam("second") String second){
        System.out.println(first+"  "+second);
        Map<String,Object> map = new HashMap<>();
        map.put("first",first);
        map.put("second",second);
        Map<String,Object> detail = restTemplate.postForObject(REST_URL_PREFIX+"/client/selDetailMoney",map,Map.class);

        System.out.println(detail);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("detail",detail);
        return jsonObject;
    }

    @RequestMapping("/detail3")
    public String selIntProvincial(Model model){

        //得到我们的网点
        List<Map<String,Object>> list =restTemplate.getForObject(REST_URL_PREFIX+"/client/selIntProvincial",List.class);

        //得到全国的省份
        List<Map<String,Object>> provincial =restTemplate.getForObject(REST_URL_PREFIX+"/client/selProvincial",List.class);

        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("provincial",provincial);

        return "/problem-detail3";
    }

    @RequestMapping("/selProvincialMoney")
    @ResponseBody
    public List<Map<String,Object>> selProvincialMoney(@RequestBody Integer id){
        //更具省份id查询对应的地区价格
        List<Map<String,Object>> list =restTemplate.getForObject(REST_URL_PREFIX+"/client/selProvincialMoney/"+id,List.class);

        System.out.println(list);

        return list;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
