package pico.placa.UI;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import pico.placa.classes.pTime;

/**
 * This is the user interface, where you can enter text in the jTextFields and press the "Calculate" button.
 * 
 * @author SEBASTIAN ALVAREZ
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI, set the position and the general title
     */
    public UI() {
        initComponents();
        this.setTitle("'Pico&Placa' Predictor");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLPlate = new javax.swing.JLabel();
        jTextFieldLicensePlate = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelTime = new javax.swing.JLabel();
        jTextFieldTime = new javax.swing.JTextField();
        jButtonCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitle.setText("\"PICO&PLACA\" PREDICTOR");

        jLabelLPlate.setText("LICENSE PLATE");

        jLabelDate.setText("DATE (DD/MM/YYYY)");

        jLabelTime.setText("TIME (HH:MM)");

        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDate)
                            .addComponent(jLabelLPlate)
                            .addComponent(jLabelTime))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButtonCalculate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabelTitle)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLPlate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTime)
                    .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jButtonCalculate)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * performs the necessary processes to calculate if the car can leave or not once the "CALCULATE 'button is pressed
     * 
     * @param evt the event of clicking the "Calculate" button
     */
    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        // The data is collected from the jTextField fields
        String LPlateNumber = jTextFieldLicensePlate.getText();
        String date               = jTextFieldDate.getText();
        String time               = jTextFieldTime.getText();
        
        /*  TIME DATA PROCESSES  */
        String[] strTime = time.split(":"); // two position String array to save the splitted time data (HH:MM)
        
        // integration of time data in auxiliary variables
        Integer auxHour    = Integer.parseInt(strTime[0]);
        Integer auxMinute = Integer.parseInt(strTime[1]);
        
        pTime pTime      = new pTime(auxHour, auxMinute); //object of type pTime to save the collected data
        
        /*  DATE DATA PROCESSES  */
        String[] strDate = date.split("/"); // three position String array to save the splitted date data (DD/MM/YYYY)
        
        // integration of date data in auxiliary variables
        Integer auxDay     = Integer.parseInt(strDate[0]);
        Integer auxMonth = Integer.parseInt(strDate[1]);
        Integer auxYear    = Integer.parseInt(strDate[2]);
        
        Date pDate = new Date(auxDay-1900, auxMonth, auxYear); //object of type Date to save the collected data
                                                                                                //Date accepts the value of 'years' since 1900, so that 
                                                                                                //number is subtracted from the required year when entering it
        DateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE"); 
        String dayOfTheWeek = dayOfTheWeekFormat.format(pDate); //For using the text-format form of the day
                                                                                                   //Mondar, Tuesday, Wednesday, etc.
        
        /*  PLATE NUMBER DATA PROCESS  */
        Integer lastNumber = Integer.parseInt(LPlateNumber.substring(LPlateNumber.length()-1)); //the last digit of the plate is saved in 'lastNumber'
        
        /*  PREDICTION PROCESSES  */  
        //messages templates
        String badMessage = "Your car cannot be driven on " + date + " at " + time 
                + ".\nRemember that you cannot drive your car with a license plate: " + LPlateNumber 
                + " \non " + dayOfTheWeek +"s from 7:00 to 9:30 and from 16:00 to 19:30.";
        
        String goodMessage = "Your car can be driven on " + date + " at " + time + ".";
        
        int pMinutes = pTime.timeInMinutes(); //Transform all the hour values in minutes for validating
                             
        boolean predictionFlag = true; //Starts true to control validations (true = can drive; false = cannot drive)
        boolean timeFlag         = pTime.validateTimeInMinutes(pMinutes); //Validate if the time data is found among the 
                                                                                                        //prohibited values. (true = it's inside; false = it sn't inside)
        
         //Switch cycle to validates the last digit of the plate depending on the day for boolean 'predictionFlag'.
        switch(dayOfTheWeek){
            case "Monday":
                if((lastNumber == 1 || lastNumber == 2) && timeFlag) predictionFlag = false;
                break;
            case "Tuesday":
                if((lastNumber == 3 || lastNumber == 4) && timeFlag) predictionFlag = false;
                break;
            case "Wednesday":
                if((lastNumber == 5 || lastNumber == 6) && timeFlag) predictionFlag = false;
                break;
            case "Thursday":
                if((lastNumber == 7 || lastNumber == 8) && timeFlag) predictionFlag = false;
                break;
            case "Friday":
                if((lastNumber == 9 || lastNumber == 0) && timeFlag) predictionFlag = false;
                break;
        }
        
        // depending 'predictionFlag' validates the output type of the JOptionPane.
        int value = predictionFlag ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE;
        
        // the message is indicated to the user once everything has been validated
        JOptionPane.showMessageDialog(null, predictionFlag ? goodMessage : badMessage, "Result", value);
         
        clearFields(); // the 'jTextFields' are cleaned to enter new data
    }//GEN-LAST:event_jButtonCalculateActionPerformed
    
    /**
     * clean the 'jTextFields' to leave them empty so that the user can enter new data
     */
    public void clearFields(){
        jTextFieldLicensePlate.setText("");
        jTextFieldDate.setText("");
         jTextFieldTime.setText("");
    }
    
    @Override
    /**
     * override the 'getIconImage ()' function to set your own icon in the 'JFrame'
     */
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("pico/placa/resources/logo.png"));

        return retValue;
    }
    
    /**
     * the main function of the graphical interface that set 'Nimbus' and validate errors
     * 
     * @param args line of commands
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelLPlate;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldLicensePlate;
    private javax.swing.JTextField jTextFieldTime;
    // End of variables declaration//GEN-END:variables
}
