package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		
		Seller obj1 = new Seller(21, "Bob", "bob@gmail",sdf.parse("23/06/1984"),3000.0, obj);
		
		System.out.println(obj);
		System.out.println(obj1);
	}
}

