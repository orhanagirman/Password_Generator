/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author orhan
 */
public class WriteFile {
    
    	public void write() {
		System.out.println("Error : Very few variables");
	}
	public void write(String name,String password) {
		try { 
		      FileWriter myWriter = new FileWriter("save.aattk",true);
		      myWriter.write(name+" : "+password+"\n");
		      myWriter.close();
		      System.out.println("Successfully saved :)");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }     
	}
}
