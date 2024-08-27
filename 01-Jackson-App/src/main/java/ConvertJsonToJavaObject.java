import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//json data to java object
public class ConvertJsonToJavaObject {
public static void main(String[] args) throws Exception {
	File f= new File("customer.json");//where json data is located
	ObjectMapper mapper=new ObjectMapper();
	Customer customer = mapper.readValue(f, Customer.class);
	System.out.println(customer);
}
}
