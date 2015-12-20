/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buttons3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author dadeeo
 */
public class BtnLabelChange extends JButton {
    String sLabel;
    PanMain panMain;
    BtnLabelChange(String _sLabel, PanMain _panMain){
        sLabel = _sLabel;
        panMain = _panMain;
        this.setText(sLabel);
        LabelChangeListener labelChange = new LabelChangeListener();
        addActionListener(labelChange);
    }
      
    class LabelChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                panMain.lblOutput.setText("New and improved");
            }
    }
}
