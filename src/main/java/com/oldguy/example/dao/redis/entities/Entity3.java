package com.oldguy.example.dao.redis.entities;

import org.springframework.data.redis.core.RedisHash;

import java.util.Collections;
import java.util.List;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@RedisHash
public class Entity3 {

    private String id;

    private String username;

    private String entity3;

    List<Entity2> entity2List = Collections.emptyList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEntity3() {
        return entity3;
    }

    public void setEntity3(String entity3) {
        this.entity3 = entity3;
    }

    public List<Entity2> getEntity2List() {
        return entity2List;
    }

    public void setEntity2List(List<Entity2> entity2List) {
        this.entity2List = entity2List;
    }
}
