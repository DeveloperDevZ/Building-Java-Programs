import java.awt.*;

public class DrawLine{
	public static void main(String[] args){
		DrawingPanel panel = new DrawingPanel(800, 200);
		DrawingPanel panel2 = new DrawingPanel(1000, 400);

		Graphics g = panel.getGraphics();
		Graphics g2 = panel2.getGraphics();

		g.drawLine(100, 100, 300, 0);
		g2.drawLine(100, 100, 400, 0);
	}
}