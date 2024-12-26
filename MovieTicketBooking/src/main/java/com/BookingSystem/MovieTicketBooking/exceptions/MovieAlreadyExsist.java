package com.BookingSystem.MovieTicketBooking.exceptions;

public class MovieAlreadyExsist extends RuntimeException {
    private static final long serialVersionUID = 87214071728310561L;

    public MovieAlreadyExsist(){
        super("Movie already exsists with same name and language");
    }
}
