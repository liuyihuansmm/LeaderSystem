package com.scyy.LeaderSystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scyy.LeaderSystem.dao.SaleBy3MonthDao;
import com.scyy.LeaderSystem.model.SaleBy3Month;
import com.scyy.LeaderSystem.model.SaleByDept;
import com.scyy.LeaderSystem.service.SaleBy3MonthService;

@Service
public class SaleBy3MonthServiceImpl implements SaleBy3MonthService{
	
	@Resource
	private SaleBy3MonthDao saleBy3MonthDao;
	
	@Override
	public List<SaleBy3Month> queryAll() {
		// TODO Auto-generated method stub
		return saleBy3MonthDao.queryAll();
	}

}
