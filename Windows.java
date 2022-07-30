import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Windows extends JFrame implements WindowListener{

    public Windows() 
    {
	setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Windows");
        addWindowListener(this);
    }

    public static void main(String[] args) 
    {
        new Windows();
    }
    @Override
    public void windowOpened(WindowEvent e) 
    {
        System.out.println("Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) 
    {
        System.out.println("Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) 
    {
    System.out.println("iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {
    System.out.println("deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) 
    {
        System.out.println("activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {
    System.out.println("deactivated");
    }
    
}
