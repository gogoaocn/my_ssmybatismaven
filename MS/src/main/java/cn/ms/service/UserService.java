package cn.ms.service;
import java.util.List;  
import java.util.Map;

import cn.ms.params.User;
    
public interface UserService {  
      
	
	/**
	 * 登录验证
	 * @param userId
	 * @return 0表示验证成功 1表示验证失败
	 */
	int login(String userName, String password);
	
    public User getUserById(int userId);  
    
	public List<User> getAllUser();  
    
    public List<User> getUserList(Map<String,Object> params);
    
    public List<User> getUserByBatch(String ids);
  
    public void insertUser(User user);  
    
    public void insertUserByBatch(List<User> list);
    
    public void deleteUserById(Integer id);
    
    public void deleteUserByBatch(String[] id);
}  