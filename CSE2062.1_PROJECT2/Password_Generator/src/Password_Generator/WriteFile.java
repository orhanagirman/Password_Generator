/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
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
        public void write(DefaultTableModel dtm,javax.swing.JTable JTable){
            
            try { 
		      FileWriter myWriter = new FileWriter("save.aattk");
                      
                      for(int i=0;i<JTable.getRowCount();i++){
                            int j=0;
                            myWriter.write((String)dtm.getValueAt(i, j)+" : "+(String)dtm.getValueAt(i, j+1)+"\n");
                          
                      }
		      
		      myWriter.close();
		      System.out.println("Successfully saved :)");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }     
        }
}
