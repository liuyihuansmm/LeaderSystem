package com.scyy.LeaderSystem.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.view.common.MyMenuBar;
import com.scyy.LeaderSystem.view.common.MyOptionMenu;

import java.awt.Toolkit;
import java.awt.Frame;

import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class SaleFrame extends JFrame {
	private JPanel contentPane;
	
	@Autowired
	private MyMenuBar menuBar;
	@Autowired
	private MyOptionMenu navigator;
	private JTable table;
	private JScrollPane scrollPane_visable;

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
	
	//构造方法只是为了Design视图下的测试，正式情况下不要用，否则不能DI和IOC
	public SaleFrame(){
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
		navigator = new MyOptionMenu();
		contentPane.add(navigator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(187, 51, 1175, 633);
		contentPane.add(tabbedPane);
		
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
		JScrollPane scrollPane_basedata = new JScrollPane(table);
		scrollPane_basedata.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		tabbedPane.addTab("基本数据", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/database.png")), scrollPane_basedata, null);
		
		scrollPane_visable = new JScrollPane();
		scrollPane_visable.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		tabbedPane.addTab("可视化", new ImageIcon(SaleFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/visable.png")), scrollPane_visable, null);
		
		this.setVisible(true);
	}
	
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
		
		this.setVisible(true);
	}
}
