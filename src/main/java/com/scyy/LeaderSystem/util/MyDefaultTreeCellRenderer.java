package com.scyy.LeaderSystem.util;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * 树形菜单的图标设置
 * 
 * @author LYH
 *
 */
public class MyDefaultTreeCellRenderer extends DefaultTreeCellRenderer {

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		// TODO Auto-generated method stub
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

		if (sel) {
			setForeground(getTextSelectionColor());
		} else {
			setForeground(getTextNonSelectionColor());
		}

		// 得到每个节点的TreeNode
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;

		// 得到每个节点的text
		String str = node.toString();

		switch (str) {
		case "领导查询":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/boss_menu.png")));
			break;
		case "销售":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/money_menu.png")));
			break;
		case "总销售":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/totalSale_menu.png")));
			break;
		case "近三月销售":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/history_menu.png")));
			break;
		case "内部销售":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/innerSale_menu.png")));
			break;
		case "采购":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/po_menu.png")));
			break;
		case "采购金额":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/poMoney_menu.png")));
			break;
		case "重点供应商":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/supplier_menu.png")));
			break;
		case "客户":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/customer_menu.png")));
			break;
		case "重点客户":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/key_customer_menu.png")));
			break;
		case "库存":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/stock_menu.png")));
			break;
		case "近效库存":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/time_menu.png")));
			break;
		case "失效库存":
			this.setIcon(new ImageIcon(MyDefaultTreeCellRenderer.class.getResource("/com/scyy/LeaderSystem/resources/images/timeout_menu.png")));
			break;
		default:
			break;
		}

		return this;
	}

}
