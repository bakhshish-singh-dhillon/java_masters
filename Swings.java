
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Swings extends JFrame
{
    Swings()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(15, 1,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swings");
        JLabel lbl=new JLabel("Name");
        JTextField txt=new JTextField();
        JPasswordField pass=new JPasswordField();
        JCheckBox chkBox=new JCheckBox("Hobby");      
        ButtonGroup gp=new ButtonGroup();
        JRadioButton male=new JRadioButton("M");
        JRadioButton female=new JRadioButton("F");
        
        JComboBox com=new JComboBox();
        com.addItem("Sunday");
        com.addItem("Monday");
        com.addItem("Tuesday");
        com.addItem("Wednesday");
        com.addItem("Thursday");
        com.addItem("Friday");
        com.addItem("Saturday");
        
        String list[]={"Football","Soccer","Gardening","Tennis"};
        JList li=new JList(list);
        li.setSize(100, 100);
     
        JTextArea area=new JTextArea(3,4);
        
        JButton btn=new JButton("Click Me");
        
        add(lbl);
        add(txt);
        add(pass);
        add(chkBox);
        gp.add(male);
        gp.add(female);
        add(male);
        add(female);
        add(com);
        add(li);
        add(area);
        add(btn);
        
    }
       
    public static void main(String a[])
    {
     new Swings();   
    
    }
    
}