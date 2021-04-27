package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.dto.SeatsDTO;

@Mapper
public interface SeatsMapper {

	//시간 당 잔여 좌석 수, 상영관 행,열 가져오기
	@Select("SELECT rest_seats, total_seats, th.rows, th.cols FROM theater th, time t, movie m WHERE t.movie_id = m.movie_id and th.theater_id = m.theater_id and movie_name = #{movieName} and t.time = #{time}")
	SeatsDTO getRestSeats(@Param("movieName") String movieName, @Param("time") String time);

	//예매 시 잔여 좌석 수 업데이트
	@Update("UPDATE time SET rest_seats = #{restSeats} WHERE time = #{time}")
	int updateRestSeats(@Param("restSeats") int restSeats, @Param("time") String time);

	


}
