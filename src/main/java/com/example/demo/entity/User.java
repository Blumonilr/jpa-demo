package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author 17678
 * @Entity 声明为实体类
 * @Table 可以设置对应table的名字，默认为User
 */
@Entity
@Table(name="users")
public class User {

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	/**
	 * @Id 定义主键
	 * @GeneratedValue 表明自动生成主键，方法是GenerationType.AUTO
	 */
	@Id @GeneratedValue(strategy=GenerationType.AUTO) private long id;
	
	/**
	 * 剩下的属性默认映射到table的同名列
	 * 也可以使用@Column(name="xxx")指定
	 */
	private String name;
	private int age;
	
	/**
	 * 构造函数不需要id
	 * 
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
	}
	
	public String toString(){
		return String.format("User[id=%d , name=%s , age=%d]", id,name,age);
	}
}
