package cn.ms.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ms.dao.GoodsDao;
import cn.ms.params.Goods;
import cn.ms.service.GoodsService;
import cn.ms.util.mvc.Page;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao goodsDao;
	
	/**
	 * 获取货物信息分页
	 * @return
	 */
	public Page<Goods> getGoodsPage(String queryContent, int pageSize, int pageNumber) {
		
		//获取货物信息总数量（条数）
		int count = this.goodsDao.reCount(queryContent);
		//计算此时查询的范围limit #{stratRow},#{endRow},根据pageSize pageNumber
		int stratRow = pageNumber-1;
		int endRow = pageSize;
		
		List<Goods> list = this.goodsDao.getGoodsPage(queryContent, stratRow, endRow);
		Page<Goods> page = new Page<Goods>();
		page.setPage(pageNumber);
		page.setRows(list);
		page.setTotalCount(list.size());
		page.setTotal(count);
		return page;
	}
	
	/**
	 * 新增货物信息
	 */
	public void insertGoods(Goods goods) {
		this.goodsDao.insertGoods(goods);
	}
	
	/**
	 * 删除货物信息
	 */
	public void deleteGoods(int goodsId) {
		this.goodsDao.deleteGoods(goodsId);
	}
	
	/**
	 * 更新货物信息
	 */
	public void updateGoods(Goods goods) {
		this.goodsDao.updateGoods(goods);
		
	}
	
	/**
	 * 获取货物信息 根据毫无ID
	 */
	public List<Goods> getGoodsBygoodsId(int goodsId) {
		return this.goodsDao.getGoodsBygoodsId(goodsId);
	}

}
