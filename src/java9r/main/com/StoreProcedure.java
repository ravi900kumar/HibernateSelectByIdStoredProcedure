package java9r.main.com;
 
import java.util.*;

import java9r.dao.com.*;
import java9r.entites.com.*;
public class StoreProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	StoreProcedureDAO spo=new StoreProcedureDAO();
	
/////////////////////////////////////// get  record select by id StoreProcedure start /////////////
	Product p=spo.findSP(1);
	
	
	System.out.println("Id " + p.getId());
	System.out.println("Name " + p.getName());
	System.out.println("Price " + p.getPrice());

	}
 

}