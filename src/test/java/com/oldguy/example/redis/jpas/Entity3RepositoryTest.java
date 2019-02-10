package com.oldguy.example.redis.jpas;

import com.oldguy.example.dao.redis.entities.Entity2;
import com.oldguy.example.dao.redis.entities.Entity3;
import com.oldguy.example.dao.redis.jpas.Entity2Repository;
import com.oldguy.example.dao.redis.jpas.Entity3Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Entity3RepositoryTest {


	@Autowired
	private Entity3Repository entity3Repository;

	@Test
	public void testSave(){

		Entity2 entity2 = new Entity2();

		entity2.setName("hh");
		entity2.setId("67867");

		Entity3 entity3 = new Entity3();
		entity3.setEntity3("test....");
		entity3.setUsername("测试");

		List<Entity2> list = new ArrayList<>();
		list.add(entity2);
		entity3.setEntity2List(list);

		entity3Repository.save(entity3);

	}
}

