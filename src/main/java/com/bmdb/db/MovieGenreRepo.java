package com.bmdb.db;


import org.springframework.data.repository.CrudRepository;

import com.bmdb.business.MovieGenre;

public interface MovieGenreRepo extends CrudRepository<MovieGenre, Integer> {

}