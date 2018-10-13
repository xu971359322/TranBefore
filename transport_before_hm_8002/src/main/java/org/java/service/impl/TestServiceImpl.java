package org.java.service.impl;

import org.java.dao.TestMapper;
import org.java.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper mapper;

    @Override
    public List<Map<String, Object>> loadUserALl() throws Exception {
        return mapper.loadUserALl();
    }
}

