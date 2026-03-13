import java.awt.*;

class SimpleFrame1 extends Frame
{
	String msg = "Simple Frame Window ";
	int x=50 , y=250;

	SimpleFrame1()
	{
		setSize(1800,600);
		setTitle("Frame");
		setBackground(Color.orange);
		setForeground(Color.blue);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
		g.drawString("This is Sample program",x,275);
	}
	public static void main(String args[])
	{
		new SimpleFrame1();
	}	
}