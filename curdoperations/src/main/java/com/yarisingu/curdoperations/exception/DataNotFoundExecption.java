package com.yarisingu.curdoperations.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DataNotFoundExecption extends RuntimeException {
	String message = "Data Not Found";
}