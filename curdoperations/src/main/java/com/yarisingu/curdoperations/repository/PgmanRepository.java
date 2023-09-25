package com.yarisingu.curdoperations.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarisingu.curdoperations.dto.PgmanDto;

public interface PgmanRepository extends JpaRepository<PgmanDto, Integer> {

    PgmanDto findByMobile(long mobile);

	PgmanDto findByEmail(String email);

	List<PgmanDto> findByName(String name);

	List<PgmanDto> findByRoomNo(int roomNo);

	List<PgmanDto> findByDateJoinAnddateEnd(Date dateJoin, Date dateEnd);

    
}
