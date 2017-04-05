package com.scyy.LeaderSystem.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.util.SpringFactory;

import java.awt.Toolkit;
import java.awt.Frame;

import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.ImageIcon;

@Component("SaleFrame")
public class SaleFrame extends JFrame {

	private JPanel contentPane;
	
	@Autowired
	private MyMenuBar menuBar;
	@Autowired
	private MyOptionMenu navigator;

	private JTabbedPane tpBaseData;
	private JTabbedPane tpVisable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleFrame frame = (SaleFrame) SpringFactory.getInstance().getBean("SaleFrame");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//构造方法只是为了Design视图下的测试，正式情况下不要用，否则不能DI和IOC
//	public SaleFrame(){
//		setExtendedState(Frame.MAXIMIZED_BOTH);
//		setIconImage(Toolkit.getDefaultToolkit().getImage(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title_icon.jpg")));
//		setTitle("销售");
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		menuBar = new MyMenuBar();
//		contentPane.add(menuBar);
//		navigator = new MyOptionMenu();
//		contentPane.add(navigator);
//		
//		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.setBackground(new Color(255, 255, 255));
//		tabbedPane.setBounds(187, 51, 1175, 633);
//		contentPane.add(tabbedPane);
//		
//		tpBaseData = new JTabbedPane(JTabbedPane.TOP);
//		tpBaseData.setFont(new Font("微软雅黑", Font.PLAIN, 16));
//		tpBaseData.setBackground(new Color(255, 255, 255));
//		tabbedPane.addTab("基本数据", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/database.png")), tpBaseData, null);
//		
//		tpVisable = new JTabbedPane(JTabbedPane.TOP);
//		tpVisable.setFont(new Font("微软雅黑", Font.PLAIN, 16));
//		tpVisable.setBackground(new Color(255, 255, 255));
//		tabbedPane.addTab("可视化", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/visable.png")), tpVisable, null);
//		
//		this.setVisible(true);
//	}
	
	public void init(){
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title_icon.jpg")));
		setTitle("销售");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(menuBar);
		contentPane.add(navigator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(187, 51, 1175, 633);
		contentPane.add(tabbedPane);
		
		tpBaseData = new JTabbedPane(JTabbedPane.TOP);
		tpBaseData.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		tpBaseData.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("基本数据", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/database.png")), tpBaseData, null);
		
		tpVisable = new JTabbedPane(JTabbedPane.TOP);
		tpVisable.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		tpVisable.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("可视化", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/visable.png")), tpVisable, null);
		
		this.setVisible(true);
	}
}
