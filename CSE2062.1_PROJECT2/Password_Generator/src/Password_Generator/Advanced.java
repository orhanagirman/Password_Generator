/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author orhan
 */
public class Advanced extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame5
     */
    public Advanced() {
        initComponents();
        setTitle("Password Generator");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("password_image.png")));
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yourpasswordprint_label = new javax.swing.JLabel();
        yourpassword_label = new javax.swing.JLabel();
        passwordlength_label = new javax.swing.JLabel();
        length_text = new javax.swing.JTextField();
        letters = new javax.swing.JCheckBox();
        numbers = new javax.swing.JCheckBox();
        symbols = new javax.swing.JCheckBox();
        generate_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(430, 343));

        yourpasswordprint_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yourpasswordprint_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourpasswordprint_label.setToolTipText("");
        yourpasswordprint_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yourpasswordprint_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        yourpassword_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yourpassword_label.setText("Your Password is:");

        passwordlength_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordlength_label.setText("Password Length:");

        length_text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        length_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                length_textActionPerformed(evt);
            }
        });
        length_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                length_textKeyTyped(evt);
            }
        });

        letters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letters.setText("Letters (A-Z)");

        numbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numbers.setText("Numbers (0-9)");

        symbols.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        symbols.setText("Symbols (.!?{}*/#%&)");

        generate_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generate_button.setText("GENERATE");
        generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_buttonActionPerformed(evt);
            }
        });

        save_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_button.setText("SAVE");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        back_button.setText("<< Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letters)
                                    .addComponent(numbers)
                                    .addComponent(symbols))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(generate_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yourpasswordprint_label, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(passwordlength_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(length_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back_button)
                                .addGap(68, 68, 68)
                                .addComponent(yourpassword_label)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_button)
                        .addGap(32, 32, 32))
                    .addComponent(yourpassword_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(yourpasswordprint_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlength_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letters)
                        .addGap(18, 18, 18)
                        .addComponent(numbers))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(generate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbols))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void length_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_length_textKeyTyped
        // TODO add your handling code here:
        char vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACKSPACE) || (vchar==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_length_textKeyTyped

    private void length_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_length_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_length_textActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        Build_Mod frame=new Build_Mod();
        frame.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_buttonActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        String passString = "";
        if(length_text.getText().trim().equals("") && ((letters.isSelected() && numbers.isSelected()) || (letters.isSelected() && symbols.isSelected())
                || (symbols.isSelected() && numbers.isSelected()) || (symbols.isSelected() && numbers.isSelected()) && letters.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.");
        }
        else if(length_text.getText().trim().equals("") && ((!letters.isSelected() && !numbers.isSelected()) || (!letters.isSelected() && !symbols.isSelected())
                || (!symbols.isSelected() && !numbers.isSelected()) || (!symbols.isSelected() && !numbers.isSelected()) && !letters.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.\n*At least 2 checkbox must be selected."); 
        }
        else if(Integer.valueOf(length_text.getText())<6 && ((letters.isSelected() && numbers.isSelected()) || (letters.isSelected() && symbols.isSelected())
                || (symbols.isSelected() && numbers.isSelected()) || (symbols.isSelected() && numbers.isSelected()) && letters.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.");
        }
        else if(Integer.valueOf(length_text.getText())<6 && ((!letters.isSelected() && !numbers.isSelected()) || (!letters.isSelected() && !symbols.isSelected())
                || (!symbols.isSelected() && !numbers.isSelected()) || (!symbols.isSelected() && !numbers.isSelected()) && !letters.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.\n*At least 2 checkbox must be selected."); 
        }
        else if(Integer.valueOf(length_text.getText())>24 && ((letters.isSelected() && numbers.isSelected()) || (letters.isSelected() && symbols.isSelected())
                || (symbols.isSelected() && numbers.isSelected()) || (symbols.isSelected() && numbers.isSelected()) && letters.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.");
        }
        else if(Integer.valueOf(length_text.getText())>24 && ((!letters.isSelected() && !numbers.isSelected()) || (!letters.isSelected() && !symbols.isSelected())
                || (!symbols.isSelected() && !numbers.isSelected()) || (!symbols.isSelected() && !numbers.isSelected()) && !letters.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "*Password must be between 6-24 characters.\n*At least 2 checkbox must be selected.");
        }
        else if((!letters.isSelected() && !numbers.isSelected()) || (!letters.isSelected() && !symbols.isSelected())
                || (!symbols.isSelected() && !numbers.isSelected()) || (!symbols.isSelected() && !numbers.isSelected()) && !letters.isSelected()){
                JOptionPane.showMessageDialog(rootPane, "*At least 2 checkbox must be selected.");
        }
        else{
     
            if(letters.isSelected() && numbers.isSelected() && symbols.isSelected()){
                for (int i = 0; i < Integer.valueOf(length_text.getText()); i++) {
		    int val = random.nextInt(35);
			if(val==0 || val==1 || val==2 || val==3 || val==4 || val==5 || val==6 || val==7 || val==8 || val==9) {
			    passString += Integer.toString(val);
			}
			if(val==10) {
			    passString += "a";
			}
			else if(val==11) {
			    passString += "b";
			}
			else if(val==12) {
			    passString += "c";
			}
			else if(val==13) {
			    passString += "d";
			}
			else if(val==14) {
			    passString += "e";
			}
			else if(val==15) {
			    passString += "f";
			}
			else if(val==16) {
			    passString += "g";
			}
			else if(val==17) {
			    passString += "h";
			}
			else if(val==18) {
			    passString += "i";
			}
			else if(val==19) {
			    passString += "j";
                        }
			else if(val==20) {
			    passString += "k";
			}
			else if(val==21) {
			    passString += "l";
			}
			else if(val==22) {
			    passString += "m";
			}
			else if(val==23) {
			    passString += "n";
			}
			else if(val==24) {
			    passString += "o";
			}
			else if(val==25) {
			    passString += "p";
			}
			else if(val==26) {
			    passString += ".";
			}
			else if(val==27) {
			    passString += "!";
			}
			else if(val==28) {
			    passString += "?";
			}
			else if(val==29) {
			    passString += "{";
			}
			else if(val==30) {
			    passString += "}";
			}
			else if(val==31) {
			    passString += "*";
			}
			else if(val==32) {
			    passString += "/";
			}
			else if(val==33) {
			    passString += "#";
			}
			else if(val==34) {
			    passString += "%";
			}
			else if(val==35) {
			    passString += "&";
			}    
                }
            yourpasswordprint_label.setText(passString);
            }
            else if(letters.isSelected() && numbers.isSelected() && !symbols.isSelected()){
                for (int i = 0; i < Integer.valueOf(length_text.getText()); i++) {
		    int val = random.nextInt(25);
	            if(val==0 || val==1 || val==2 || val==3 || val==4 || val==5 || val==6 || val==7 || val==8 || val==9) {
			passString += Integer.toString(val);
	            }
			
		    if(val==10) {
		    	passString += "a";
		    }
		    else if(val==11) {
		    	passString += "b";
		    }
		    else if(val==12) {
		    	passString += "c";
		    }
		    else if(val==13) {
		    	passString += "d";
		    }
		    else if(val==14) {
		    	passString += "e";
		    }
		    else if(val==15) {
		    	passString += "f";
		    }
		    else if(val==16) {
		    	passString += "g";
		    }
		    else if(val==17) {
		    	passString += "h";
		    }
		    else if(val==18) {
		    	passString += "i";
		    }
		    else if(val==19) {
		    	passString += "j";
		    }
		    else if(val==20) {
		    	passString += "k";
		    }
		    else if(val==21) {
		    	passString += "l";
		    }
		    else if(val==22) {
		    	passString += "m";
		    }
		    else if(val==23) {
		    	passString += "n";
		    }
		    else if(val==24) {
		    	passString += "o";
		    }
		    else if(val==25) {
		    	passString += "p";
		    }
	        }
            yourpasswordprint_label.setText(passString);
            }
            else if(!letters.isSelected() && numbers.isSelected() && symbols.isSelected()){
                for (int i = 0; i < Integer.valueOf(length_text.getText()); i++) {
			int val = random.nextInt(19);
			if(val==0 || val==1 || val==2 || val==3 || val==4 || val==5 || val==6 || val==7 || val==8 || val==9) {
			    passString += Integer.toString(val);
			}
			 else if(val==10) {
			    	passString += ".";
			    }
			    else if(val==11) {
			    	passString += "!";
			    }
			    else if(val==12) {
			    	passString += "?";
			    }
			    else if(val==13) {
			    	passString += "{";
			    }
			    else if(val==14) {
			    	passString += "}";
			    }
			    else if(val==15) {
			    	passString += "*";
			    }
			    else if(val==16) {
			    	passString += "/";
			    }
			    else if(val==17) {
			    	passString += "#";
			    }
			    else if(val==18) {
			    	passString += "%";
			    }
			    else if(val==19) {
			    	passString += "&";
			    }
		 }
            yourpasswordprint_label.setText(passString);    
            }
            else if(letters.isSelected() && !numbers.isSelected() && symbols.isSelected()){
                for (int i = 0; i < Integer.valueOf(length_text.getText()); i++) {
		    int val = random.nextInt(26);
			
		    if(val==1) {
		    	passString += "a";
		    }
		    else if(val==2) {
		    	passString += "b";
		    }
		    else if(val==3) {
		    	passString += "c";
		    }
		    else if(val==4) {
		    	passString += "d";
		    }
		    else if(val==5) {
		    	passString += "e";
		    }
		    else if(val==6) {
		    	passString += "f";
		    }
		    else if(val==7) {
		    	passString += "g";
		    }
		    else if(val==8) {
		    	passString += "h";
		    }
		    else if(val==9) {
		    	passString += "i";
		    }
		    else if(val==10) {
		    	passString += "j";
		    }
		    else if(val==11) {
		    	passString += "k";
		    }
		    else if(val==12) {
		    	passString += "l";
		    }
		    else if(val==13) {
		    	passString += "m";
		    }
		    else if(val==14) {
		    	passString += "n";
		    }
		    else if(val==15) {
		    	passString += "o";
		    }
		    else if(val==16) {
		    	passString += "p";
		    }
		    else if(val==17) {
		    	passString += ".";
		    }
		    else if(val==18) {
		    	passString += "!";
		    }
		    else if(val==19) {
		    	passString += "?";
		    }
		    else if(val==20) {
		    	passString += "{";
		    }
		    else if(val==21) {
		    	passString += "}";
		    }
		    else if(val==22) {
		    	passString += "*";
		    }
		    else if(val==23) {
		    	passString += "/";
		    }
		    else if(val==24) {
		    	passString += "#";
		    }
		    else if(val==25) {
		    	passString += "%";
		    }
		    else if(val==26) {
		    	passString += "&";
		    }
                }
            yourpasswordprint_label.setText(passString);    
            }
        }
        
        
    }//GEN-LAST:event_generate_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        if(yourpasswordprint_label.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "No password to save.");
       }
       else{
            setVisible(false);
           new Save_password(yourpasswordprint_label).setVisible(true);
       }
    }//GEN-LAST:event_save_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Advanced().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton generate_button;
    private javax.swing.JTextField length_text;
    private javax.swing.JCheckBox letters;
    private javax.swing.JCheckBox numbers;
    private javax.swing.JLabel passwordlength_label;
    private javax.swing.JButton save_button;
    private javax.swing.JCheckBox symbols;
    private javax.swing.JLabel yourpassword_label;
    private javax.swing.JLabel yourpasswordprint_label;
    // End of variables declaration//GEN-END:variables
}
