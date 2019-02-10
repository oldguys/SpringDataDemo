package com.oldguy.example.dao.redis.entities;

import org.springframework.data.redis.core.RedisHash;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@RedisHash
public class Entity2 {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
