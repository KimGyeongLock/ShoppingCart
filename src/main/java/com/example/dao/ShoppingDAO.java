package com.example.dao;

import com.example.bean.ShoppingVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShoppingDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertCart(ShoppingVO vo) {
		int count = sqlSession.insert("Shopping.insertCart", vo);
		return count;
	}

	public int deleteCart(int seq) {
		int result = sqlSession.delete("Shopping.deleteCart", seq);
		return result;
	}

	public int updateCart(ShoppingVO vo) {
		int result = sqlSession.update("Shopping.updateCart", vo);
		return result;
	}

	public ShoppingVO getCart(int seq) {
		ShoppingVO one = sqlSession.selectOne("Shopping.getCart", seq);
		return one;
	}

	public List<ShoppingVO> getCartList(){
		List<ShoppingVO> list = sqlSession.selectList("Shopping.getCartList");
		return list;
	}
}