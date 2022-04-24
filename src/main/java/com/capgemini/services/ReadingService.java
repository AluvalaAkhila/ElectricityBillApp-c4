package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.IdAlreadyExistsException;
import com.capgemini.exception.NoSuchReadingExistsException;
import com.capgemini.modules.Reading;
import com.capgemini.repository.ReadingRepository;

@Service
public class ReadingService {

	
	@Autowired(required=true)
	ReadingRepository repository;
	
	public List<Reading> getAllReading(){
		return repository.findAll();
	}
	
	public Reading getReadingById(long id)
	{
		return repository.findById(id).orElseThrow(()->new NoSuchReadingExistsException("No such reading present with id="+id));
	}
	
	public Reading addReading( Reading e)
	{
		Reading exisitingReading=repository.findById(e.getReadingId()).orElse(null);
		if(exisitingReading==null) {
			
			return repository.save(e);
			
		}
		else
		{
			throw new IdAlreadyExistsException("reading already exist with this readingId!!");
		}
		
	}
	
	public Reading updateReading(long id,Reading e)
	{
		Reading e1 = repository.findById(id).get();
		if(e1 !=null)
		{
			e1.setUnitsConsumed( e.getUnitsConsumed());
			e1.setReadingPhoto(e.getReadingPhoto());
			e1.setReadingDate(e.getReadingDate());
			e1.setPricePerUnits(e.getPricePerUnits());
			e1.setReadingForConnection(e.getReadingForConnection());

					
			return repository.save(e1);
		}
		else
			return e1;
	}
	
	public void deleteReading(long id)
	{
	Reading e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}

}
