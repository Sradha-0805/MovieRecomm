package com.BookingSystem.MovieTicketBooking.request;

import com.BookingSystem.MovieTicketBooking.enums.Genre;
import com.BookingSystem.MovieTicketBooking.enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Genre genre;
    private Date releaseDate;
    private float duration;
    private double rating;
    private Language language;
}
