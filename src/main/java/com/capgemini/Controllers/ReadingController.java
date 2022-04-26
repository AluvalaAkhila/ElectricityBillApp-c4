package com.capgemini.Controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Reading;
import com.capgemini.services.ReadingService;

@RestController
@RequestMapping("/rc")

public class ReadingController {

	@Autowired(required=true)
	ReadingService service;
	
	@RequestMapping(value="/reading",method=RequestMethod.GET)
	public List<Reading> getAllReading()
	{
		return  service.getAllReading();
	}
	
	@RequestMapping(value="/reading/{id}",method=RequestMethod.GET)
	public Reading getReadingById(@PathVariable long id)
	{
		return service.getReadingById(id);
	}
	
	
	@RequestMapping(value="/addreading",method=RequestMethod.POST)
	public Reading addReading( @RequestBody  Reading e)
	{
		return service.addReading(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Reading updateReading(@PathVariable long id,@RequestBody Reading e)
	{
		return service.updateReading(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteReading(@PathVariable long id)
	{
		service.deleteReading(id);
	}
	@GetMapping("/findMeterReadingByConsumerNumberAndBillDate/{consumerNumber}/{billDate}")
	public ResponseEntity<Object> findMeterReadingByConsumerNumberAndBillDate(@PathVariable("consumerNumber") Long consumerNumber,@RequestParam("billDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate billDate){
		return new ResponseEntity<Object>(service.findMeterReadingByConsumerNumberAndBillDate(consumerNumber,billDate),HttpStatus.OK);
	}

}
