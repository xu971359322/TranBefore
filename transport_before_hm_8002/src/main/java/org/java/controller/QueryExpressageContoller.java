package org.java.controller;

import org.java.controller.util.LogisticsAPI.demo.QueryLogistics;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class QueryExpressageContoller {


    @RequestMapping("queryExpressage.do")
    public String queryExpressage(@RequestBody Map<String,String> map) throws Exception{
        String comId = map.get("comId");
        String id = map.get("id");
        System.out.println(comId+"***********************"+id);
        String content = QueryLogistics.queryOrder(id,comId);
        return content;
    }

}
