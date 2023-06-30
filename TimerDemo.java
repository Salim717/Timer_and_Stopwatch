import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TimerDemo extends JFrame implements ActionListener {
	
	int seconds = 11;
	JLabel label;
    JButton startButton;
    JPanel panel;
    Timer timer;
    
    public TimerDemo() {
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(300,100);
    	
    	panel = new JPanel();
    	 label = new JLabel();
    	 label.setOpaque(true);
    	 label.setBounds(50,50,50,50);
    	 label.setFont(new Font("Verdana",Font.PLAIN,35));
    	 label.setBorder(BorderFactory.createBevelBorder(1));
    	 label.setOpaque(true);
    	 label.setHorizontalAlignment(JTextField.CENTER);
    	 startButton = new JButton("Start");
    	 startButton.setBounds(50,50, 50, 50);
         startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
         startButton.setFocusable(false);
         startButton.addActionListener(this);
    	 startButton.addActionListener(this);
    	 
    	 panel.add(startButton);
    	 panel.add(label);
    	 add(panel);
    	 setLocationRelativeTo(null);
    	 setVisible(true);
    	 
    	 timer = new Timer(1000,this);
    }

	/*public static void main(String[] args) {
		new TimerDemo();

	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == startButton)
		{
			 timer.start();
			 startButton.setVisible(false);
			 	
		}
		
		if (seconds < 0) {
			
			timer.stop();
			
		}else {
			
			label.setText("Timer ->"+seconds);
		}
		seconds--;
		
	}

}
