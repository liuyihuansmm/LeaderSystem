package com.scyy.LeaderSystem.view;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.springframework.stereotype.Component;

@Component
public class MyMenuBar extends JMenuBar{
	
	public MyMenuBar(){
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1362, 41);
		
		JMenu mnNewMenu = new JMenu("关于我们");
		this.add(mnNewMenu);
		
	}
	
}
