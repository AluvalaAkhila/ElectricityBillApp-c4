package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return repository.findById(id).get();
	}
	
	public Reading addReading( Reading e)
	{
		return repository.save(e);
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
