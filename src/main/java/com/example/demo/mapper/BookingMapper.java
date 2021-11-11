package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.Model.Booking;

@Mapper
public interface BookingMapper {

	//핸드폰 번호로 예매 내역 조회
	@Select("SELECT * FROM booking WHERE phone_number = #{phoneNumber}")
	List<Booking> getBooking(@Param("phoneNumber") String phoneNumber);
	
	
	//예매 내역 추가(customer_id, movie_name, time, people, seat_number, prices, hall_number
	@Insert("INSERT INTO booking (phone_number, movie_name, time, people, seat_number, prices, hall_number) VALUES (#{phoneNumber}, #{movieName}, #{time}, #{people}, #{seatNumber}, #{prices}, #{hallNumber})")
	int insertBooking(@Param("phoneNumber") String phoneNumber, @Param("movieName") String movieName,
			@Param("time") String time, @Param("people") int people, @Param("seatNumber") String seatNumber,
			@Param("prices") int prices, @Param("hallNumber") int hallNumber);
	
	@Select("SELECT count(*) FROM booking WHERE phone_number = #{phoneNumber}")
	int getCount(@Param("phoneNumber") String phoneNumber);
	 
}
