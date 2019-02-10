package com.oldguy.example.dao.mongodb.jpas;

import com.oldguy.example.dao.mongodb.entities.Entity1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Date: 2019/2/10 0010
 * @Author: ren
 * @Description:
 */
@Repository
public interface Entity1Repository extends CrudRepository<Entity1,String> {

}
