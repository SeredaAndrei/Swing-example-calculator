package Calk;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calk implements ActionListener {
	JTextField tfl1,tfl2;
	JLabel jlb;
	JButton jbt;
	 public Calk(){
		JFrame jfr = new JFrame("Calk JFrame");
		jfr.setSize(500,1000);
		jfr.setLayout(new GridLayout(5,1));
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfl1 = new JTextField();
		//tfl1.setSize(100, 50);
		
		tfl2 = new JTextField();
		//tfl2.setSize(100, 50);
		
		jlb = new JLabel("Don't Touch");
		//jlb.setSize(100, 50);
		
		jbt = new JButton("Press Me Please");
		jbt.addActionListener(this);
		
		jfr.add(tfl1);
		jfr.add(tfl2);
		jfr.add(jlb);
		jfr.add(jbt);
		
		
		jfr.setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		
		new Calk();
		

	}

	@Override
	public void actionPerformed(ActionEvent todo) {
		// TODO Auto-generated method stub
		if (todo.getActionCommand().equals("Press Me Please"))
			jlb.setText(" " + (Float.parseFloat(tfl1.getText()) + (Float.parseFloat(tfl2.getText()))));
			else 
				jlb.setText("Press Me Please");
	}

}
