import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
/*
<Applet code="ap3.class" width="1000" height="400"></Applet>
*/
public class ap3 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(new Color(189,106,23));
		g.fillRect(50,50,553,260);
		g.setColor(new Color(250,250,250));
		g.fillOval(100,240,130,130);
		g.setColor(new Color(189,106,23));
		g.fillOval(116,255,98,98);

		g.setColor(new Color(250,250,250));
		g.fillOval(370,240,130,130);
		g.setColor(new Color(189,106,23));
		g.fillOval(385,255,98,98);

		g.fillRoundRect(630,50,260,260,50,50);

		g.setColor(new Color(250,250,250));
		g.fillOval(690,240,130,130);
		g.setColor(new Color(189,106,23));
		g.fillOval(706,255,98,98);

		g.setColor(new Color(250,250,250));
		g.fillRoundRect(750,90,110,100,40,40);
		
	}
}