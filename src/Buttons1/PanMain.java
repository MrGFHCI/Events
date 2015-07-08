package Buttons1;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanMain extends JPanel {  
    // declare the components that will be placed on the panel
    JLabel lblOutput;
    JButton btnUpdateLabel;

    public PanMain() {
        // create an instance of the components that will be added to the panel
        lblOutput = new JLabel("Check out the label");
        btnUpdateLabel = new JButton("Update the label");
        // add components to the panel
        add(lblOutput);
        add(btnUpdateLabel);
        setFocusable(true);
        // create an instance of the "ActionListener" which will accept input
        // from the button
        LabelChangeListener labelChange = new LabelChangeListener();
        // link the button to the ActionListener.
        btnUpdateLabel.addActionListener(labelChange);
    }

    class LabelChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                lblOutput.setText("New and improved");
            }
    }
}
