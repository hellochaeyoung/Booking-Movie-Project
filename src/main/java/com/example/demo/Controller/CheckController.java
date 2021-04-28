package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Booking;
import com.example.demo.mapper.BookingMapper;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RequestMapping("/movie")
@RestController
public class CheckController {

	private BookingMapper bookingMapper;

	public CheckController(BookingMapper bookingMapper) {
		super();
		this.bookingMapper = bookingMapper;
	}

	// 예매 정보 가져오기
	// checkController
	@GetMapping("/check/{phoneNumber}")
	public List<Booking> getBooking(@PathVariable("phoneNumber") String phoneNumber) {
		System.out.println(phoneNumber);
		System.out.println("*****************");
		return bookingMapper.getBooking(phoneNumber);
	}

	

}
