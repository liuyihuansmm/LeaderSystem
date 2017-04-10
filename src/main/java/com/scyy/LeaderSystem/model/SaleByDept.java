package com.scyy.LeaderSystem.model;

/**
 * 部门总销售,对应数据库表ldcx_bmxs
 * @author LYH
 *
 */
public class SaleByDept {
	
	private Integer id;  			//序号
	
	private String depName;			//部门名称
	
	private Integer dailySale;		//昨日销售
	
	private Integer monthSale;		//月累计销售
	
	private Double monthComRate;	//月完成率
	
	private Integer monthBudget;		//月预算
	
	private Integer yearSale;		//年累计销售
	
	private Integer yearBudget;		//年预算
	
	private Double yearComRate;		//年完成率
	
	private Integer overtimeMoney;	//超期金额
	
	private Integer receiveMoney;	//应收金额
	
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

	public Integer getDailySale() {
		return dailySale;
	}

	public void setDailySale(Integer dailySale) {
		this.dailySale = dailySale;
	}

	public Integer getMonthSale() {
		return monthSale;
	}

	public void setMonthSale(Integer monthSale) {
		this.monthSale = monthSale;
	}

	public Double getMonthComRate() {
		return monthComRate;
	}

	public void setMonthComRate(Double monthComRate) {
		this.monthComRate = monthComRate;
	}

	public Integer getMonthBudget() {
		return monthBudget;
	}

	public void setMonthBudget(Integer monthBudget) {
		this.monthBudget = monthBudget;
	}

	public Integer getYearSale() {
		return yearSale;
	}

	public void setYearSale(Integer yearSale) {
		this.yearSale = yearSale;
	}

	public Integer getYearBudget() {
		return yearBudget;
	}

	public void setYearBudget(Integer yearBudget) {
		this.yearBudget = yearBudget;
	}

	public Double getYearComRate() {
		return yearComRate;
	}

	public void setYearComRate(Double yearComRate) {
		this.yearComRate = yearComRate;
	}

	public Integer getOvertimeMoney() {
		return overtimeMoney;
	}

	public void setOvertimeMoney(Integer overtimeMoney) {
		this.overtimeMoney = overtimeMoney;
	}

	public Integer getReceiveMoney() {
		return receiveMoney;
	}

	public void setReceiveMoney(Integer receiveMoney) {
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
