package mlJPanel2;


// this program will have a second button to change the background colour.
import mlJpanel.*;
import Buttons2.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class PanMain extends JPanel {  
    // declare the components that will be placed on the panel
    JLabel lblOutput;
    JButton btnUpdateLabel;
    JButton btnRedBackground;
    int nX, nY;

    public PanMain() {
        // create an instance of the components that will be added to the panel
        lblOutput = new JLabel("Check out the label");
        btnUpdateLabel = new JButton("Update the label");
        btnRedBackground = new JButton("Red Background");
        // add a mouse listener to the panel - it is defined below
        addMouseListener(new Ml());
        // add components to the panel
        add(lblOutput);
        add(btnUpdateLabel);
        add(btnRedBackground);
        setFocusable(true);
        // create an instance of the "ActionListener" which will accept input
        // from the button
        LabelChangeListener labelChange = new LabelChangeListener();
        RedBackListener redBack = new RedBackListener();
        // link the button to the ActionListener.
        btnUpdateLabel.addActionListener(labelChange);
        btnRedBackground.addActionListener(redBack);
        /*
        addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
            //System.out.println(me); 
            nX = me.getX();
            nY = me.getY();
            System.out.println(" x is " + nX + " y is "+ nY); 
            lblOutput.setText(" x is " + nX + " y is "+ nY);
            
          } 
        }); */
        
    }
    class Ml implements MouseListener {

    //PanMain panMain;
    int nX, nY;

    /*void M1(PanMain _panMain) {
        panMain = _panMain;

    }*/

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println(" Mouse clicked " + e.getX() + " " + e.getY());
        //panMain.lblOutput.setText(null);
        nX = e.getX();
        nY = e.getY();
        System.out.println(" x is " + nX + " y is " + nY);
        lblOutput.setText(" x is " + nX + " y is " + nY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
    class RedBackListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                setBackground(Color.red);;
            }
    }

    class LabelChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                lblOutput.setText("New and improved");
            }
    }
}
