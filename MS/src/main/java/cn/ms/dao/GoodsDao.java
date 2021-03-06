package cn.ms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ms.params.Goods;

public interface GoodsDao {

	/*
	 * 获取货物信息分页内容
	 */
	List<Goods> getGoodsPage(@Param("queryContent") String queryContent, @Param("stratRow")int stratRow, 
			@Param("endRow")int endRow); 
	
	/*
	 * 查询总条数
	 */
	int reCount(@Param("queryContent") String queryContent);
	
	/*
	 * 新增货物信息
	 */
	void insertGoods(Goods goods);
	
	/*
	 * 删除货物信息
	 */
	void deleteGoods(@Param("goodsId") int goodsId);
	
	/*
	 * 更新货物信息
	 */
	void updateGoods(Goods goods);
	
	/*
	 * 货物货物信息根据货物ID
	 */
	List<Goods> getGoodsBygoodsId(@Param("goodsId") int goodsId);
	
}
