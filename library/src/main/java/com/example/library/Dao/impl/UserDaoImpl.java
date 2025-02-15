package com.example.library.Dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.example.library.Dao.UserDao;
import com.example.library.Model.User;
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    @Override
    public Integer createUser(User user) {
        String sql = "INSERT INTO user(id, phone, password, userName, regist_time, exit_time) " +
                "VALUES (:id, :phone, :password, :userName, :registTime, :exitTime)";

        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        map.put("phone", user.getPhone());
        map.put("password", user.getPassword());
        map.put("userName", user.getUserName());
        Date now = new Date();
        map.put("registTime", now);
        map.put("exitTime", user.getExitTime());

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int userId = keyHolder.getKey().intValue();

        return userId;        
    }

    @Override
    public Boolean loginUser(User user) {
        String sql = "SELECT COUNT(*) FROM user WHERE phone = :phone AND password = :password";

        Map<String, Object> map = new HashMap<>();
        map.put("phone", user.getPhone());
        map.put("password", user.getPassword());
    
        Integer count = namedParameterJdbcTemplate.queryForObject(sql, map, Integer.class);
    
        return count != null && count > 0;     
    }
}
