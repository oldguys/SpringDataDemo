package com.oldguy.example.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@Configuration
@EnableRedisRepositories(basePackages="com.oldguy.example.dao.redis.jpas")
public class RedisConfiguration {
}
