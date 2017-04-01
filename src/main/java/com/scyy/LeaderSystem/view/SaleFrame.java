package com.scyy.LeaderSystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.awt.Frame;
import java.awt.MenuBar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import com.scyy.LeaderSystem.util.MyDefaultTreeCellRenderer;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Component;
import java.awt.Dimension;

public class SaleFrame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JPanel navigator;
	private JTabbedPane tpBaseData;
	private JTabbedPane tpVisable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleFrame frame = new SaleFrame();
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
	public SaleFrame() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title_icon.jpg")));
		setTitle("销售");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new MyMenuBar();
		contentPane.add(menuBar);
		
		navigator =  new MyOptionMenu();
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
		
	}
}
