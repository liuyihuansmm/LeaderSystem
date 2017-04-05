package com.scyy.LeaderSystem.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scyy.LeaderSystem.service.SaleByDeptService;
import com.scyy.LeaderSystem.view.common.BaseFrame;

/**
 * 总销售面板
 * @author LYH
 *
 */
@Component
public class TotalSaleFrame extends BaseFrame{
	
	@Autowired
	private  SaleByDeptService saleByDeptService;
	
	public void init(){
		super.init();
		this.setTitle("总销售");
		this.setVisible(true);
	}
	
}
