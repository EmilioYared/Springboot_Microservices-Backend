package com.emilio.bookingservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingResponse {
    private Long BookingId;
    private long userId;
    private long eventId;
    private long ticketCount;
    private BigDecimal totalPrice;
}
