
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SwDev13
 */
public class login_GUI_110618 extends javax.swing.JFrame {

    /**
     * Creates new form login_GUI_110618
     */
    atm_class_110618 AIB=new atm_class_110618();
    String pin="";
    String account="";
    boolean pinEntry;
    public login_GUI_110618() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_login = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        lbl_pin = new javax.swing.JLabel();
        txt_account = new javax.swing.JTextField();
        txt_PIN = new javax.swing.JTextField();
        lbl_login = new javax.swing.JLabel();
        btn_loginn = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        btn_login.setText("login");
        btn_login.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setText("account number");
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbl_pin.setText("PIN");
        getContentPane().add(lbl_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 20, -1));

        txt_account.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_accountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_accountFocusLost(evt);
            }
        });
        txt_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_accountActionPerformed(evt);
            }
        });
        getContentPane().add(txt_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 60, -1));

        txt_PIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PINFocusGained(evt);
            }
        });
        getContentPane().add(txt_PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, -1));

        lbl_login.setText("Login");
        getContentPane().add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, -1));

        btn_loginn.setText("login");
        btn_loginn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_loginn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        btn_exit.setText("exit  app!");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 70, -1));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, -1));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 70, -1));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, -1));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 70, -1));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 70, -1));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, -1));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, -1));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 70, -1));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));

        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        //i deleted this button by mistake so this function is useless
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginnActionPerformed
        System.out.println("debuging only "+txt_account.getText());
        System.out.println("debuging only "+txt_PIN.getText());
        //!!!careful when u create the txt boxes if you put empty spaces in them 
        //they will be there and pasword and acc will add theese empty spaces to the string we enter
        //and when we enter our 00245 it will actually be like"    00245" and that will not match
        //an account like""00245"!...so create txt boxes with no txt in them!!!
        
        // TODO add your handling code here:
        //if(pin.equals(txt_PIN.getText()))---we can do something like this to 
        //check if the entered pin matches our database pin,but we should actually check
        //if username in database and if the pin coresponding to that username equals
        //the enetered pin but that is naother story :))
        ///we will have more jframes and we go and set main project and then set our jframe to start running
        //from this project and everyrtime we start this project that jframe will be run first
        //---if we want to change the jframe to be run frist we have a default config box->customize->
        //and we change our starting jf4rame
        Account_class_110618 userAccount;
        if (AIB.searchforAcount(txt_account.getText(), txt_PIN.getText())){
           
            
            this.setVisible(false);//---once w press login the login menu disapears 
        //and makes the menun jframe pop...of course the login button should
        //have a condition behind it to execute only if the password entered for that user
        //matches the password in the database
            new menu_GUI_110618(AIB.getCustomerAccount(),AIB).setVisible(true);///if we find the customer
            //fom the list of customers of the bank,then this function will set the object customer
            //of the bank to this customer with this acc and pin we entered and we retrieve this
            //object customer with getcustomer and this will be passed to the menu in its constructor in#
            //the line above and the buttons in the menu will perfioorm methods on thsi Customer object
            //txt_PIN.setText("");///we want account an pin cleared from the txt box if we get in 
            
            //txt_account.setText("");
        }
        else 
            JOptionPane.showMessageDialog(this, "account and pin not in the database", "wrong details", HEIGHT);
             //txt_PIN.setText("");//we wnat pin and account cleared even if we get it wrong
            //txt_account.setText("");
    }//GEN-LAST:event_btn_loginnActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();///this disposes of the frame and not just hides it
        ///basicaly the frame is not running in the background anymore
        System.exit(0);//this kills all the program!
    }//GEN-LAST:event_btn_exitActionPerformed

    private void txt_accountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_accountFocusGained
        // TODO add your handling code here:
        pinEntry=false;
        
    }//GEN-LAST:event_txt_accountFocusGained

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        wheretoWrite(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
          wheretoWrite(btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void txt_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_accountActionPerformed
      ///nothing will be done here
    }//GEN-LAST:event_txt_accountActionPerformed

    private void txt_PINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PINFocusGained
        pinEntry=true;///when we are in this pin txt box we set the boolean to true
        //and if its true then the function that pressing the buton will call,cause
        //btn will need to execute something,and we will create a function for that
        //and that function will say if the boolean is false enter in the account box,
        //otherwise is true enter in the Pin box...
        //so first will click on one of rthe txt boxes we want to enter something
        //that will call the focus gained of that txt box if it goes to account it 
        //will set the boolean to a certain value and if it goes to pin it will set it
        //to the opposite value...the boolean being set that will let the button
        //go on either of the two paths if its false then txtAccount.set() to value of button
        //otherwise boolean is true txtPin.set() to value of the button
    }//GEN-LAST:event_txt_PINFocusGained

    private void txt_accountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_accountFocusLost
        // TODO add your handling code here:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ///instead of fous gained event we can use the focuslost event
        //and that can be set for one txt box only! either txtAccount OR txtPIN
        //but for the explanation bellow foucs gained eevnt is for the txtPIN box
        //(we can also do it for the txtAccount but then thiings have to change acordingly)
        //and that will say that if we are outside the txtPIn box it will set pinEntry to false 
        //and when we click on a buton then it will write txtAccount  because the function inside the 
        //buton will write in txtAccount if pinEntrty is false and we want it to be false
        //as we want to write in the cacount first , and then when we click on thetxtPin the program
        //changes the boolean to true and the function in the vbutton will print 
        //the button in the txtPin box
        //
    }//GEN-LAST:event_txt_accountFocusLost

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // !!!!!!!!clear has to be done after enetering first acc and pin otehr wise it will keep on adding to the string!1!!!1
        txt_PIN.setText("");
        txt_account.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed
    private void wheretoWrite(javax.swing.JButton button){//this sets the 
        //place where the keypad will write ,clicking on the txt boxes will triger the focus gained
        //functions which  will set the pinEntry to either true or false and 
        //if true it writes to account (anyway we wan t to write to teh account first) and
        //if false wiol write to the pin box
        
        if (pinEntry){
            
            
            txt_account.setText(txt_account.getText()+button.getText());
        }
        else
            txt_PIN.setText(txt_PIN.getText()+button.getText());
            
    
    }
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
            java.util.logging.Logger.getLogger(login_GUI_110618.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_GUI_110618.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_GUI_110618.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_GUI_110618.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_GUI_110618().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_loginn;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_pin;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_PIN;
    private javax.swing.JTextField txt_account;
    // End of variables declaration//GEN-END:variables
}
