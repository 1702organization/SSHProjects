package goods.DAO;

import java.util.List;

import goods.po.Goods;

public interface GoodsMapper {
	void insertGoods(Goods goods);
	List<Goods> selectAllGoods();
	void updateGoods(Goods goods);
	Goods selectOne(int id);
	void deleteOneGoods(int id);
}
