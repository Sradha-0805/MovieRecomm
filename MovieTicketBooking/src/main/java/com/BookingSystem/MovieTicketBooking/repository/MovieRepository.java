package com.BookingSystem.MovieTicketBooking.repository;

import com.BookingSystem.MovieTicketBooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findByMovieName(String name);
}
