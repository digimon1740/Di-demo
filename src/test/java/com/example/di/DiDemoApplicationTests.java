package com.example.di;

import com.example.di.entity.Bird;
import com.example.di.entity.Chicken;
import com.example.di.entity.Penguin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiDemoApplicationTests {

//	@Autowired
//	private Chicken penguin;  //Chicken 타입으로 연결됩니다.
//
//	@Inject
//	private Penguin chicken; //Penguin 타입으로 연결됩니다.

	//@Resource
	//private Chicken penguin;  //penguin 타입으로 연결됩니다만, Chicken 클래스를 자료형으로 두었기에 캐스팅이 되지 않아 에러가 납니다

	@Resource
	private Bird penguin;      //penguin 타입으로 연결되어 호출해보면 penguin 클래스의 값을 호출하는 것을 볼 수 있습니다.있습니다

	@Test
	public void contextLoads() {
	}

	@Test
	public void injectionTest() {
		penguin.tweet();
		//chicken.tweet();
	}
}
