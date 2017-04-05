package com.scyy.LeaderSystem.view.common;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.springframework.stereotype.Component;

@Component
public class MyBaseDataPane extends JScrollPane{
	
	private JTable table;

	public MyBaseDataPane(){
		this.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		String columns[] = {"序号", "部门","日销售","本月销售","本月预算","本月完成率","本年累计","本年预算","本年完成率","超期金额","应收金额"};  
		//DefaultTableModel defaultTableModel = new DefaultTableModel(null,columns);
		Object[][] values = new Object[][] {{"1", "a", "b", "c", "d", "4", "a", null, null, null, null}};
		table = new JTable(values, columns);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"a", "b", "c", "d", "4", "a", null, null, null, 7},
				{"1", "b", "c", "d", "4", "a", null, null, null, null},
				{"2", "b", "c", "d", "4", "a", null, 6, null, null},
				{"aaa", "5", "c", "d", "4", "a", null, null, 4, null},
				{"acc", "b", "c", "d", "4", "a", 1, null, null, null},
			},
			new String[] {
				"\u90E8\u95E8", "\u65E5\u9500\u552E", "\u672C\u6708\u9500\u552E", "\u672C\u6708\u9884\u7B97", "\u672C\u6708\u5B8C\u6210\u7387", "\u672C\u5E74\u7D2F\u8BA1", "\u672C\u5E74\u9884\u7B97", "\u672C\u5E74\u5B8C\u6210\u7387", "\u8D85\u671F\u91D1\u989D", "\u5E94\u6536\u91D1\u989D"
			}
		));
		table.setRowHeight(40);
		table.getTableHeader().setFont(new Font("微软雅黑", Font.PLAIN, 18));
		table.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		DefaultTableCellRenderer r  = new DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class, r);
		this.setViewportView(table);
	}
}
