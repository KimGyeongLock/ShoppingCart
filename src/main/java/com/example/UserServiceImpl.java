package com.example;

import com.example.bean.UserVO;
import com.example.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;
    public UserVO getUser(UserVO vo) {
        System.out.println("록인"+userDAO.getUser(vo));
        return userDAO.getUser(vo);
    }
}
