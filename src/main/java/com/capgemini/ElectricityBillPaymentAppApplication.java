package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectricityBillPaymentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillPaymentAppApplication.class, args);
		System.out.println("table created");
	}

}
