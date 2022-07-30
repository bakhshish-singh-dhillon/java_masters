import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Keys extends JFrame implements KeyListener{
    
    public Keys() {
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listener");
        setLayout(null);
        
        addKeyListener(this);
    }
    
    public static void main(String[] args) 
    {
        new Keys();        
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        System.out.println("Key Typed="+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        System.out.println("Key Pressed="+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        System.out.println("Key Released="+e.getKeyChar());
    }
}