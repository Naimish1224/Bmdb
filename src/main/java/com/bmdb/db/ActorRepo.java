package com.bmdb.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bmdb.business.Actor;
import com.bmdb.business.Credit;


public interface ActorRepo extends CrudRepository<Actor, Integer> {
	List<Actor> findAllByActorId(String firstname, String lastname);

}