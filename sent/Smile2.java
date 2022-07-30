import java.applet.*;
import java.awt.*;

public class Smile2 extends Applet
{
public void paint(Graphics g)
{

g.setColor(Color.orange);
g.fillOval(40,40,200,200);
g.setColor(Color.orange);
g.fillOval(30,120,20,50);
g.setColor(Color.orange);
g.fillOval(230,120,20,50);

g.setColor(Color.blue);
g.drawOval(30,160,16,16);
g.setColor(Color.blue);
g.drawOval(235,160,16,16);

g.setColor(Color.white);
g.drawOval(70,90,50,50);
g.setColor(Color.white);
g.fillOval(80,100,30,30);
g.setColor(Color.black);
g.fillOval(90,120,8,8);

g.setColor(Color.white);
g.drawOval(160,90,50,50);
g.setColor(Color.white);
g.fillOval(170,100,30,30);
g.setColor(Color.black);
g.fillOval(180,120,8,8);

g.setColor(Color.white);
g.drawLine(50,40,70,90);

g.setColor(Color.red);
g.drawArc(80,170,120,40,0,180);

g.setColor(Color.black);
g.fillOval(140,140,5,5);

}
}
