package com.yarisingu.curdoperations.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yarisingu.curdoperations.dto.PgmanDto;
import com.yarisingu.curdoperations.exception.DataNotFoundExecption;
import com.yarisingu.curdoperations.repository.PgmanRepository;

@Repository
public class PgmanDao {

    @Autowired
	PgmanRepository repository;

    public PgmanDto savePgman(PgmanDto pgman) {
		return repository.save(pgman);
	}

	public PgmanDto fetchPgman(long mobile) {
		return repository.findByMobile(mobile);
	}

	public PgmanDto fetchPgman(String email) {
		return repository.findByEmail(email);
	}

	public List<PgmanDto> savePgmans(List<PgmanDto> pgmans) {
		return repository.saveAll(pgmans);
	}

	public List<PgmanDto> getAllPgmans() {
		return repository.findAll();
	}

	public List<PgmanDto> getPgmanByName(String name) {
		return repository.findByName(name);
	}

	public PgmanDto fetchPgmanById(int id) {
		return repository.findById(id).orElseThrow(()->new DataNotFoundExecption("Data Not Found With Id- "+id));
	}

	public List<PgmanDto> getPgmanByRoomNo(int roomNo) {
		return repository.findByRoomNo(roomNo);
	}

	public List<PgmanDto> getPgmanByDateOfJoinAndEnd(Date join, Date end) {
		return repository.findByDateJoinAnddateEnd(join,end);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}


    
}
