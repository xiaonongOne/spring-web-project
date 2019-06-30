package com.pojo;

/**
 * 饭店类
 *
 */
public class Hotel {
	// 饺子类
	private Dumplings dumplings;
	// 果汁类
	private Juice juice;
	
	// 生成订单
	public String getOrderInfo() {
		return "小明点了："+dumplings.getSize()+","+dumplings.getPie()+"和"+juice.getName();
	}
	
	public Dumplings getDumplings() {
		return dumplings;
	}

	public void setDumplings(Dumplings dumplings) {
		this.dumplings = dumplings;
	}

	public Juice getJuice() {
		return juice;
	}

	public void setJuice(Juice juice) {
		this.juice = juice;
	}
	
}
