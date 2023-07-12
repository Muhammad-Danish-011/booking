package com.booking.booking.repositary;
import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.booking.modal.Booking;




public interface BookingRepo extends JpaRepository<Booking,Long> {
    
}
