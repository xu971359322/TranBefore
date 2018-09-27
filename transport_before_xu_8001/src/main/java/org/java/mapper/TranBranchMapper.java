package org.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.TranBranch;

import java.util.List;

@Mapper
public interface TranBranchMapper {
    int deleteByPrimaryKey(String bId);

    int insert(TranBranch record);

    int insertSelective(TranBranch record);

    TranBranch selectByPrimaryKey(String bId);

    int updateByPrimaryKeySelective(TranBranch record);

    int updateByPrimaryKey(TranBranch record);

    List<TranBranch> selAllBranch();
}