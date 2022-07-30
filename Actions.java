import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Actions extends JFrame implements ActionListener{

    JButton btn;
    
    public Actions() 
    {    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Actions");
        setLocationRelativeTo(null);
        
        btn=new JButton("Click Me");
        btn.setBounds(50, 50, 100, 30);
        add(btn);
        btn.addActionListener(this);
    }
    
    public static void main(String args[])
    {
        new Actions();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JOptionPane.showMessageDialog(null, "Button Clicked");
    }
}
