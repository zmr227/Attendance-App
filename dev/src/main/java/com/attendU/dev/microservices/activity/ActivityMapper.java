package com.attendU.dev.microservices.activity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.attendU.dev.microservices.bean.Activity;

@Mapper
public interface ActivityMapper {
	
    public Integer createActivity(Activity activity);
	
	public Void removeActivity(Long aid);
	
	public Void updateActivity(Long aid, String name, Date date, Long acid);

	public Activity getActivityById(Long aid);
	
	public Activity getActivitybyName(String name);

	public List<Map<String, Object>> getActivityByConfigId(Long acid);
		
}

