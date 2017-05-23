/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonfile.db.browser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KorzinowskiAndreasMI
 */
public class BrowserController implements ActionListener {

    public BrowserView view;
    public BrowserModel model;
    
    
    public BrowserController() {
    
        view = new BrowserView(this);
        model = new BrowserModel();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
        
    }
    
    

    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Action im Controller: " + ae.getActionCommand());
        
        if (ae.getActionCommand().equalsIgnoreCase(BrowserStatics.APP_END)) {
            this.view.dispose();
        }
        
        
    }
    
}
