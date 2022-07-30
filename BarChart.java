import java.applet.*;
import java.awt.*;

public class BarChart extends Applet
{
public void paint(Graphics g)
{
int x=30;
int y=30;
for(int i=0;i<5;i++)
{
g.fillRect(x,y,50,300-y);
x=x+70;
y=y+50;
}
}
}
