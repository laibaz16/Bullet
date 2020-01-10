import java.awt.event.*;

public class Bullet implements KeyListener  {
  int x=700, xradius=100, y=760;
  int mx=+(x+xradius/2), my=y, mxsp=0, mysp=0, count=0;
  
  public void keyReleased (KeyEvent e){}   
  public void keyTyped(KeyEvent e){}  
  
  public void keyPressed (KeyEvent e)
  {
    int code =e.getKeyCode(); 
    
    if (code == KeyEvent.VK_SPACE)
    {
      count=1;
      mxsp=5;
      mysp=5;
    }
  }
  public void move(){
    if (count==1)
    {
      my-=mysp;
    }
  }
}
