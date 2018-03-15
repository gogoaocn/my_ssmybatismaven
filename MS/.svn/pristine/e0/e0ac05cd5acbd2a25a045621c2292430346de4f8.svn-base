package cn.ms.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ms.dao.GoodsDao;
import cn.ms.dao.UserDao;
import cn.ms.params.Goods;
import cn.ms.params.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests{
	@Resource  
    private UserDao userDao;  
	
	@Resource  
    private GoodsDao goodsDao;  
	
	@Test
	public void insertUserTest(){
		User user = new User();
		user.setName("test");
		user.setPassword("test");
		user.setAge(70);
		userDao.insertUser(user);
	}
	
	@Test
	public void getGoods(){
		Goods g = new Goods();
		g.setGoodsCode("eeeeee");
		g.setGoodsId(1);
		goodsDao.updateGoods(g);
		
	}
}
