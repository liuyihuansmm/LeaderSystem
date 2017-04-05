package com.scyy.LeaderSystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scyy.LeaderSystem.dao.SaleByDeptDao;
import com.scyy.LeaderSystem.model.SaleByDept;
import com.scyy.LeaderSystem.service.SaleByDeptService;

@Service
public class SaleByDeptServiceImpl implements SaleByDeptService{
	
	@Resource
	private SaleByDeptDao saleByDeptDao;
	
	@Override
	public List<SaleByDept> queryAll() {
		// TODO Auto-generated method stub
		return saleByDeptDao.queryAll();
		
	}

}
