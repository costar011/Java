import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadA extends JFrame{
   private JLabel laA = new JLabel();
   private TimerThread th = new TimerThread(laA);
   
   ThreadA(){
      setTitle("Thread.. Timer");
      setSize(300,170);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      laA.setFont(new Font("Gothic",Font.ITALIC,50));
      
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(laA);
      th.start();
   }
   
   
   class TimerThread extends Thread{
      private JLabel laB;
      public TimerThread(JLabel la) {
         laB = la;
      }
      public void run() {
         Random rnd = new Random();
         int n = 0;
         while(true) {
            laB.setText(Integer.toString(n));
            n++;
            try {
               Thread.sleep(rnd.nextInt(800));
            } catch(InterruptedException e) {
               return;
            }
         }
      }
   }
}


public class Test {
   public static void main(String[] args) {
      new ThreadA();
      new ThreadA();
      new ThreadA();
   }
}