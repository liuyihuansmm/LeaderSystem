package com.scyy.LeaderSystem.view.common;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 右侧数据展示窗体类
 * @author LYH
 *
 */
@Component
public class MyDataViewPane extends JTabbedPane {
	
	@Autowired
	private MyBaseDataPane scrollPane_basedata; 	//基本数据面板
	
	@Autowired
	private MyDataVisualPane scrollPane_visualbe;		//可视化面板
	
	public void init(){
		this.setTabPlacement(JTabbedPane.TOP);
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(187, 51, 1175, 633);
		
		this.addTab("基本数据", new ImageIcon(MyDataViewPane.class.getResource("/com/scyy/LeaderSystem/resources/images/database.png")), scrollPane_basedata, null);
		this.addTab("可视化", new ImageIcon(MyDataViewPane.class.getResource("/com/scyy/LeaderSystem/resources/images/visable.png")), scrollPane_visualbe, null);
	}
}
