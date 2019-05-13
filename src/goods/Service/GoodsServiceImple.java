package goods.Service;



import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import goods.DAO.GoodsMapper;
import goods.po.Goods;
/**
 * 
 * @author 汤金桂
 *
 */
public class GoodsServiceImple implements GoodsService{
	static SqlSessionFactory sessionFactory;
	static{
		try {
			sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertGoods(Goods goods) {
		SqlSession session = sessionFactory.openSession();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		goodsMapper.insertGoods(goods);
		session.commit();
		session.close();
	}
	@Override
	public List<Goods> selectAllGoods() {
		SqlSession session = sessionFactory.openSession();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		List<Goods> goodsList = goodsMapper.selectAllGoods();
		session.commit();
		session.close();
		return goodsList;
	}
	@Override
	public void updateGoods(Goods goods) {
		SqlSession session = sessionFactory.openSession();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		goodsMapper.updateGoods(goods);
		session.commit();
		session.close();
	}
	@Override
	public Goods selectOne(int id) {
		SqlSession session = sessionFactory.openSession();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		Goods goods = goodsMapper.selectOne(id);
		session.commit();
		return goods;
	}
	@Override
	public void deleteGoods(int id) {
		SqlSession session = sessionFactory.openSession();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		goodsMapper.deleteOneGoods(id);
		session.commit();
		session.close();
	}
}
