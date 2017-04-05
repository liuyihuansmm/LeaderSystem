package com.scyy.LeaderSystem.model;

/**
 * 部门总销售,对应数据库表ldcx_bmxs
 * @author LYH
 *
 */
public class SaleByDept {
	
	private Integer id;  			//序号
	
	private String depName;			//部门名称
	
	private Double dailySale;		//昨日销售
	
	private Double monthSale;		//月累计销售
	
	private Double monthComRate;	//月完成率
	
	private Double monthBudget;		//月预算
	
	private Double yearSale;		//年累计销售
	
	private Double yearBudget;		//年预算
	
	private Double yearComRate;		//年完成率
	
	private Double overtimeMoney;	//超期金额
	
	private Double receiveMoney;	//应收金额
	
	public SaleByDept(){}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Double getDailySale() {
		return dailySale;
	}

	public void setDailySale(Double dailySale) {
		this.dailySale = dailySale;
	}

	public Double getMonthSale() {
		return monthSale;
	}

	public void setMonthSale(Double monthSale) {
		this.monthSale = monthSale;
	}

	public Double getMonthComRate() {
		return monthComRate;
	}

	public void setMonthComRate(Double monthComRate) {
		this.monthComRate = monthComRate;
	}

	public Double getMonthBudget() {
		return monthBudget;
	}

	public void setMonthBudget(Double monthBudget) {
		this.monthBudget = monthBudget;
	}

	public Double getYearSale() {
		return yearSale;
	}

	public void setYearSale(Double yearSale) {
		this.yearSale = yearSale;
	}

	public Double getYearBudget() {
		return yearBudget;
	}

	public void setYearBudget(Double yearBudget) {
		this.yearBudget = yearBudget;
	}

	public Double getYearComRate() {
		return yearComRate;
	}

	public void setYearComRate(Double yearComRate) {
		this.yearComRate = yearComRate;
	}

	public Double getOvertimeMoney() {
		return overtimeMoney;
	}

	public void setOvertimeMoney(Double overtimeMoney) {
		this.overtimeMoney = overtimeMoney;
	}

	public Double getReceiveMoney() {
		return receiveMoney;
	}

	public void setReceiveMoney(Double receiveMoney) {
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
