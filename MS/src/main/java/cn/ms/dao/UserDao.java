package cn.ms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.ms.params.User;


public interface UserDao {
    public User queryByPrimaryKey(Integer id);  
    
    public List<User> getAllUser();  
    
    public List<User> queryUserByBatch(List<String> list);  
      
    public void insertUser(User user);  
      
    public void insertUserByBatch(List<User> list);  
      
    public void deleteByPrimaryKey(Integer id);  
      
    public void deleteUserByBatch(Map<String,Object> params);  
      
    public void updateByPrimaryKey(Integer id);  
  
    int getLogin(@Param("userName")String userName, @Param("password")String password);
    
}
