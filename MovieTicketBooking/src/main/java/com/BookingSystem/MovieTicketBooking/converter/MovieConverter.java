package com.BookingSystem.MovieTicketBooking.converter;

import com.BookingSystem.MovieTicketBooking.entity.Movie;
import com.BookingSystem.MovieTicketBooking.request.MovieRequest;

public class MovieConverter {

    public static Movie movieDtoToMovie(MovieRequest movieRequest){
        Movie movie = Movie.builder()
                .movieName(movieRequest.getMovieName())
                .duration((double) movieRequest.getDuration())
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .releaseDate(movieRequest.getReleaseDate())
                .rating(movieRequest.getRating())
                .build();

        return movie;
    }
}