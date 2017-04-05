package com.scyy.LeaderSystem.view.common;

import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 抽象出所有窗体的父类
 * @author LYH
 *
 */
public class BaseFrame extends JFrame{
	
	protected JPanel contentPane;
	
	@Autowired
	protected MyMenuBar menuBar; 			//上方工具栏
	
	@Autowired
	protected MyOptionMenu navigator;		//左侧菜单栏
	
	@Autowired
	protected MyDataViewPane tabbedPane;	//右侧数据展示
	
	public void init(){
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BaseFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title_icon.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		
		contentPane.add(menuBar);
		contentPane.add(navigator);
		tabbedPane.init();
		contentPane.add(tabbedPane);
	}
	
}
