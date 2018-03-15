package cn.ms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ms.params.Goods;
import cn.ms.service.GoodsService;
import cn.ms.util.mvc.Page;

/**
 * 货物信息控制层 2018-1-22
 * @author yzw09
 *
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	/**
	 * 获取货物信息分页
	 * @return
	 */
	@RequestMapping("/getGoodsPage")
	@ResponseBody
	public Page<Goods> getGoodsPage(String queryContent, Integer pageSize, Integer pageNumber,
			HttpServletRequest ruquest){
		Page<Goods> page = this.goodsService.getGoodsPage(queryContent, pageSize, pageNumber);
		return page;
		
	}
	
	/**
	 * 新增货物信息
	 */
	@RequestMapping("/insertGoods")
	@ResponseBody
	public int insertGoods(Goods goods){
		try {
			this.goodsService.insertGoods(goods);
		} catch (Exception e) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * 删除货物信息
	 */
	@RequestMapping("/deleteGoods")
	@ResponseBody
	public int deleteGoods(Integer goodsId){
		try {
			this.goodsService.deleteGoods(goodsId);
		} catch (Exception e) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * 删除货物信息
	 */
	@RequestMapping("/updateGoods")
	@ResponseBody
	public int updateGoods(Goods goods){
		try {
			this.goodsService.updateGoods(goods);
		} catch (Exception e) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * 获取货物信息 根据货物ID
	 */
	@RequestMapping("/getGoodsBygoodsId")
	@ResponseBody
	public List<Goods> getGoodsBygoodsId(Integer goodsId){
			return this.goodsService.getGoodsBygoodsId(goodsId);
	}
}
