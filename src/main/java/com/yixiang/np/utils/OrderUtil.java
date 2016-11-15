package com.yixiang.np.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by pengpeng on 16-9-8.
 */
public class OrderUtil {

    private static ConcurrentHashMap<String, String> curr = new ConcurrentHashMap<String, String>();

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
//        OrderUtil orderUtil = new OrderUtil();
//        for (; ; ) {
//            System.err.println(OrderUtil.getOrderNumber(1l));
//            Thread.sleep(1000);
//        }
        for (; ; ) {
            String b = OrderUtil.getOrderNumber(1l);
            System.err.println(b);
            if (map.containsKey(b)) {
                throw new Exception("重复了" + b + "map size:" + map.size());
            } else {
                map.put(b, b);
            }
        }
    }

    private static void createNumber() {
    	int[] result = randomNumber(1000, 9999, 5000);
    	for (int i : result) {
			curr.put(i + "", i + "");
		}
//        String no = null;
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                if (i == j) {
//                    continue;
//                }
//                for (int k = 1; k <= 9; k++) {
//                    if (k == i || k == j) {
//                        continue;
//                    }
//                    for (int h = 1; h <= 9; h++) {
//                        if (h == i || h == j || h == k) {
//                            continue;
//                        }
//                        no = "" + i + j + k + h;
//                        curr.put(no, no);
//                    }
//                }
//            }
//        }
    }

    private static synchronized String get4RandomNo() {
        Set<String> setString = curr.keySet();
        if (setString != null && !setString.isEmpty()) {
            for (String str : setString) {
                curr.remove(str);
                return str;
            }
        } else {
            createNumber();
            return get4RandomNo();
        }
        return null;
    }

    public static String getOrderNumber(Long id) {
        String orderNumber = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        orderNumber += format.format(new Date());
//        String mills =
        //从用户id 中取出4位
        if (id != null) {
            //用户id 超过4位
            if (id.toString().length() < 4) {
                for (int i = 0; i < (4 - id.toString().length()); i++) {
                    orderNumber += "0";
                }
                orderNumber += id;
            } else {//用户id 超过4位
                orderNumber += id.toString().substring(0, 4);
            }
        } else {
            orderNumber += "0000";
        }
        orderNumber += get4RandomNo();
        return orderNumber;
    }

    //    付款单号规则：PM+年月日时分秒+随机数（4位）
//    提现单号规则：RA+年月日时分秒+随机数（4位）如：RA1609011000001234
    public static String getPayNo() {
        String orderNumber = "PM";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        orderNumber += format.format(new Date());
        orderNumber += get4RandomNo();
        return orderNumber;
    }

    //交易号
    public static String getTradeListNo() {
        String orderNumber = "TL";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        orderNumber += format.format(new Date());
        orderNumber += get4RandomNo();
        return orderNumber;
    }

    //提现单号
    public static String getCashNo() {
        String orderNumber = "RA";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        orderNumber += format.format(new Date());
        orderNumber += get4RandomNo();
        return orderNumber;
    }

    //合同编号
    public static String getContractNo() {
        String orderNumber = "CP";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        orderNumber += format.format(new Date());
        //4位随机数
        orderNumber += get4RandomNo();
        return orderNumber;
    }
    
    public static int[] randomNumber(int min, int max, int n) {

		// 判断是否已经达到索要输出随机数的个数
		if (n > (max - min + 1) || max < min) {
			return null;
		}

		int[] result = new int[n]; // 用于存放结果的数组

		int count = 0;
		while (count < n) {
			int num = (int) (Math.random() * (max - min)) + min;
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[count] = num;
				count++;
			}
		}
		return result;
	}
}
