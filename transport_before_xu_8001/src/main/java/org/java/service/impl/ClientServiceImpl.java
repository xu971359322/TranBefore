package org.java.service.impl;

import org.java.mapper.WeightMapper;
import org.java.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private WeightMapper weightMapper;

    @Override
    public Map<String, Object> selDetailMoney(Integer first, Integer second) {
        return weightMapper.selDetailMoney(first,second);
    }

    @Override
    public List<Map<String, Object>> selProvincial() {
        return weightMapper.selProvincial();
    }

    @Override
    public List<Map<String, Object>> selIntProvincial() {
        return weightMapper.selIntProvincial();
    }

    @Override
    public List<Map<String, Object>> selProvincialMoney(Integer id) {
        return weightMapper.selProvincialMoney(id);
    }
}
