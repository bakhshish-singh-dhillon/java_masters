import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dhillon-PC
 */
public class MouseList extends JFrame implements MouseListener{

    JButton jb;
    
    public MouseList() {
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listener");
        setLayout(null);
        
        jb=new JButton("Click Me");
        jb.addMouseListener(this);
        jb.setBounds(30, 50, 100, 30);
	add(jb);
    }
    
    public static void main(String[] args) 
    {
        new MouseList();        
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        System.out.println("Mouse Exit");
    }
}