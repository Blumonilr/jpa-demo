package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired UserRepository urepo;
	
	/**
	 * 关于save方法，若数据库中有主键相等的对象就update，否则insert
	 * @param user
	 * @return
	 */
	public User addUser(User user){
		return urepo.save(user);
	}
	
	public User updateUser(User user){
		return urepo.save(user);
	}
	
	public User findById(long id){
		return urepo.findById(id).get();
	}
	
	public void delete(long id){
		urepo.deleteById(id);
	}
	
	public List<User>my_find(String name,int age){
		return urepo.my_find(name, age);
	}
}
