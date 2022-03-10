package demo;

import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
	
	static Map<Integer, Customer> db;
	static {
		db = new HashMap<Integer, Customer>();
		db.put(100, new Customer(100, "Shubha", "Belgaum",10000));
		db.put(101, new Customer(101, "Rakesh", "Banglore",20000));
		db.put(102, new Customer(102, "Rohini", "Hydrabad",30000));
		db.put(103, new Customer(103, "Akansha", "Banglore",40000));
		db.put(104, new Customer(104, "Ram", "Noida",50000));
		db.put(105, new Customer(105, "Tejas", "Pune",60000));
		db.put(106, new Customer(106, "Vishal", "Delhi",70000));
		db.put(107, new Customer(107, "Mona", "Mumbai",50000));
		db.put(108, new Customer(108, "Akash", "Hyderabad",80000));
		db.put(109, new Customer(109, "Vibha", "Pune",90000));
	}

}
