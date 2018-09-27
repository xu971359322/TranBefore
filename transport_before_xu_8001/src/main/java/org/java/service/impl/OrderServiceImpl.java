package org.java.service.impl;

import org.java.entity.TranBranch;
import org.java.entity.TranOrder;
import org.java.mapper.TranBranchMapper;
import org.java.mapper.TranOrderMapper;
import org.java.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TranOrderMapper orderMapper;

    @Autowired
    private TranBranchMapper branchMapper;

    //通过经纬度找出最近的点
    @Override
    public TranBranch selBranch(Map<String, Object> map) {
        double lng =(Double) map.get("lng");//输入的地址经度
        double lat =(Double) map.get("lat");//输入的地址纬度

        String id ="";
        double m =6378137.0;

        List<TranBranch> list = branchMapper.selAllBranch();
        Map<Double,String> mail =new HashMap<>();
        for (TranBranch branch : list) {
            double b = rad(lng) - rad(branch.getbX()); //经度之差
            double a = rad(lat) -rad(branch.getbY());//两点纬度之差
            double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                    + Math.cos(lat) * Math.cos(branch.getbY()) * Math.pow(Math.sin(b / 2), 2)));//计算两点距离的公式

            s = s * 6378137.0;//弧长乘地球半径（半径为米）

            s = Math.round(s * 10000d) / 10000d;//精确距离的数值
            mail.put(s,branch.getbId());
        }
        //取到距离最短的键
        for (Double aDouble : mail.keySet()) {
            System.out.println(aDouble);
            if(m>aDouble){
                m =aDouble;
            }
        }
        //返回最近的网点
        for (TranBranch branch : list) {
            if(branch.getbId().equals(mail.get(m))){
                return branch;
            }
        }

        return null;
    }


    @Override
    public void addOrder(TranOrder tranOrder) {
        orderMapper.insertSelective(tranOrder);
    }

    private static double rad(double d) {

        return d * Math.PI / 180.00; //角度转换成弧度

    }

}
