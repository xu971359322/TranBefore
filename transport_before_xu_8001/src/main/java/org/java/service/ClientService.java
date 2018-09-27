package org.java.service;

import java.util.List;
import java.util.Map;

public interface ClientService {

    public List<Map<String ,Object>> selIntProvincial();

    public List<Map<String ,Object>> selProvincialMoney(Integer id);

    public List<Map<String,Object>> selProvincial();

    public Map<String,Object> selDetailMoney(Integer first,Integer second);
}
