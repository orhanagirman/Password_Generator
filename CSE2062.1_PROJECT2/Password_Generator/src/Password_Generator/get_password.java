/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author orhan
 */
public abstract class get_password {
    
    
	private String pass;
	private String name;
	private String data;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void read() {
		try {
		      File myObj = new File("pass.aattk");
		      Scanner myReader = new Scanner(myObj); 
		      data = myReader.nextLine();
		      setName(data);
		      data = myReader.nextLine();
		      setPass(data);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("password senc error.");
		      e.printStackTrace();
		    } 	
	}


}
