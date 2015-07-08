package KL1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class PanMain extends JPanel {

    JLabel lblOutput;

    public PanMain() {
        KeyInput keyInput = new KeyInput();
        // create an instance of the components that will be added to the panel
        lblOutput = new JLabel("Check out the label");
        // add components to the panel
        add(lblOutput);
        addKeyListener(new KeyInput());
        setFocusable(true);
    }

    // notice that when  you "implement" a "KeyListener", you are prompted to add methods - add them.
    class KeyInput implements KeyListener {

        String sInput;
        char chInput;
        /*keyPressed - when the key goes down
         keyReleased - when the key comes up
         keyTyped - when the unicode character represented by this 
         key is sent by the keyboard to system input.*/

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            chInput = (char) e.getKeyChar();
            sInput = String.valueOf(chInput); // convert the char to a String
            lblOutput.setText(sInput);
        }
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

}
