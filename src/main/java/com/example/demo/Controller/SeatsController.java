package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Movie;
import com.example.demo.dto.SeatsDTO;
import com.example.demo.mapper.SeatsMapper;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RequestMapping("/movie")
@RestController
public class SeatsController {
	
	private SeatsMapper mapper;
	
	public SeatsController(SeatsMapper mapper) {
		this.mapper = mapper;
	}
	
	// 전체좌석(행, 열), 남은좌석 그리기 위해 값 가져오기
	//seatController
	@GetMapping("/seat")
	public SeatsDTO getRestSeats(@RequestParam("movieName") String movieName, @RequestParam("time") String time ) {
		System.out.println(movieName);
		System.out.println(time);
		return mapper.getRestSeats(movieName, time);
	}
	
	
	
	

}
