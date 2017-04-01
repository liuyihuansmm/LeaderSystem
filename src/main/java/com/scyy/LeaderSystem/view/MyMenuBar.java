package com.scyy.LeaderSystem.view;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MyMenuBar extends JMenuBar{
	
	public MyMenuBar(){
		//JMenuBar menuBar = new JMenuBar();
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1362, 41);
		
		JMenu mnNewMenu = new JMenu("New menu");
		this.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		this.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		this.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		this.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		this.add(mnNewMenu_4);
	}
	
}
