import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Items extends JFrame implements ItemListener, ActionListener{

    JCheckBox cb[]=new JCheckBox[4];
    String s;
    JButton jb;
    
    public Items() 
    {    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Actions");
        setLayout(new FlowLayout());
        
        cb[0] =new JCheckBox("monday");
        cb[1] =new JCheckBox("tuesday");
        cb[2] =new JCheckBox("wednesday");
        cb[3] =new JCheckBox("thursday");
        cb[0].addItemListener(this);
        cb[1].addItemListener(this);
        cb[2].addItemListener(this);
        cb[3].addItemListener(this);
        
        jb=new JButton("Submit");
        jb.addActionListener(this);
        add(cb[0]);
        add(cb[1]);
        add(cb[2]);
        add(cb[3]);
        add(jb);
        
    }
    
    public static void main(String args[])
    {
        new Items();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
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
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "The day selected is:"+s);
    }
}
