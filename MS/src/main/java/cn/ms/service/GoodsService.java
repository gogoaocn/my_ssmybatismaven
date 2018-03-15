package cn.ms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ms.params.Goods;
import cn.ms.util.mvc.Page;

public interface GoodsService {

	/**
	 * 获取货物分页
	 * @return
	 */
	Page<Goods> getGoodsPage(String queryContent, int pageSize, int pageNumber);
	
	/**
	 * 新增货物信息
	 */
	void insertGoods(Goods goods);
	
	/**
	 * 删除货物信息
	 */
	void deleteGoods(int goodsId);
	
	/**
	 * 更新货物信息
	 */
	void updateGoods(Goods goods);
	
	/**
	 * 获取货物信息 根据货物Id
	 */
	List<Goods> getGoodsBygoodsId(int goodsId);
}
