package com.dyh.fms.dao;

import com.dyh.fms.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
     List<User> findAll();
}
