package org.java.controller.util.LogisticsAPI.demo;


import org.java.controller.util.LogisticsAPI.util.MD5;

import java.util.HashMap;

public class QueryLogistics {

	
	public static String queryOrder(String orderId,String code){
		String param ="{\"com\":\""+code+"\",\"num\":\""+orderId+"\"}";
		String customer ="D30057C549718807FEDAFBD37584D13B";
		String key = "jKCDJJfW4666";
		String sign = MD5.encode(param+key+customer);
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("param",param);
		params.put("sign",sign);
		params.put("customer",customer);
		String resp=null;
		try {
			resp = new HttpRequest().postData("http://poll.kuaidi100.com/poll/query.do", params, "utf-8").toString();
			System.out.println(resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
}
