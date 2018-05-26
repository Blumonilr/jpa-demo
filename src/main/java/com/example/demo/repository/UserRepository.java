package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

/**
 * 
 * @author 17678
 * 将会从CrudRepository继承过来增删改查方法的实现，也可以自定义方法
 * 除了CrudRepository还有其他Repository
 */
public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * 若方法命名符合规范，会自动帮你实现
	 * @param age
	 * @return
	 */
	List<User>findByAge(int age);
	
	/**
	 * 也可以通关过sql语句自己定义方法，同样，也不需要亲自实现
	 * :param-name 表示参数来自于函数的参数
	 * 
	 * 我不知道为什么这里我只能用native query才不报错
	 * @param name
	 * @param age
	 * @return
	 */
	@Query(value="select * from users where name=?1 and age=?2",nativeQuery=true)
	List<User>my_find(String name,int age);
}
