package com.yixiang.np.constant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiZhengYong on 2016/6/16.
 */
public class Constant {

    public static final class DataStatus {
        public static Integer NEW = 1;
        public static Integer DELETE = 2;
    }

    public static final class AirLineProgressStatus {
        public static Integer CREATE = 1; // 新创建
        public static Integer DEMAND = 2; // 论证中
        public static Integer PROJECT = 3; // 执行中
        public static Integer SHUT_DOWN = 4; // 已关闭
    }

    public static final class AirLineBjjhType {
        public static Integer ONE = 1;
        public static Integer TWO = 2;
    }
    //订单状态(0-待支付,1-待审核,2-待出票(支付并出票),3-出票中（已支付出票 等待出票）,4-出票成功,5-取消)
    public static final class OrderStatus {
        public static Integer DZF = 0; // 待支付
        public static Integer DSH = 1; // 待审核
        public static Integer DCP = 2; // 待出票
       // public static Integer CPZ = 3; // 出票中
        public static Integer CPWC = 4; // 出票完成
        public static Integer YQX = 5; // 已取消

    }
    
    /**
     * 合同状态：
		1.待审核：未经【供应商】审核的合同。支持合同取消。
		2.待支付：合同审核通过完成，支持合同取消，【支付押金】
		3.押金已收（原销售押金）：已收押金的合同下面的订单进入待出票状态。
		4.合同中止：由【供应商】从某一班开始关闭合同（含开始日期）对应合同的订单取消归还库存。
		5.合同完成：所有航班完成出票。
		6.合同退回：经【供应商】审核不通过。
		7.合同取消：由【供应商】自行取消的合同，与合同关联的所有订单取消归还库存。
		
		订单状态：
		0.待支付：未支付票款的订单；
		2.待出票：已支付票款，未申请出票（提交名单）；
		3.出票中：已提交名单到【供应商】，等待票号；
		4.已出票：票号已回填；
     * @author wangwei
     *
     */
    //合同状态 --contract status
    public static final class conStatus {
    	public static Integer DSH = 1; // 待审核
    	public static Integer DZF = 2; // 待支付
    	public static Integer YJYS = 3; // 押金已收
    	public static Integer HTZZ = 4; // 合同中止
    	public static Integer HTWC = 5; // 合同完成
    	public static Integer HTTH = 6; // 合同退回
    	public static Integer HTQX = 7; // 合同 取消
    	
    }
    
    public static final int PAY_LIMIT_TIME = 1;//支付时限
    public static final int TICKET_LIMIT_TIME = -2;//出票时限

    public static final class Suppliers {
        public static Integer AKYD = 6; // 安科运达

    }
    
    //订单  --- 提现申请单   ：财务状态
    public static final class FinanceStatus {
    	 public static int DZF = 0; // 待支付
        public static int SKDSH = 1; // 收款待审核
        public static int YSK = 2; // 已收款
        public static int DTX = 3; // 待提现  （提现申请单关闭）
        public static int TXDSH = 4; // 提现待审核
        public static int TXDZF = 5; // 提现待支付
        public static int YFK = 6; // 已付款
    }
    //采购商审核状态  state
    public static final class auditState {
        public static int DSH = 1; // 待审核
        public static int WTG = 2; // 未通过
        public static int YTG = 0; // 已通过
    }
    
    public static String SeatClass(String seatClass){
    	String retStr = seatClass;
    	switch (seatClass) {
		case "E":
			retStr = "经济舱";
			break;
		case "C":
			retStr = "商务舱";
			break;
		case "F":
			retStr = "头等舱";
			break;
		case "S":
			retStr = "超值经济舱";
			break;
		default:
			break;
		}
		return retStr;
    }
    
    /**
	 * 记录锁定IP
	 */
	public static Map<String,Integer> ipMap = new HashMap<String, Integer>();
	public static Map<String,Date> ipTimeMap = new HashMap<String, Date>();
}
