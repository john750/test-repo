package io.swagger.api;


import io.swagger.annotations.*;
import io.swagger.custom.Greeting;
import io.swagger.custom.ManageEmployee;
import io.swagger.models.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-17T20:46:57.785Z")

@Controller
public class DefaultApiController implements DefaultApi {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();



    public ResponseEntity<Void> rootGet() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    public ResponseEntity<Greeting> greetingGet(@RequestParam(value="name", defaultValue="World") String name) {
    	//ManageEmployee dm_manager=new ManageEmployee();
    	//dm_manager.init();
        
    	Greeting response_greeting=new Greeting(counter.incrementAndGet(), String.format(template, name));
        return new ResponseEntity<Greeting>(response_greeting, HttpStatus.OK);
    }
    
    public  ResponseEntity<String> greetingPost(@RequestBody String a) {
    	System.out.println(a);
		return new ResponseEntity<String>("new greeting created", HttpStatus.CREATED);
    	
    }
    
    public  ResponseEntity<Greeting> greetingGetID(@PathVariable("id") int id) {
    	return new ResponseEntity<Greeting>( new Greeting(id, "lolz"), HttpStatus.OK);
    	
    }
}
