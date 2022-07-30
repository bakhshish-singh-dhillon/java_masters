import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse extends JFrame implements MouseMotionListener{
    
    JButton jb;
    JLabel lb;
    int x,y;
    Point p;
    Mouse()
    {
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listener");
        setLayout(null);
        jb=new JButton("drag me");
        jb.setBounds(0, 0, 100, 40);
        jb.addMouseMotionListener(this);
        lb=new JLabel("loc");
        lb.setBounds(20,350,50,20);
        lb.setVisible(true);
        add(jb);
        add(lb);
    }
    
    public static void main(String[] args) {
        new Mouse();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        p=getMousePosition();
        x=p.x-30;
        y=p.y-50;
        lb.setText(" "+x+" "+y);
        jb.setLocation(x, y);      
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {        
        p=getMousePosition();
        lb.setText(" "+p.x+" "+p.y);
    }
}