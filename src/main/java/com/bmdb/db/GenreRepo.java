package com.bmdb.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bmdb.business.Genre;

public interface GenreRepo extends CrudRepository<Genre, Integer> {

	List<Genre> findAllByGenreId(int id);
}