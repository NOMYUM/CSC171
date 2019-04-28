
/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 11
 * Lab section day/time: MW 2:00-3:15PM
 */

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Canvas extends JComponent implements MouseListener, MouseMotionListener {
   
   private static final long serialVersionUID = 1L;
   
         protected int x;
         protected int y;
   
   public Canvas() {
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
   }

   int q, k;

     public void paint(Graphics g) { 
    	 	super.paint(g);
    	 	if (q!= 0&& k!=0) {g.setColor(Color.black);
    	 	g.fillOval(q, k, 50, 50); 
    	 	g.drawOval(q, k, 50, 50);
    	 	}
     }
    
   @Override
   public void mouseClicked(MouseEvent e) {
      q = e.getX();
      k = e.getY();
      repaint();
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      System.out.println("Mouse entered " + e);
   }

   @Override
   public void mouseExited(MouseEvent e) {
      System.out.println("Mouse Exited " + e);
   }

   @Override
   public void mousePressed(MouseEvent e) {
      System.out.println("Mouse Pressed" + e);
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      System.out.println("Mouse Released" + e);
   }
   
   @Override
   public void mouseDragged(MouseEvent e) {
      q = e.getX();
      k = e.getY();

      Graphics o= this.getGraphics();
        super.paint(o);
        if (q!= 0&& k!=0) {o.setColor(Color.black);    o.fillOval(q, k, 50, 50); o.drawOval(q, k, 50, 50);}   
   }
   
   @Override
   public void mouseMoved(MouseEvent e) {
   }
   
   public static void main(String[] args) {
      Canvas canvas= new Canvas();
      JFrame frame = new JFrame();
      frame.setSize(600,600);
      frame.add(canvas);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setFocusable(true);
   }
}