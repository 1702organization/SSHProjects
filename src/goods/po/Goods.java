package goods.po;

import java.io.Serializable;

public class Goods implements Serializable{
	
	private int id ;//商品编号
	private String goodsName;//商品名字
	private int goodsKind;//商品种类
	private double goodsPrice;//商品价格
	private int goodsNumble;//商品存库数量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsKind() {
		return goodsKind;
	}
	public void setGoodsKind(int goodsKind) {
		this.goodsKind = goodsKind;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsNumble() {
		return goodsNumble;
	}
	public void setGoodsNumble(int goodsNumble) {
		this.goodsNumble = goodsNumble;
	}
	
}
