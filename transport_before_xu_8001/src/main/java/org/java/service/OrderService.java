package org.java.service;

import org.java.entity.TranBranch;
import org.java.entity.TranOrder;

import java.util.Map;

public interface OrderService {

    void addOrder(TranOrder tranOrder);

    TranBranch selBranch(Map<String,Object> map);
}
