package org.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeightMapper
{
    //查询网点省份
    @Select("SELECT * FROM tran_provincial \n" +
            "WHERE province_id IN (SELECT provincial_send FROM tran_weight_pay \n" +
            "GROUP BY provincial_send)")
    public List<Map<String,Object>> selIntProvincial();

    //根据网点查询重量价格
    @Select("SELECT w.weight_id,w.weight_first,weight_next,\n" +
            "(SELECT provincial FROM tran_provincial p WHERE p.province_id = w.provincial_receive) city\n" +
            "FROM tran_weight_pay w WHERE provincial_send = #{id}")
    public List<Map<String,Object>> selProvincialMoney(@Param("id")Integer id);

    @Select("select * from tran_provincial")
    public List<Map<String,Object>> selProvincial();

    @Select("SELECT * FROM tran_weight_pay WHERE provincial_send =#{first} AND provincial_receive =#{second}")
    public Map<String,Object> selDetailMoney(@Param("first")Integer first,@Param("second")Integer second);

}
