package com.bmdb.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bmdb.business.Actor;
import com.bmdb.business.Movie;
import com.bmdb.db.ActorRepo;


@CrossOrigin
@RestController
@RequestMapping("/api/actors")
public class ActorController {
	
	@Autowired
	private ActorRepo actorRepo;

	@GetMapping("/")
	public Iterable<Actor> getAll() {
		return actorRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Actor> get(@PathVariable Integer id) {
		return actorRepo.findById(id);
	}
	
	@PostMapping("/")
	public Actor add(@RequestBody Actor actor) {
		return actorRepo.save(actor);
	}
	
	@PutMapping("/")
	public Actor update(@RequestBody Actor actor) {
		return actorRepo.save(actor);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		actorRepo.deleteById(id);
	}
	@GetMapping("/fandlname/{id}")
	public Iterable<Movie> getAllByRating(@PathVariable String rating) {
//		Optional<Movie> movie = movieRepo.findById(id);
		return movieRepo.findAllByMovieId(rating);
	}

}