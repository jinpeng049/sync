package com.yixiang.np.service;

import com.yixiang.np.model.vo.EmailVo;

public interface OrderServiceI {


//    Json createOrderQw(OrderCreateQwPo orderCreateQwPo, SessionInfo sessionInfo);
//
//    List<OrderVo> queryOrder(String orderNumber, Integer orderStatus,
//                             String toStartAirportCode, String toEndAirportCode,
//                             String toStartDate, String toEndDate, Integer createUserId);
//
//    PltmOrderVo queryOrderDetail(String orderNumber);
//
//    NpOrderVo queryNpOrderDetail(String orderNumber);
//
//    List<OrderPassenger> queryPassenger(String orderNumber);
//
//    void updatePayInfo(PltmPayment order);
//
//    //平台订单取消
//    Integer orderCancel(String orderNumber);
//
//    //根据平台订单编号 查询  PSS订单编号
//    String queryPssOrderNum(String orderNumber);
//
//    //PSS订单取消
//    public Integer pssOrderCancel(String orderNumber);

    EmailVo queryEmailData(String orderNumber);
//
//    OrderPassenger getpassenger(String id);
//
//    void passengerAdd(OrderPassenger passenger);
//
//    void passengerAdd(PltmOrderPassenger passenger);
//
//    void passengerEdit(OrderPassenger passenger);
//
//    void passengerDel(String id);
//
//    /**
//     * @param order
//     * @param info
//     * @return 0-余额不足，1-成功, 2-失败
//     */
//    Integer orderTicket(PltmOrder order, SessionInfo info) throws Exception;
//
//
//    //查询订单状态是否为已取消状态
//    Integer queryIsCanceled(String orderNumber);
//
//    //订单联合取消
    void orderCancelAll(String orderNumber, String remarks);
//
//    //根据pss订单编号 查询  订单订单编号
//    String queryPltmOrderNum(String orderNumber);
//
//    Integer pssCancel(String orderNumber);
//
//    Double payableTic(String orderNumber);

}
