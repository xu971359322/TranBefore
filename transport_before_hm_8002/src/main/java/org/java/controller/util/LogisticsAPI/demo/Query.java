package org.java.controller.util.LogisticsAPI.demo;


import org.java.controller.util.LogisticsAPI.util.MD5;

import java.util.HashMap;

public class Query {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		//http://api.kuaidi100.com/api?id=jKCDJJfW4666&com=zhongtong&nu=636263164901&show=0&muti=1&order=desc
		String param ="{\"com\":\"yunda\",\"num\":\"3955010322408\"}";
		String customer ="D30057C549718807FEDAFBD37584D13B";
		String key = "jKCDJJfW4666";
		String sign = MD5.encode(param+key+customer);
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("param",param);
		params.put("sign",sign);
		params.put("customer",customer);
		String resp;
		try {
			resp = new HttpRequest().postData("http://poll.kuaidi100.com/poll/query.do", params, "utf-8").toString();
			System.out.println(resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
