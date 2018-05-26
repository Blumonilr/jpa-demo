package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests {

	@Autowired UserService usv;
	
//	@Test
	public void contextLoads() {
		User u1=new User("qyc", 19);
		User u2=new User("jbs", 20);
		User u3=new User("other", 19);
		
		long id1=usv.addUser(u1).getId();
		long id2=usv.addUser(u2).getId();
		long id3=usv.addUser(u3).getId();
		
		System.out.println(usv.findById(id1));
		System.out.println(usv.findById(id2));
		System.out.println(usv.findById(id3));
		
	}
	
	@Test
	public void test1(){
//		User u3=new User("other", 19);
//		usv.addUser(u3);
		
		List<User>list=usv.my_find(null, 19);
		System.out.println(list.size());
		for(User u:list)
			System.out.println(u);
	}

}
