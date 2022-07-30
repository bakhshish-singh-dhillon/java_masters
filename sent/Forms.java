import javax.swing.*;
import java.awt.*;

public class Forms extends JFrame
{
Forms()
{
setTitle("Forms");
setVisible(true);
setSize(400,400);
setLayout(new FlowLayout(FlowLayout.TRAILING));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(true);
setLocationRelativeTo(null);

JLabel lb = new JLabel("Name");
add(lb);

JTextField tf = new JTextField(20);
add(tf);

JPasswordField pass=new JPasswordField(20);
add(pass);

JCheckBox chk=new JCheckBox("Hobby");
add(chk);

ButtonGroup gp=new ButtonGroup();
JRadioButton gen0=new JRadioButton("Male");
JRadioButton gen1=new JRadioButton("Female");
gp.add(gen0);
gp.add(gen1);
add(gen0);
add(gen1);

JComboBox jc=new JComboBox();
jc.addItem("Jan");
jc.addItem("Feb");
jc.addItem("March");
jc.addItem("April");
add(jc);

String a[]={"hello","hi","ok","bye"};

JList jl=new JList(a);
add(jl);

JTextArea jtl=new JTextArea();
add(jtl);

JButton btn=new JButton("Submit");
add(btn);
}

public static void main(String args[])
{
new Forms();
}
}