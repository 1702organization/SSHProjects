package goods.Service;

import java.util.List;

import goods.DAO.GoodsMapper;
import goods.po.Goods;

public interface GoodsService {
	void insertGoods(Goods goods) ;
	List<Goods> selectAllGoods();
	void updateGoods(Goods goods);
	Goods selectOne(int id);
	void deleteGoods(int id);
}
