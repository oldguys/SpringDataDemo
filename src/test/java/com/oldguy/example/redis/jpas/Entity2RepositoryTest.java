package com.oldguy.example.redis.jpas;

import com.oldguy.example.dao.redis.entities.Entity2;
import com.oldguy.example.dao.redis.jpas.Entity2Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Entity2RepositoryTest {


	@Qualifier("entity2Repository")
	@Autowired
	private Entity2Repository entity2Repository;

	@Test
	public void testSave(){

		Entity2 entity2 = new Entity2();

		entity2.setName("hh");
		entity2.setId("67867");

		entity2Repository.save(entity2);

	}
}

