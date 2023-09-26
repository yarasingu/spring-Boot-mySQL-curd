package com.yarisingu.curdoperations.controller;

//import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yarisingu.curdoperations.dto.PgmanDto;
import com.yarisingu.curdoperations.helper.ResponseStructure;
import com.yarisingu.curdoperations.service.PgmanService;

@RestController
public class PgmanController {

    @Autowired
	PgmanService service;

    @PostMapping("/pgman")
	public ResponseEntity<ResponseStructure<PgmanDto>> savePgman(@RequestBody PgmanDto pgmanDto) {
		return new ResponseEntity<ResponseStructure<PgmanDto>>(service.savePgman(pgmanDto), HttpStatus.CREATED);
	}
	
	@PostMapping("/pgmans")
	public ResponseEntity<ResponseStructure<List<PgmanDto>>> saveAllPgmans(@RequestBody List<PgmanDto> pgmanDtos) {
		return new ResponseEntity<ResponseStructure<List<PgmanDto>>>(service.savePgmans(pgmanDtos), HttpStatus.CREATED);
	}

    @GetMapping("/pgmans")
	public ResponseEntity<ResponseStructure<List<PgmanDto>>> getPgmans() {
		return new ResponseEntity<ResponseStructure<List<PgmanDto>>>(service.getAllPgmans(), HttpStatus.FOUND);
	}
	
	@GetMapping("/pgmans/name/{name}")
	public ResponseEntity<ResponseStructure<List<PgmanDto>>> getPgmansByName(@PathVariable String name) {
		return new ResponseEntity<ResponseStructure<List<PgmanDto>>>(service.getPgmanByName(name), HttpStatus.FOUND);
	}
	
	@GetMapping("/pgman/email/{email}")
	public ResponseEntity<ResponseStructure<PgmanDto>> getPgmanByEmail(@PathVariable String email) {
		return new ResponseEntity<ResponseStructure<PgmanDto>>(service.getPgmanByEmail(email), HttpStatus.FOUND);
	}
	
	@GetMapping("/Pgman/id/{id}")
	public ResponseEntity<ResponseStructure<PgmanDto>> getPgmanById(@PathVariable int id) {
		return new ResponseEntity<ResponseStructure<PgmanDto>>(service.getPgmanById(id), HttpStatus.FOUND);
	}
	
	@GetMapping("/Pgmans/rooms/{roomNo}")
	public ResponseEntity<ResponseStructure<List<PgmanDto>>> getPgmansByRoomNo(@PathVariable int roomNo) {
		return new ResponseEntity<ResponseStructure<List<PgmanDto>>>(service.getPgmansByRoomNo(roomNo), HttpStatus.FOUND);
	}
	
	// @GetMapping("/Pgmans/join/{dateJoin}/end/{dateEnd}")
	// public ResponseEntity<ResponseStructure<List<PgmanDto>>> getStudentsByJoinAndEnd(@PathVariable Date dateJoin,@PathVariable Date dateEnd) {
	// 	return new ResponseEntity<ResponseStructure<List<PgmanDto>>>(service.getStudentsByJoinAndEnd(dateJoin,dateEnd), HttpStatus.FOUND);
	// }
	
	@DeleteMapping("/pgman/{id}")
	public ResponseEntity<ResponseStructure<String>> deletePgmanById(@PathVariable int id) {
		return new ResponseEntity<ResponseStructure<String>>(service.deletePgmanById(id), HttpStatus.OK);
	}
	
	@PutMapping("/pgman")
	public ResponseEntity<ResponseStructure<PgmanDto>> updatePgman(@RequestBody PgmanDto pgmanDto) {
		return new ResponseEntity<ResponseStructure<PgmanDto>>(service.updatePgman(pgmanDto), HttpStatus.CREATED);
	}
	
	@PatchMapping("/pgman/{id}")
	public ResponseEntity<ResponseStructure<PgmanDto>> updatePgman(@RequestBody PgmanDto pgmanDto,@PathVariable int id) {
		return new ResponseEntity<ResponseStructure<PgmanDto>>(service.updatePgman(pgmanDto,id), HttpStatus.CREATED);
	}


}
