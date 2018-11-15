package com.cg.bms.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Random;

import com.cg.bms.dto.Customer;

public class DBUtil {
	static Random rand = new Random();
	public static HashMap<String, Customer> bankDBMap = new HashMap<>();
	public static HashMap<String, String> credentialDBMap = new HashMap<>();
	static {
		credentialDBMap.put("132456", "s96");
		bankDBMap.put(
				"132456",
				new Customer("132456", "Sai", LocalDate.of(1996,
						Month.NOVEMBER, 22), "Saving", 25500.0F, 200000.0));
		credentialDBMap.put("16789", "in23");
		bankDBMap.put("16789", new Customer("16789", "Vijay",
				LocalDate.of(2018, Month.JULY,14), "Current", 20000.0F,
				200000.0));
		credentialDBMap.put("19876", "g26");
		bankDBMap.put("19876", new Customer("19876", "Goutham",
				LocalDate.of(2018, Month.JULY, 7), "Saving", 50000.0F,
				200000.0));
		credentialDBMap.put("77936", "k23");
		bankDBMap.put(
				"77936",
				new Customer("77936", "kushi", LocalDate.of(2017,
						Month.AUGUST,21), "Current", 15500.0F, 200000.0));
	}

	public static String newCustomer(String password, Customer customer) {
		credentialDBMap.put(customer.getAccNumber(), password);
		bankDBMap.put(customer.getAccNumber(), customer);
		return customer.getAccNumber();
	}

	public static HashMap<String, String> getAllCustCred() {
		return credentialDBMap;
	}

	public static HashMap<String, Customer> getAllCustomer() {
		return bankDBMap;
	}

}
