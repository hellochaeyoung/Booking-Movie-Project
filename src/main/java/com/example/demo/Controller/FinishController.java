package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Booking;
import com.example.demo.Model.Movie;
import com.example.demo.dto.SeatsDTO;
import com.example.demo.mapper.BookingMapper;
import com.example.demo.mapper.SeatsMapper;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RequestMapping("/movie")
@RestController
public class FinishController {

	private SeatsMapper seatsMapper;
	private BookingMapper bookingMapper;
	private Movie movie;
	private SeatsDTO seat;
	
	public FinishController(SeatsMapper seatsMapper, BookingMapper bookingMapper) {
		super();
		this.seatsMapper = seatsMapper;
		this.bookingMapper = bookingMapper;
	}

	//예매 확정 후 남은 좌석 업데이트, 나중에 동작하면 실행해보기
	//finishController
	@PutMapping("/finish")
	public int updateRestSeats(@RequestParam("restSeats") int restSeats, @RequestParam("time") String time) {
		
		System.out.println("**************");
		return seatsMapper.updateRestSeats(restSeats, time);
	}
	
	
	
	

	//예매 정보 파라미터로 전달해 디비에 insert
	//finishController
	//총 금액은 client에서 계산해 보내는 걸로.
	@PostMapping("/finish")
	public int insertBooking(@RequestParam("movieName") String movieName, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("time") String time, @RequestParam("people") int people, @RequestParam("seatNumber") String seatNumber, 
			@RequestParam("prices") int prices, @RequestParam("hallNumber") int hallNumber) {

		System.out.println("&&&&&&&&&&&&&&&&");
		return bookingMapper.insertBooking(phoneNumber, movieName, time, people, seatNumber, prices, hallNumber);
	}

}
