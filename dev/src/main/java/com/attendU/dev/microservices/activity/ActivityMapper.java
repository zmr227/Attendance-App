package com.attendU.dev.microservices.activity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.amazonaws.services.autoscaling.model.Activity;
import com.attendU.dev.microservices.bean.TokenBean;
import com.attendU.dev.microservices.bean.User;

import lombok.Getter;
import lombok.Setter;

@Mapper
public interface ActivityMapper {
	//get activity
	List<Map<String, Object>> selectTest();
	
	public int registerActivity(User user);
	
	public com.attendU.dev.microservices.bean.Activity getActivitybyId(long id);

	public com.attendU.dev.microservices.bean.Activity getActivitybyName(String username);
	
	//public List<User> getUserByActivityId(long id);
	
}

