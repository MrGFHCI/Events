package Buttons3;



import Buttons1.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanMain extends JPanel {  
    // declare the components that will be placed on the panel
    JLabel lblOutput;
    //JButton btnUpdateLabel;
    BtnLabelChange btnUpdateLabel;

    public PanMain() {
        // create an instance of the components that will be added to the panel
        lblOutput = new JLabel("Check out the label");
        // I pass a reference to "this" JPanel so that the button can update the label that is on this panel
        btnUpdateLabel = new BtnLabelChange("Update the label", this);
        // add components to the panel
        add(lblOutput);
        add(btnUpdateLabel);
        setFocusable(true);
    }
}
