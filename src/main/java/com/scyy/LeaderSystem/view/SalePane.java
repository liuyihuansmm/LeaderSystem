package com.scyy.LeaderSystem.view;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.model.SaleByDept;
import com.scyy.LeaderSystem.service.SaleByDeptService;
import com.scyy.LeaderSystem.util.NumFormat;
import com.scyy.LeaderSystem.view.common.MyDataViewPane;

/**
 * 部门总销售
 * @author LYH
 *
 */
@Component("SalePane")
public class SalePane extends MyDataViewPane {
	@Autowired
	private SaleByDeptService saleByDeptService;
	
	public void init(){
		this.getScrollPane_basedata().init(getTableData(),getTableTitle());
	}
	
	// 表体数据
	public Object[][] getTableData() {
		List<SaleByDept> list = saleByDeptService.queryAll();
		int rowCount = list.size();
		Object[][] datas = new Object[rowCount][10];
		for (int i = 0; i < rowCount; i++) {
			datas[i][0] = NumFormat.format(list.get(i).getDepName());
			datas[i][1] = NumFormat.format(list.get(i).getDailySale());
			datas[i][2] = NumFormat.format(list.get(i).getMonthSale());
			datas[i][3] = NumFormat.format(list.get(i).getMonthBudget());
			datas[i][4] = NumFormat.format(list.get(i).getMonthComRate());
			datas[i][5] = NumFormat.format(list.get(i).getYearSale());
			datas[i][6] = NumFormat.format(list.get(i).getYearBudget());
			datas[i][7] = NumFormat.format(list.get(i).getYearComRate());
			datas[i][8] = NumFormat.format(list.get(i).getOvertimeMoney());
			datas[i][9] = NumFormat.format(list.get(i).getReceiveMoney());
		}
		return datas;
	}

	// 表头名称
	public String[] getTableTitle() {
		Calendar now = Calendar.getInstance();
		String columns[] = { "部门", (now.get(Calendar.MONTH) + 1) + "月" + (now.get(Calendar.DAY_OF_MONTH) - 1) + "日销售",
				"本月销售", "本月预算", "本月完成率", "本年累计", "本年预算", "本年完成率", "超期金额", "应收金额" };
		return columns;
	}
}
