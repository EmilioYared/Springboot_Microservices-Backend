package com.emilio.microservices.inventoryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
public class Event {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "total_capacity")
    private long totalCapacity;

    @Column(name = "left_capacity")
    private long leftCapacity;

    //a venue can have many events
    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @Column(name = "ticket_price")
    private BigDecimal ticketPrice;
}
