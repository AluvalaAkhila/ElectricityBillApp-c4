package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Address;
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
	public Connection getConnectionById(@PathVariable long id)
	{
		return service.getConnectionById(id);
	}
	
	
	@RequestMapping(value="/addconnection",method=RequestMethod.POST)
	public Connection addConnection( @RequestBody  Connection e) throws Exception
	{
		return service.addConnection(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Connection updateConnection(@PathVariable long id,@RequestBody Connection e)
	{
		return service.updateConnection(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteConnection(@PathVariable long id)
	{
		service.deleteConnection(id);
	}
////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/taluka/{Name}",method=RequestMethod.GET)
	public List<Connection> readActiveConnectionsByTaluka(@PathVariable String Name)
	{
		return service.readActiveConnectionsByTaluka(Name);
	}
	@RequestMapping(value="/village/{village}",method=RequestMethod.GET)
	public List<Connection> readActiveConnectionsByVillage(@PathVariable String village)
	{
		return service.readActiveConnectionsByVillage(village);
	}	
	@RequestMapping(value="/district/{district}",method=RequestMethod.GET)
	public List<Connection> readActiveConnectionsByDistrict(@PathVariable String district)
	{
		return service.readActiveConnectionsByDistrict(district);
	}
	@RequestMapping(value="/pincode/{pincode}",method=RequestMethod.GET)
	public List<Connection> readActiveConnectionsByPincode(@PathVariable String pincode)
	{
		return service.readActiveConnectionsByPincode(pincode);
	}
//	////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/Taluka/{taluka}",method=RequestMethod.GET)
	public List<Connection> readInactiveConnectionsByTaluka(@PathVariable String taluka)
	{
		return service.readInactiveConnectionsByTaluka(taluka);
	}
	@RequestMapping(value="/Village/{Village}",method=RequestMethod.GET)
	public List<Connection> readInactiveConnectionsByvillage1(@PathVariable String Village)
	{
		return service.readInactiveConnectionsByVillage1(Village);
	}	
	@RequestMapping(value="/District/{District}",method=RequestMethod.GET)
	public List<Connection> readInactiveConnectionsByDistrict1(@PathVariable String District)
	{
		return service.readInactiveConnectionsByDistrict1(District);
	}
	@RequestMapping(value="/Pincode/{Pincode}",method=RequestMethod.GET)
	public List<Connection> readInactiveConnectionsByPincode1(@PathVariable String Pincode)
	{
		return service.readInactiveConnectionsByPincode1(Pincode);
	}
//	
}


