package com.scyy.LeaderSystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.scyy.LeaderSystem.util.IpUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		if(IpUtil.check()){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainFrame frame = new MainFrame();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}else{
			String content = JOptionPane.showInputDialog(null,"你的Mac尚未注册,是否注册？");
			if(content == null){
				System.exit(0);
			}
			if(content.equals("scyy")){
				IpUtil.registMac();
				JOptionPane.showMessageDialog(null, "注册成功,请重启程序！");
			}else{
				JOptionPane.showMessageDialog(null, "密码错误！");
			}
			System.exit(0);
		}
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title_icon.jpg")));
		setTitle("领导查询");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(204, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
		);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnPanel.setBackground(new Color(204, 255, 255));
		
		JButton btnSale = new JButton("销售");
		btnSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaleFrame().setVisible(true);
			}
		});
		btnSale.setFont(new Font("微软雅黑", Font.BOLD, 12));
		btnSale.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/sale.png")));
		
		JButton btnInnerSale = new JButton("内部交易");
		btnInnerSale.setFont(new Font("微软雅黑", Font.BOLD, 12));
		btnInnerSale.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/trans.png")));
		
		JButton btnCustomer = new JButton("重点客户");
		btnCustomer.setFont(new Font("微软雅黑", Font.BOLD, 12));
		btnCustomer.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/customers.png")));
		
		JButton btnStock = new JButton("库存");
		btnStock.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/warehouse.png")));
		btnStock.setFont(new Font("微软雅黑", Font.BOLD, 12));
		
		JButton btnPur = new JButton("采购");
		btnPur.setFont(new Font("微软雅黑", Font.BOLD, 12));
		btnPur.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/po.png")));
		
		JButton btnSetting = new JButton("自定义");
		btnSetting.setFont(new Font("微软雅黑", Font.BOLD, 12));
		btnSetting.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/setting.png")));
		GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
		gl_btnPanel.setHorizontalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_btnPanel.createSequentialGroup()
							.addGap(49)
							.addComponent(btnSale, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(btnInnerSale, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_btnPanel.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCustomer, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPur, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.addGap(43)
							.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSetting, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnStock, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_btnPanel.setVerticalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_btnPanel.createSequentialGroup()
							.addGap(22)
							.addComponent(btnSale, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_btnPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(btnInnerSale, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCustomer, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnStock, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSetting, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPur, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		btnPanel.setLayout(gl_btnPanel);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(255, 255, 255));
		
		JPanel notePanel = new JPanel();
		notePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		notePanel.setBackground(new Color(204, 255, 255));
		
		JPanel buttomPanel = new JPanel();
		buttomPanel.setBackground(new Color(204, 255, 255));
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_mainPanel.createSequentialGroup()
							.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(notePanel, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addComponent(buttomPanel, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE)
						.addComponent(titlePanel, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addComponent(titlePanel, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
						.addComponent(notePanel, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttomPanel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		titlePanel.setLayout(null);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/com/scyy/LeaderSystem/resources/images/title.jpg")));
		logoLabel.setBounds(0, 0, 244, 165);
		titlePanel.add(logoLabel);
		
		JLabel titleLabel = new JLabel("领 导 查 询");
		titleLabel.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 40));
		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		titleLabel.setBounds(244, 0, 439, 165);
		titlePanel.add(titleLabel);
		
		JLabel slogonLabel = new JLabel("关爱生命，呵护健康");
		slogonLabel.setBackground(new Color(255, 255, 255));
		slogonLabel.setFont(new Font("仿宋", Font.BOLD, 12));
		slogonLabel.setBounds(498, 104, 117, 28);
		titlePanel.add(slogonLabel);
		
		JLabel corperateLable = new JLabel("Copytright @ 2017 国药控股四川医药股份有限公司 信息部");
		buttomPanel.add(corperateLable);
		corperateLable.setBackground(new Color(102, 153, 255));
		corperateLable.setHorizontalAlignment(SwingConstants.CENTER);
		corperateLable.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		mainPanel.setLayout(gl_mainPanel);
		contentPane.setLayout(gl_contentPane);
		
		//设置窗体在屏幕中间
		this.setLocationRelativeTo(null);
	}
}
