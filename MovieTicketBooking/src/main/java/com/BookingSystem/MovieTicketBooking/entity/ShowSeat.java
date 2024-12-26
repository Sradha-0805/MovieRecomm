package com.BookingSystem.MovieTicketBooking.entity;

import com.BookingSystem.MovieTicketBooking.enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

import javax.sound.sampled.EnumControl;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SHOW_SEATS")
@Data
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Double price;
    private Boolean isAvailable;
    private Boolean isFoodContains;

    @ManyToOne
    @JoinColumn
    private Show show;
}
