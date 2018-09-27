package org.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.TranOrder;

@Mapper
public interface TranOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TranOrder record);

    int insertSelective(TranOrder record);

    TranOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TranOrder record);

    int updateByPrimaryKey(TranOrder record);
}