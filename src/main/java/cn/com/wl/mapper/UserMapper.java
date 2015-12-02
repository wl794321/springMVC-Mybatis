package cn.com.wl.mapper;


import cn.com.wl.entry.User;

import java.util.List;

public interface UserMapper {

	public User findUserById(int id) throws Exception;
	public List<User> findAll() throws Exception;
}
