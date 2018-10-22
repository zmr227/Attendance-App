package com.attendU.dev.microservices.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class RoomConfig{
	@Getter@Setter
	private int id;
	
	@Getter@Setter
	private Scenarios sid;
	@Getter@Setter
	private boolean anonymous;
}