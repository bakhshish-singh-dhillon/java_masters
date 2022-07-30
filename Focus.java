import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Focus extends JFrame implements FocusListener{

    JTextField jf;
    public Focus() 
    {
	setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Focus");
        jf=new JTextField();
        jf.addFocusListener(this);
        jf.setBounds(30,30,100, 30);
        add(jf);
    }

    public static void main(String[] args) 
    {
        new Focus();
    }
    
    @Override
    public void focusGained(FocusEvent e) 
    {
        System.out.println("In Focus");
    }

    @Override
    public void focusLost(FocusEvent e) 
    {
        System.out.println("Focus Lost");
    }
    
}