package com.andrii.spring;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
