import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.BorderLayout;


public class GUITUT {
     JFrame frame = new JFrame();
     JLabel label = new JLabel("This is a Label");
     

    public GUITUT(){
     JPanel panel = new JPanel();
     JButton button = new JButton("Click Me If You Can!");


     panel.add(button);
     panel.add(label);
     panel.setLayout(new GridLayout(0,1));
     panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
     panel.setBackground(Color.green);


     frame.setVisible(true);
     frame.add(panel, BorderLayout.CENTER);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setResizable(true);
     frame.setTitle("My GUI Is Looking Good");
    }
    

    public static void main(String[]args){
        new GUITUT();
    }
}
