import java.applet.*;
import java.awt.*;

public class Smile extends Applet
{
public void paint(Graphics g)
{

g.setColor(Color.orange);
g.fillOval(40,40,200,200);
g.setColor(Color.orange);
g.fillOval(30,90,20,100);
g.setColor(Color.orange);
g.fillOval(230,90,20,100);

g.setColor(Color.blue);
g.fillOval(35,160,8,8);
g.setColor(Color.blue);
g.fillOval(235,160,8,8);

g.setColor(Color.white);
g.fillOval(70,90,30,50);
g.setColor(Color.black);
g.fillOval(70,110,30,30);

g.setColor(Color.white);
g.fillOval(170,90,30,50);
g.setColor(Color.black);
g.fillOval(170,110,30,30);

g.setColor(Color.red);
g.drawArc(80,158,120,40,180,180);
g.setColor(Color.pink);
g.fillArc(125,180,30,40,183,180);


int a[]={140,150,130};
int b[]={140,150,150};
g.setColor(Color.pink);
g.fillPolygon(a,b,3);

}
}
