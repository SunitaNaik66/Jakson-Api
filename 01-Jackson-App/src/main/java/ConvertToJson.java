import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {//this class responsible to covert Object to json data
	public static void main(String[] args) throws Exception {//main method
		Customer c= new Customer(101,"Sunita","sunita@123.gmail.com");//created object for the customer class
		Customer c1= new Customer(102,"mini","mini@123.gmail.com");
		//convert object to json format
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File ("customer.json"), c);
		mapper.writeValue(new File ("mini.json"), c1);
		System.out.println("completed ........");
	}
	

}
