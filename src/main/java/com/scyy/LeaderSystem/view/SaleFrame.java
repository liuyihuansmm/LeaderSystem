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

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 1362, 41);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		menuBar.add(mnNewMenu_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 51, 183, 633);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(142, 195, 235));
		panel_1.setBounds(0, 0, 183, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("操 作 菜 单");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/Start_Menu.png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 183, 63);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 62, 183, 571);
		panel.add(panel_2);
			
		JTree tree = new JTree();
		tree.setRowHeight(30);
		tree.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		tree.setShowsRootHandles(true);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("领导查询") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("销售");
						node_1.add(new DefaultMutableTreeNode("总销售"));
						node_1.add(new DefaultMutableTreeNode("近三月销售"));
						node_1.add(new DefaultMutableTreeNode("内部销售"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("采购");
						node_1.add(new DefaultMutableTreeNode("采购金额"));
						node_1.add(new DefaultMutableTreeNode("重点供应商"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户");
						node_1.add(new DefaultMutableTreeNode("重点客户"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("库存");
						node_1.add(new DefaultMutableTreeNode("近效库存"));
						node_1.add(new DefaultMutableTreeNode("失效库存"));
					add(node_1);
				}
			}
		));
		tree.setCellRenderer(new MyDefaultTreeCellRenderer());
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(41)
					.addComponent(tree, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(187, 51, 1175, 633);
		contentPane.add(tabbedPane);
		
	}
}
