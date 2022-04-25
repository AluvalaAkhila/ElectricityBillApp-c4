package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.ConnectionIdNotExistsException;
import com.capgemini.exception.IdAlreadyExistsException;
import com.capgemini.modules.Connection;
import com.capgemini.repository.ConnectionRepository;

@Service

public class ConnectionService {
	
	@Autowired(required=true)
	ConnectionRepository repository;
	
	public List<Connection> getAllConnection(){
		return repository.findAll();
	}
	
	public Connection getConnectionById(long id)
	{
		return repository.findById(id).orElseThrow(()->new ConnectionIdNotExistsException("No such connection id present="+id));
	}
	
	public Connection addConnection( Connection e) throws Exception
	{
		if(!(e.connectionId >= 100000 && e.connectionId <= 999999))
		{
			throw new Exception("Invalid connectionId, connectionId should be 6 digit");
		}
		
		if(!(e.consumerNumber >= 10000 && e.consumerNumber <= 99999))
		{
			throw new Exception("Invalid consumerNumber, consumerNumber should be 5 digit");
		}
		
		Connection exisitingConnection=repository.findById(e.getConnectionId()).orElse(null);
		if(exisitingConnection==null) {
			
			return repository.save(e);
			
		}
		else
		{
			throw new IdAlreadyExistsException("Customer already exist with this Id!!");
		}
		
	}

	
	
	public Connection updateConnection(long id,Connection e)
	{
		Connection e1 = repository.findById(id).get();
		if(e1 !=null)
		{
			e1.setConsumerNumber( e.getConsumerNumber());
			e1.setApplicationDate(e.getApplicationDate());
			e1.setConnectionDate(e.getConnectionDate());
			e1.setConnectionType(e.getConnectionType());
			e1.setConnectionAddress(e.getConnectionAddress());
			e1.setConnectionStatus(e.isConnectionStatus());
			e1.setCustomerConnection(e.getCustomerConnection());
					
			return repository.save(e1);
		}
		else
			return e1;
	}
	
	public void deleteConnection(long id)
	{
		
		
		
	Connection e1 = repository.findById(id).get();
	
	if(e1 ==null)
	{
		System.out.println("The id value you entered is not there in table.So deliton is not possible");
	}
	else
		repository.delete(e1);
	    System.out.println("deletion sucessfull");
	}


}
