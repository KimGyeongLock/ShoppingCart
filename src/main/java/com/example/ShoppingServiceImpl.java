package com.example;

import com.example.bean.ShoppingVO;
import com.example.dao.ShoppingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{

    @Autowired
    ShoppingDAO shoppingDAO;

    @Override
    public int insertCart(ShoppingVO vo) {
        return shoppingDAO.insertCart(vo);
    }

    @Override
    public int deleteCart(int seq) {
        return shoppingDAO.deleteCart(seq);
    }

    @Override
    public int updateCart(ShoppingVO vo) {
        return shoppingDAO.updateCart(vo);
    }

    @Override
    public ShoppingVO getCart(int seq) { return shoppingDAO.getCart(seq); }

    @Override
    public List<ShoppingVO> getCartList() {
        return shoppingDAO.getCartList();
    }
}
