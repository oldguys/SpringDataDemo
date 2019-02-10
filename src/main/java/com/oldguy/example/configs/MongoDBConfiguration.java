package com.oldguy.example.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@EnableMongoRepositories(basePackages="com.oldguy.example.dao.mongodb.jpas")
@Configuration
public class MongoDBConfiguration {
}
