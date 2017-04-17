package com.scyy.LeaderSystem.view;

import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.view.common.MyDataViewPane;

/**
 * 近三月销售
 * 
 * @author LYH
 *
 */
@Component("SaleThreeMonthPane")
public class SaleThreeMonthPane extends MyDataViewPane {
	
	public void init(){
		this.getScrollPane_basedata().init(null,getTableTitle());
	}
	
	// 表头名称
	public String[] getTableTitle() {
		Calendar now = Calendar.getInstance();
		String columns[] = { "部门", (now.get(Calendar.MONTH)) + "月销售", "去年" + (now.get(Calendar.MONTH)) + "月销售", "同比增长",
				(now.get(Calendar.MONTH)) + "月预算", (now.get(Calendar.MONTH)) + "月完成率",
				(now.get(Calendar.MONTH) - 1) + "月销售", "去年" + (now.get(Calendar.MONTH) - 1) + "月销售", "同比增长",
				(now.get(Calendar.MONTH) - 1) + "月预算", (now.get(Calendar.MONTH) - 1) + "月完成率",
				(now.get(Calendar.MONTH) - 2) + "月销售", "去年" + (now.get(Calendar.MONTH) - 2) + "月销售", "同比增长",
				(now.get(Calendar.MONTH) - 2) + "月预算", (now.get(Calendar.MONTH) - 2) + "月完成率", };
		return columns;
	}
}
