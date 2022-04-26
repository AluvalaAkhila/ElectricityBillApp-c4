package com.capgemini.services;

import java.time.LocalDate;
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
	
	public Reading addReading( Reading e) throws Exception
	{
		if(!(e.readingId >= 10000 && e.readingId <= 99999))
		{
			throw new Exception("Invalid readingId, readingId should be 5 digit");
		}
		
		if(!e.readingPhoto.equalsIgnoreCase("Taken") && !e.readingPhoto.equalsIgnoreCase("NotTaken"))
		{
			throw new Exception("Invalid readingPhoto, it should contain only Taken and NotTaken");
		}
		
		if(!(e.pricePerUnits >=1 && e.pricePerUnits <= 10))
		{
			throw new Exception("Invalid pricePerUnits, pricePerUnits should be less than 10 ruppees");
		}
		
		if(!(e.unitsConsumed >= 0 && e.unitsConsumed <= 100000))
		{
			throw new Exception("Invalid unitsConsumed, unitsConsumed should be in the range 0 to 100000");
		}
		
		
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
	public Reading findMeterReadingByConsumerNumberAndBillDate(Long consumerNumber, LocalDate billDate)
	{
		return repository.findMeterReadingByConsumerNumberAndBillDate(consumerNumber,billDate);
	}
}