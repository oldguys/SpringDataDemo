package com.oldguy.example.dao.redis.jpas;

import com.oldguy.example.dao.redis.entities.Entity3;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@Repository
public interface Entity3Repository extends CrudRepository<Entity3,String> {

}
