package com.BookingSystem.MovieTicketBooking.service;

import com.BookingSystem.MovieTicketBooking.converter.MovieConverter;
import com.BookingSystem.MovieTicketBooking.entity.Movie;
import com.BookingSystem.MovieTicketBooking.exceptions.MovieAlreadyExsist;
import com.BookingSystem.MovieTicketBooking.repository.MovieRepository;
import com.BookingSystem.MovieTicketBooking.request.MovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequest movieRequest) {

        Movie movieByName = movieRepository.findByMovieName(movieRequest.getMovieName());
        if (movieByName.getMovieName() != null && movieByName.getLanguage().equals(movieRequest.getLanguage())) {

            throw new MovieAlreadyExsist();

        }
        Movie movie = MovieConverter.movieDtoToMovie(movieRequest);
        movieRepository.save(movie);
        return "Movie has been added successfully";

    }
}
