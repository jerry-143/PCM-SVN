package com.cg.ems.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionProjectCode {



	@ExceptionHandler(value= {ProjectCodeException.class})   //It will handle the exception when it occur during Runtime Execution.
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)		//Set the code for HttpStatus Response (Sends ExceptionHandler)
    public ProjectCodeException  exception(ProjectCodeException pcm) {
        
        String status =  pcm.getMsg();					// Getter from Exception class.
        System.out.println("In global exception class running");
        return new ProjectCodeException(status);
	
	

}


}
