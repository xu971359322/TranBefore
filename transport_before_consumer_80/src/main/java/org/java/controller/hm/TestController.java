package org.java.controller.hm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    private static final String REST_URL_PREFIX = "http://BEFORE-HM";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("queryExpressage.do")
    @ResponseBody
    public String queryExpressage(String comId,String id){
        System.out.println("进入..................................");
        System.out.println(comId+"*********"+id);
        Map<String,String> map = new HashMap<>();
        map.put("comId",comId);
        map.put("id",id);
        String detail = restTemplate.postForObject(REST_URL_PREFIX+"/queryExpressage.do",map,String.class);
        return detail;
    }

    @RequestMapping("getService.do")
    public String getService(){
        return "/service4";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @RequestMapping("goflow.do")
    public String goflow(){
        return "flow";
    }
}
