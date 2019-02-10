package com.oldguy.example.mongo.jpas;

import com.oldguy.example.dao.mongodb.entities.Entity1;
import com.oldguy.example.dao.mongodb.jpas.Entity1Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Entity1RepositoryTest {


	@Autowired
	private Entity1Repository entity1Repository;

	@Test
	public void testSave(){

		Entity1 entity1 = new Entity1();

		entity1.setId("sss");
		entity1.setName("测试。。。。");

		entity1Repository.save(entity1);

	}
}

