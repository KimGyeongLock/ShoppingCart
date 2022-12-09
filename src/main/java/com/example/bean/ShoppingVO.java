package com.example.bean;

import java.util.Date;

public class ShoppingVO {
	private int ItemID;
	private String ItemName;
	private String Shoppingmall;
	private int Price;
	private int cnt;
	private int discountPrice;
	private int discount;
	private int delivery;
	private int totalPrice;
	private Date regdate;

	public int getItemID() {
		return ItemID;
	}

	public void setItemID(int itemID) {
		ItemID = itemID;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getShoppingmall() {
		return Shoppingmall;
	}

	public void setShoppingmall(String shoppingmall) {
		Shoppingmall = shoppingmall;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getDiscount() {
		double temp=(getPrice()-getDiscountPrice()*1.0)/getPrice()*100;
		System.out.println(temp);
		return (int)temp;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}