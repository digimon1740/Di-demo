package com.example.di.entity;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements Bird {
	@Override
	public void tweet() {
		System.out.println("치킨");
	}
}
