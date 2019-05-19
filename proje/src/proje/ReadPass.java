/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author orhan
 */
public class ReadPass extends javax.swing.JFrame{
    
    	String data;
        String[] strArray={null,null,null,null,null};
        
        int i=0;
	get_password password =  new get_password() {};
	public void read() {
		try {
		      File myObj = new File("save.aattk");
		      Scanner myReader = new Scanner(myObj); 
		      while (myReader.hasNextLine()) {
                        
                           data=myReader.nextLine();
                           strArray[i]=data;
                           i++;
 
		      }
                   
                     
                    new list_password(strArray).setVisible(true);
                    
		    myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 	
	}

   

}
