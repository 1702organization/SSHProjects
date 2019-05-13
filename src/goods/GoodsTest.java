package goods;

import java.util.List;

import org.junit.Test;

import goods.Service.GoodsService;
import goods.Service.GoodsServiceImple;
import goods.po.Goods;

public class GoodsTest {
	public static void main(String [] args){
		GoodsService goodsService = new GoodsServiceImple();
		Goods goods = new Goods();
		goods.setGoodsKind(1);
		goods.setGoodsName("辣条");
		goods.setGoodsPrice(2.50);
		goods.setGoodsNumble(10);
		goodsService.insertGoods(goods);
		
		
	}
	@Test
	public void selectAllGoodsTest() {
		GoodsService goodsService = new GoodsServiceImple();
		List<Goods> list = goodsService.selectAllGoods();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsName());
		}
	}
}
