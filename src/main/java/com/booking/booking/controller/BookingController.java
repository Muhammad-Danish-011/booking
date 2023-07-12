package com.booking.booking.controller;
 import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

import com.booking.booking.modal.Booking;
import com.booking.booking.repositary.BookingRepo;

import java.util.List;
    
    @CrossOrigin("*")
    @RestController
    @RequestMapping("/Bookings")



public class BookingController {

    
        private final BookingRepo BookingRepository;
    
        @Autowired
        public BookingController(BookingRepo BookingRepository) {
            this.BookingRepository = BookingRepository;
        }
    
        @PostMapping("/add")
        public Booking addBooking(@RequestBody Booking Booking) {
            return BookingRepository.save(Booking);
        }
    
        @GetMapping("/all")
        public ResponseEntity<List<Booking>> getAllBookings() {
            List<Booking> Bookings = BookingRepository.findAll();
            return ResponseEntity.ok(Bookings);
        }
        @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAllBookings() {
        BookingRepository.deleteAll();
        return ResponseEntity.ok("All Bookings deleted successfully.");
    }
  
    




}
