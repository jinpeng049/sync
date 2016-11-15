package com.yixiang.np.model.po;

import com.yixiang.np.model.vo.PltmContractVo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pengpeng on 16-9-8.
 */
public class OrderCreateQwPo implements Serializable {

    private PltmContractVo contract;

    private List<OrderCreatePo> orders;

	public PltmContractVo getContract() {
		return contract;
	}

	public void setContract(PltmContractVo contract) {
		this.contract = contract;
	}

	public List<OrderCreatePo> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderCreatePo> orders) {
		this.orders = orders;
	}

	 
    
}
