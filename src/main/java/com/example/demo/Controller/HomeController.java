package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Movie;
import com.example.demo.dto.NowSeatsDTO;
import com.example.demo.mapper.MovieMapper;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RequestMapping("/movie")
@RestController
public class HomeController {

	private MovieMapper mapper;	
	
	public HomeController(MovieMapper mapper) {
		this.mapper = mapper;
	}
	
	//기본 영화정보 가져오기 -> 나중에 페이지에 뿌려주면됨
	//homeController
	
	@GetMapping("/{movieName}")
	public Movie getMovie(@PathVariable("movieName") String movieName) {
		return mapper.getMovie(movieName);
	}
	
	@PostMapping("/{movieName}")
	public NowSeatsDTO getRests(@RequestParam("movieName") String movieName, @RequestParam("time") String time) {
		return mapper.getRests(movieName, time);
	}
	
	
	
	
	
}
