package com.yarisingu.curdoperations.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.yarisingu.curdoperations.dao.PgmanDao;
import com.yarisingu.curdoperations.dto.PgmanDto;
import com.yarisingu.curdoperations.exception.DataNotFoundExecption;
import com.yarisingu.curdoperations.helper.ResponseStructure;

@Service
public class PgmanService {

    @Autowired
	PgmanDao dao;

    public ResponseStructure<PgmanDto> savePgman(PgmanDto pgmanDto) {
        return null;
    }

    public ResponseStructure<List<PgmanDto>> savePgmans(List<PgmanDto> pgmanDtos) {
        return null;
    }

    public ResponseStructure<List<PgmanDto>> getAllPgmans() {
       List<PgmanDto> list = dao.getAllPgmans();
		if (list.isEmpty())
			throw new DataNotFoundExecption();
		else {
			ResponseStructure<List<PgmanDto>> structure = new ResponseStructure<List<PgmanDto>>();
			structure.setData(list);
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			return structure;
		}
    }

    public ResponseStructure<List<PgmanDto>> getPgmanByName(String name) {
        List<PgmanDto> list = dao.getPgmanByName(name);
		if (list.isEmpty())
			throw new DataNotFoundExecption("Data Not Found With Name- " + name);
		else {
			ResponseStructure<List<PgmanDto>> structure = new ResponseStructure<List<PgmanDto>>();
			structure.setData(list);
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			return structure;
		}
    }

    public ResponseStructure<PgmanDto> updatePgman(PgmanDto pgmanDto, int id) {
        return null;
    }

    public ResponseStructure<PgmanDto> updatePgman(PgmanDto pgmanDto) {
        return null;
    }

    public ResponseStructure<String> deletePgmanById(int id) {
        PgmanDto pgman = dao.fetchPgmanById(id);
		dao.delete(id);
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setData("Data Deleted with Id- " + pgman.getId());
		structure.setMessage("Data Deleted");
		structure.setStatus(HttpStatus.OK.value());
		return structure;
    }

    public ResponseStructure<PgmanDto> getPgmanByEmail(String email) {
        return null;
    }

    public ResponseStructure<PgmanDto> getPgmanById(int id) {
        return null;
    }

    public ResponseStructure<List<PgmanDto>> getPgmansByRoomNo(int roomNo) {
        return null;
    }

    // public ResponseStructure<List<PgmanDto>> getStudentsByJoinAndEnd(Date dateJoin, Date dateEnd) {
    //     return null;
    // }
    
}
