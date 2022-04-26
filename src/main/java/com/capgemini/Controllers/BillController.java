package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.modules.Bill;
import com.capgemini.modules.Customer;
import com.capgemini.services.BillService;

@RestController
@RequestMapping("/bc")
public class BillController {
	
	@Autowired(required=true)
	BillService service;
	
	@RequestMapping(value="/bill",method=RequestMethod.GET)
	public List<Bill> getAllBill()
	{
		return  service.getAllBill();
	}
	
	@RequestMapping(value="/bill/{id}",method=RequestMethod.GET)
	public Bill getBillById(@PathVariable long id)
	{
		return service.getBillById(id);
	}
	
	
	@RequestMapping(value="/addbill",method=RequestMethod.POST)
	public Bill addBill( @RequestBody  Bill e)
	{
		return service.addBill(e);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Bill updateBill(@PathVariable long id,@RequestBody Bill e)
	{
		return service.updateBill(id,e);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void  deleteBill(@PathVariable long id)
	{
		service.deleteBill(id);
	}
////////////////////////////////////////////////////////////////////////////////////////////
//	@RequestMapping(value="/email/{email}",method=RequestMethod.GET)
//	public Bill ViewBillByEmail(@PathVariable String email)
//	{
//		return service.ViewBillByEmail(email);
//	}
//	

}
