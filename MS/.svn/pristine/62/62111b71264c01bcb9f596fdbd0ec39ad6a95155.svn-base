package cn.ms.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;  
import java.util.Map;
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;

import cn.ms.dao.UserDao;
import cn.ms.params.User;
import cn.ms.service.UserService;  
  
@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;  
      
    public User getUserById(int userId) {  
        return userDao.queryByPrimaryKey(userId);  
    }  
  
    public void insertUser(User user) {  
        userDao.insertUser(user);  
    }  
  
    public List<User> getAllUser() {  
        return userDao.getAllUser();  
    }

	public List<User> getUserList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertUserByBatch(List<User> list) {
		// TODO Auto-generated method stub
		userDao.insertUserByBatch(list);
	}

	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteByPrimaryKey(id);
	}

	public void deleteUserByBatch(String[] id) {
		// TODO Auto-generated method stub
		Map<String, Object> params = new HashMap<String, Object>();
		List<String> ids = new ArrayList<String>();
		for(int i = 0; i < id.length; i++){
			ids.add(id[i]);
		}
		params.put("iList", id);
		userDao.deleteUserByBatch(params);
	}

	public List<User> getUserByBatch(String ids) {
		List<String> list = new ArrayList<String>();
		String[] str = ids.split(",");
		for(int i = 0; i < str.length; i++){
			list.add(str[i]);
		}
		return userDao.queryUserByBatch(list);
	}
	
	/**
	 * 登录验证
	 * @param userId
	 * @return 0表示验证成功 1表示验证失败
	 */
	public int login(String userName, String password) {
		return userDao.getLogin(userName, password);
	}  
  
}  













