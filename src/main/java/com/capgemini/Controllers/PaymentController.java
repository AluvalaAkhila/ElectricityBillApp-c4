package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.modules.Payment;
import com.capgemini.services.PaymentService;


@RestController
@RequestMapping("/pc")
public class PaymentController {
	@Autowired(required=true)
		PaymentService service;
		@RequestMapping(value="/payment",method=RequestMethod.GET)
		public List<Payment> getAllPayment()
		{
			return  service.getAllPayment();
		}
		@RequestMapping(value="/payment/{id}",method=RequestMethod.GET)
		public Payment getPaymentById(@PathVariable long id)
		{
			return service.getPaymentById(id);
		}
		@RequestMapping(value="/addpayment",method=RequestMethod.POST)
		public Payment addPayment( @RequestBody  Payment p)
		{
			return service.addPayment(p);
			
		}

		@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
		public Payment updatePayment(@PathVariable long id,@RequestBody Payment p)
		{
			return service.updatePayment(id,p);
		}
		
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public void  deletePayment(@PathVariable long id)
		{
			service.deletePayment(id);
		}
}
