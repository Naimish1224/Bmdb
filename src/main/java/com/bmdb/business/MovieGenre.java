package com.bmdb.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class MovieGenre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "movieID")
	private Movie movie;
	@ManyToOne
	@JoinColumn(name = "genreID")
	private Genre genre;
	@Override
	public String toString() {
		return "MovieGenre [id=" + id + ", movie=" + movie + ", genre=" + genre + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public MovieGenre(int id, Movie movie, Genre genre) {
		super();
		this.id = id;
		this.movie = movie;
		this.genre = genre;
	}
	public MovieGenre() {
		super();
	}
	
}
