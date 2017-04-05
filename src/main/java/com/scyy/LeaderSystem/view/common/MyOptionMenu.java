package com.scyy.LeaderSystem.view.common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.util.MyDefaultTreeCellRenderer;
import com.scyy.LeaderSystem.view.SaleFrame;

@Component
public class MyOptionMenu extends JPanel {
	
	private JTree tree;
	
	public MyOptionMenu(){
		this.setBounds(0, 51, 183, 633);
		this.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(142, 195, 235));
		panel_1.setBounds(0, 0, 183, 63);
		this.add(panel_1);
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
		this.add(panel_2);
		
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
		
		//默认展开树的每个节点
		for(int i=0; i<tree.getRowCount(); i++)
	    {
	    	tree.expandRow(i);
	    }
		
		this.tree = tree;
	}
}
