package com.yarisingu.curdoperations.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yarisingu.curdoperations.helper.ResponseStructure;

@ControllerAdvice
public class MainExceptionHandler {

	@ExceptionHandler(ShouldNotRepeatExecption.class)
	public ResponseEntity<ResponseStructure<String>> handle(ShouldNotRepeatExecption execption)
	{
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setMessage("Data Should Not Repeat");
		structure.setData(execption.getMessage());
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DataNotFoundExecption.class)
	public ResponseEntity<ResponseStructure<String>> handle(DataNotFoundExecption execption)
	{
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setMessage("Data Not Found");
		structure.setData(execption.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}
}
