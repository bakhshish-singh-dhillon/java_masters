/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dhillon-PC
 */
public class Test extends JFrame implements ActionListener,ItemListener,WindowListener,FocusListener
{
    JButton jb;
    JCheckBox cb[]=new JCheckBox[4];
    JTextField jf,jf1;
    String s;
    Test()
    {
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listener");
        setLayout(new FlowLayout());
        jb=new JButton("Submit");
        cb[0] =new JCheckBox("monday");
        cb[1] =new JCheckBox("tuesday");
        cb[2] =new JCheckBox("wednesday");
        cb[3] =new JCheckBox("thursday");
        cb[0].addItemListener(this);
        cb[1].addItemListener(this);
        cb[2].addItemListener(this);
        cb[3].addItemListener(this);
        jb.addActionListener(this);
        s="";
        addWindowListener(this);
        add(jb);
        add(cb[0]);
        add(cb[1]);
        add(cb[2]);
        add(cb[3]);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Test(); 
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "The day selected is:"+s);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        s="";
        for(int i=0;i<4;i++)
        {
            if(cb[i].isSelected())
            {
                s=s+" "+cb[i].getText();
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("icon");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("deicon");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("deactivated");
    }

    @Override
    public void focusGained(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
