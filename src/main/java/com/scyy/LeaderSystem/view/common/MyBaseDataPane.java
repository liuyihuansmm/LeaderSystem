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
	
	protected JTable table;

	protected String[] talbeTitle;
	
	protected Object[][] tableData;

	public MyBaseDataPane(){
		this.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		table = new JTable();
		table.setRowHeight(35);
		table.getTableHeader().setFont(new Font("微软雅黑", Font.PLAIN, 18));
		table.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		DefaultTableCellRenderer r  = new DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class, r);
		this.setViewportView(table);
	}
	
	public void init(Object[][] tableData,Object[] talbeTitle){
		if(tableData!=null && talbeTitle!=null){
			table.setModel(new DefaultTableModel(tableData,talbeTitle));
			table.getColumnModel().getColumn(0).setPreferredWidth(200);
		}
		
	}
	
	public void init(){	}

	public String[] getTalbeTitle() {
		return talbeTitle;
	}

	public void setTalbeTitle(String[] talbeTitle) {
		this.talbeTitle = talbeTitle;
	}

	public Object[][] getTableData() {
		return tableData;
	}

	public void setTableData(Object[][] tableData) {
		this.tableData = tableData;
	}
	
}
