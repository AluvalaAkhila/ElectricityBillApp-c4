package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.modules.Connection;
import com.capgemini.repository.ConnectionRepository;

@Service

public class ConnectionService {
	
	@Autowired(required=true)
	ConnectionRepository repository;
	
	public List<Connection> getAllConnection(){
		return repository.findAll();
	}
	
	public Connection getConnectionById(int id)
	{
		return repository.findById(id).get();
	}
	
	public Connection addConnection( Connection e)
	{
		return repository.save(e);
	}
	
	
	
	public Connection updateConnection(int id,Connection e)
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
	
	public void deleteConnection(int id)
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
