package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Connection;
import com.capgemini.services.ConnectionService;




@RestController
@RequestMapping("/coc")
public class ConnectionController {
	
	@Autowired(required=true)
	ConnectionService service;
	
	@RequestMapping(value="/connection",method=RequestMethod.GET)
	public List<Connection> getAllConnection()
	{
		return  service.getAllConnection();
	}
	
	@RequestMapping(value="/connection/{id}",method=RequestMethod.GET)
	public Connection getConnectionById(@PathVariable int id)
	{
		return service.getConnectionById(id);
	}
	
	
	@RequestMapping(value="/addconnection",method=RequestMethod.POST)
	public Connection addConnection( @RequestBody  Connection e)
	{
		return service.addConnection(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Connection updateConnection(@PathVariable int id,@RequestBody Connection e)
	{
		return service.updateConnection(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteConnection(@PathVariable int id)
	{
		service.deleteConnection(id);
	}

	


}
