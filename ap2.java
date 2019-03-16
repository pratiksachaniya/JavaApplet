import java.applet.Applet;
import java.awt.*;
/*
<Applet code="ap2.class" width="500" height="500"></Applet>
*/
public class ap2 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(new Color(0,250,0));
		g.drawRect(10,10,200,200);
	}
}