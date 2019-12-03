package com.example.demo6.mysql;

import com.example.demo6.mysql.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
    User Sel(int id);
}

