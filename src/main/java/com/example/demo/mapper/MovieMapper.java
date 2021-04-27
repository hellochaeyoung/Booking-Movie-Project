package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.Model.Movie;
import com.example.demo.dto.NowSeatsDTO;

@Mapper
public interface MovieMapper {
	
	//웹페이지에서 선택한 영화 이름으로 정보 가져오기
	@Select("SELECT DISTINCT movie_name, m.movie_id, hall_number, seat_price FROM theater th, time t, movie m WHERE m.theater_id = th.theater_id and m.movie_id = t.movie_id and m.movie_name = #{movieName}")
	Movie getMovie(@Param("movieName") String movieName);

	@Select("SELECT th.total_seats, t.rest_seats FROM movie m, theater th, time t WHERE m.theater_id = th.theater_id and m.movie_id = t.movie_id and m.movie_name = #{movieName} and t.time= #{time}")
	NowSeatsDTO getRests(@Param("movieName") String movieName, @Param("time") String time);
	
	//각 영화의 상영시간 종류 가져오기
	//버튼으로 만들기
	@Select("SELECT time FROM movie m, time t WHERE m.movie_id = t.movie_id and m.movie_name = #{movieName}")
	List<String> getMovieTimes(@Param("movieName") String movieName);
	
	
	
	
	/*
	//상영관, 전체좌석 가져오기
	@Select("SELECT hall_number, total_seats FROM theater WHERE theater_id = #{theaterID}")
	String getMovieTheater(@Param("theaterId") String theaterId);
	
	//상영시간, 잔여좌석 가져오기
	@Select("SELECT time, rest_seats FROM time WHERE movie_id = #{movieID}")
	List<String> getMovieTime(@Param("movieID") String movieId);
	//DB int -> String 변경 필요*/
	
}