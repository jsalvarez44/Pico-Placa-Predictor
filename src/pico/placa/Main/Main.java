package pico.placa.Main;

import pico.placa.UI.UI;

/**
 * <p>
 * This application allows the entry of three Strings through jTextFields which are:
 * -Plate number
 * -Date required
 * -Required time
 * To later validate if the vehicle of that plate can circulate on this date during that hour using the past rules of the Pico&Placa
 * <\p>
 * 
 * @author SEBASTIAN ALVAREZ
 */
public class Main {
    
    /**
     * The user interface is called to start the interaction
     * 
     * @param args line of commands
     */
    public static void main(String[] args) {
        UI userInterface = new UI();
        userInterface.setVisible(true);
    }
}