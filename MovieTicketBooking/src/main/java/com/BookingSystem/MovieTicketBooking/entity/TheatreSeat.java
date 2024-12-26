package com.BookingSystem.MovieTicketBooking.entity;

import com.BookingSystem.MovieTicketBooking.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "THEATRE_SEATS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TheatreSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;
}
