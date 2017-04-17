package com.scyy.LeaderSystem.model;

/**
 * 部门总销售,对应数据库表ldcx_bmxs
 * @author LYH
 *
 */
public class SaleByDept {
	
	private int id;  			//序号
	
	private String depName;			//部门名称
	
	private int dailySale;		//昨日销售
	
	private int monthSale;		//月累计销售
	
	private float monthComRate;	//月完成率
	
	private int monthBudget;		//月预算
	
	private int yearSale;		//年累计销售
	
	private int yearBudget;		//年预算
	
	private float yearComRate;		//年完成率
	
	private int overtimeMoney;	//超期金额
	
	private int receiveMoney;	//应收金额
	
	public SaleByDept(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getDailySale() {
		return dailySale;
	}

	public void setDailySale(int dailySale) {
		this.dailySale = dailySale;
	}

	public int getMonthSale() {
		return monthSale;
	}

	public void setMonthSale(int monthSale) {
		this.monthSale = monthSale;
	}

	public float getMonthComRate() {
		return monthComRate;
	}

	public void setMonthComRate(float monthComRate) {
		this.monthComRate = monthComRate;
	}

	public int getMonthBudget() {
		return monthBudget;
	}

	public void setMonthBudget(int monthBudget) {
		this.monthBudget = monthBudget;
	}

	public int getYearSale() {
		return yearSale;
	}

	public void setYearSale(int yearSale) {
		this.yearSale = yearSale;
	}

	public int getYearBudget() {
		return yearBudget;
	}

	public void setYearBudget(int yearBudget) {
		this.yearBudget = yearBudget;
	}

	public float getYearComRate() {
		return yearComRate;
	}

	public void setYearComRate(float yearComRate) {
		this.yearComRate = yearComRate;
	}

	public int getOvertimeMoney() {
		return overtimeMoney;
	}

	public void setOvertimeMoney(int overtimeMoney) {
		this.overtimeMoney = overtimeMoney;
	}

	public int getReceiveMoney() {
		return receiveMoney;
	}

	public void setReceiveMoney(int receiveMoney) {
		this.receiveMoney = receiveMoney;
	}

	@Override
	public String toString() {
		return "SaleByDept [id=" + id + ", depName=" + depName + ", dailySale=" + dailySale + ", monthSale=" + monthSale
				+ ", monthComRate=" + monthComRate + ", monthBudget=" + monthBudget + ", yearSale=" + yearSale
				+ ", yearBudget=" + yearBudget + ", yearComRate=" + yearComRate + ", overtimeMoney=" + overtimeMoney
				+ ", receiveMoney=" + receiveMoney + "]";
	}
	
}
