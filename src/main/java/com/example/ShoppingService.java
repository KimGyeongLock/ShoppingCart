package com.example;

import com.example.bean.ShoppingVO;

import java.util.List;

public interface ShoppingService {
    public int insertCart(ShoppingVO vo);
    public int deleteCart(int seq);
    public int updateCart(ShoppingVO vo);
    public ShoppingVO getCart(int seq);
    public List<ShoppingVO> getCartList();
}

