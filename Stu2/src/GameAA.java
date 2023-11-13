

import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CarGameAA extends JFrame{
   private JPanel pn = new JPanel();
   
   private JLabel la1 = new JLabel("A");
   private JLabel la2 = new JLabel("B");
   private JLabel la3 = new JLabel("C");
   
   private JLabel laA = new JLabel("A");
   private JLabel laB = new JLabel("B");
   private JLabel laC = new JLabel("C");
   private JLabel laN = new JLabel("결과");
   
   private JButton btn = new JButton("Start");
   
   private MyThreadA th1 = new MyThreadA(la1);
   private MyThreadA th2 = new MyThreadA(la2);
   private MyThreadA th3 = new MyThreadA(la3);
   
   private TextField tx1 = new TextField("");
   private TextField tx2 = new TextField("0");
   private TextField tx3 = new TextField("0");
   private TextField tx4 = new TextField("0");
   
   private MyListener mylis = new MyListener();
   private int delay = 100;
   
   CarGameAA(){
      setTitle("CarRace");
      setSize(600,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      Container c = getContentPane();
      //pn.setSize(600, 200);
      c.add(pn);
      c.setLayout(null);
      
      la1.setSize(100,50);
      la1.setLocation(50,50);
      
      la2.setSize(100,50);
      la2.setLocation(50,100);
      
      la3.setSize(100,50);
      la3.setLocation(50,150);
      
      btn.setSize(100,30);
      btn.setLocation(450, 200);
      btn.addActionListener(mylis);
      
      tx1.setSize(50,20);
      tx1.setLocation(450,10);
      laN.setSize(50,20);
      laN.setLocation(465,30);
      c.add(laN);
      tx1.setText("A");
      
      tx2.setSize(50,20);
      tx2.setLocation(350,10);
      laC.setSize(50,20);
      laC.setLocation(370,30);
      c.add(laC);

      tx3.setSize(50,20);
      tx3.setLocation(300,10);
      laB.setSize(50,20);
      laB.setLocation(320,30);
      c.add(laB);
      
      tx4.setSize(50,20);
      tx4.setLocation(250,10);
      laA.setSize(50,20);
      laA.setLocation(270,30);
      c.add(laA);
      
      c.add(la1);
      c.add(la2);
      c.add(la3);
      c.add(btn);
      c.add(tx1);
      c.add(tx2);
      c.add(tx3);
      c.add(tx4);
   }
   class MyListener implements ActionListener{
      private boolean isRunning = false;
      private String String2 = "";

        public void actionPerformed(ActionEvent e) {
            if (isRunning) {
                // 스레드를 멈추고 버튼 텍스트를 "Start"로 변경합니다.
                th1.interrupt();
                th2.interrupt();
                th3.interrupt();
                isRunning = false;
                btn.setText("Start");
            } else {
                // 스레드를 다시 시작하고 버튼 텍스트를 "Stop"으로 변경합니다.
                th1 = new MyThreadA(la1);
                th2 = new MyThreadA(la2);
                th3 = new MyThreadA(la3);
                th1.start();
                th2.start();
                th3.start();
                isRunning = true;
                btn.setText("Stop");
            }

            
      }
   }

class MyThreadA extends Thread{
   private JLabel label;
   private int ix,iy;
   public MyThreadA(JLabel la) {
      label = la;
   }
   public void run() {
      ix = label.getX();
      iy = label.getY();
      
      for(int i = 0; i < 200; i++) {
         ix += 10 * Math.random();
         label.setLocation(ix, iy);
         
         try {
            Thread.sleep(delay);
         } catch (InterruptedException e) {
            return;
         } 
         
         if(la1.getX() != 0) {
               tx4.setText(Integer.toString(la1.getX()));
            }
         
         if(la2.getX() != 0) {
               tx3.setText(Integer.toString(la2.getX()));
            }
            
         if(la3.getX() != 0) {
               tx2.setText(Integer.toString(la3.getX()));
            }
         }
      }   
   }
}
public class GameAA {
   public static void main(String[] args) {
   new CarGameAA();   
   }
}