package com.scyy.LeaderSystem.model;

/**
 * 近3月销售对应表
 * @author LYH
 *
 */
public class SaleBy3Month {
	
	private String deptName;				//部门名称
	
	private int lastMonth1Sale;				//上月销售
	
	private int lastYearMonth1Sale;			//去年上月销售
	
	private float month1Rate;				//上月同比增长:上月销售/去年上月销售-1
		
	private int month1Budget;				//上月预算
	
	private float month1ComRate;			//上月完成率:上月销售/上月预算
	
	private int lastMonth2Sale;				//上2月销售
	
	private int lastYearMonth2Sale;			//去年上2月销售
	
	private float month2Rate;				//上2月同比增长:上2月销售/去年上2月销售-1
	
	private int month2Budget;				//上2月预算
	
	private float month2ComRate;			//上2月完成率:上2月销售/上2月预算
	
	private int lastMonth3Sale;				//上3月销售
	
	private int lastYearMonth3Sale;			//去年上3月销售
	
	private float month3Rate;				//上3月同比增长:上3月销售/去年上3月销售-1
	
	private int month3Budget;				//上3月预算
	
	private float month3ComRate;			//上2月完成率:上2月销售/上2月预算

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getLastMonth1Sale() {
		return lastMonth1Sale;
	}

	public void setLastMonth1Sale(int lastMonth1Sale) {
		this.lastMonth1Sale = lastMonth1Sale;
	}

	public int getLastYearMonth1Sale() {
		return lastYearMonth1Sale;
	}

	public void setLastYearMonth1Sale(int lastYearMonth1Sale) {
		this.lastYearMonth1Sale = lastYearMonth1Sale;
	}

	public float getMonth1Rate() {
		return month1Rate;
	}

	public void setMonth1Rate(float month1Rate) {
		this.month1Rate = month1Rate;
	}

	public int getMonth1Budget() {
		return month1Budget;
	}

	public void setMonth1Budget(int month1Budget) {
		this.month1Budget = month1Budget;
	}

	public float getMonth1ComRate() {
		return month1ComRate;
	}

	public void setMonth1ComRate(float month1ComRate) {
		this.month1ComRate = month1ComRate;
	}

	public int getLastMonth2Sale() {
		return lastMonth2Sale;
	}

	public void setLastMonth2Sale(int lastMonth2Sale) {
		this.lastMonth2Sale = lastMonth2Sale;
	}

	public int getLastYearMonth2Sale() {
		return lastYearMonth2Sale;
	}

	public void setLastYearMonth2Sale(int lastYearMonth2Sale) {
		this.lastYearMonth2Sale = lastYearMonth2Sale;
	}

	public float getMonth2Rate() {
		return month2Rate;
	}

	public void setMonth2Rate(float month2Rate) {
		this.month2Rate = month2Rate;
	}

	public int getMonth2Budget() {
		return month2Budget;
	}

	public void setMonth2Budget(int month2Budget) {
		this.month2Budget = month2Budget;
	}

	public float getMonth2ComRate() {
		return month2ComRate;
	}

	public void setMonth2ComRate(float month2ComRate) {
		this.month2ComRate = month2ComRate;
	}

	public int getLastMonth3Sale() {
		return lastMonth3Sale;
	}

	public void setLastMonth3Sale(int lastMonth3Sale) {
		this.lastMonth3Sale = lastMonth3Sale;
	}

	public int getLastYearMonth3Sale() {
		return lastYearMonth3Sale;
	}

	public void setLastYearMonth3Sale(int lastYearMonth3Sale) {
		this.lastYearMonth3Sale = lastYearMonth3Sale;
	}

	public float getMonth3Rate() {
		return month3Rate;
	}

	public void setMonth3Rate(float month3Rate) {
		this.month3Rate = month3Rate;
	}

	public int getMonth3Budget() {
		return month3Budget;
	}

	public void setMonth3Budget(int month3Budget) {
		this.month3Budget = month3Budget;
	}

	public float getMonth3ComRate() {
		return month3ComRate;
	}

	public void setMonth3ComRate(float month3ComRate) {
		this.month3ComRate = month3ComRate;
	}
	
}
