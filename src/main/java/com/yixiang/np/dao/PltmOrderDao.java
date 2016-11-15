package com.yixiang.np.dao;

import com.yixiang.np.model.po.PltmOrder;
import com.yixiang.np.model.po.PltmPayment;
import com.yixiang.np.model.vo.*;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by pengpeng on 16-9-8.
 */
public interface PltmOrderDao {

    /**
     * 创建订单
     *
     * @param pltmOrder
     * @return
     */
    Integer create(PltmOrder pltmOrder);
    void createBatch(@Param(value = "list") List<PltmOrder> list);

    Integer updatePssOrder(@Param(value = "id") Long id, @Param(value = "pssOrderNumber") String pssOrderNumber);
    Integer updatePssQwOrder(@Param(value = "contractNo") String contractNo, @Param(value = "pssContractNo") String pssContractNo);
    public void updatePssQwOrderNumber(@Param("params") Map<String, String> params);

    Integer deleteByOrderNumber(String orderNumber);
    
    Integer deleteByContractNumber(@Param(value = "contractNo") String contractNo);

    PltmOrderVo queryOrderDetail(@Param(value = "orderNumber") String orderNumber);

    NpOrderVo queryNpOrderDetail(@Param(value = "orderNumber") String orderNumber);

    PltmPaymentOrderVo queryOrderPaymentByNo(@Param(value = "orderNumber") String orderNumber);

    List<OrderFlightVo> queryFlightByOrderid(@Param(value = "orderNumber") String orderNumber);

    List<OrderPassenger> queryPassenger(@Param(value = "orderNumber") String orderNumber);

    List<PssOrderPassenger> queryPssPassenger(@Param(value = "orderNumber") String orderNumber);

    void updatePayInfo(PltmPayment order);

    /**
     * 同步订单票号查询订单
     *
     * @return
     */
    @MapKey("pssOrderNumber")
    Map<String, PltmOrder> queryPltmOrderByStatus();

    Integer updateOrderStatus(@Param(value = "id") Long id, @Param(value = "orderStatus") Integer orderStatus, @Param("financeStatus") Integer financeStatus, @Param("ticketTimeOut") Date ticketTimeOut);

    Integer updateOrderPayTimeOutByOrderNo(@Param("orderNumber") String orderNumber, @Param("payTimeOut") Integer payTimeOut);

    //订单查询
    List<OrderVo> queryOrder(@Param(value = "orderNumber") String orderNumber,
                             @Param(value = "orderStatus") Integer orderStatus,
                             @Param(value = "toStartAirportCode") String toStartAirportCode,
                             @Param(value = "toEndAirportCode") String toEndAirportCode,
                             @Param(value = "toStartDate") String toStartDate,
                             @Param(value = "toEndDate") String toEndDate,
                             @Param(value = "createUserId") Integer createUserId);

    //订单取消
    Integer orderCancel(@Param("orderNumber") String orderNumber);

    //根据平台订单编号 查询  PSS订单编号
    String queryPssOrderNum(@Param("orderNumber") String orderNumber);

    //根据pss订单编号 查询  订单订单编号
    String queryPltmOrderNum(@Param("orderNumber") String orderNumber);

    OrderPassenger getpassenger(@Param("id") String id);

    void passengerAdd(OrderPassenger passenger);

    void passengerEdit(OrderPassenger passenger);

    void passengerDel(@Param(value = "id") String id);

    void orderTicket(PltmOrder order);

    //查询订单状态是否为已取消状态
    Integer queryIsCanceled(@Param("orderNumber") String orderNumber);

    Integer updateOrderFinanceStatus(@Param("orderNumber") String orderNumber);

    //取消订单  更新取消备注
    Integer setRemark(@Param(value = "remarks") String remarks, @Param(value = "orderNumber") String orderNumber);

    Integer countByContrNoAndOrderStatus(@Param("contractNo") String contractNo, @Param("orderStatus") Integer orderStatus);

    Integer updateOrderStatusByContractNo(@Param("contractNo") String contractNo, @Param("orderStatus") Integer orderStatus);
    
    Integer stopOrderByContractNo(@Param("contractNo") String contractNo,
                                  @Param("date") String date,
                                  @Param("orderStatus") Integer orderStatus);
    
    Integer auditOrderByContractNo(@Param("pssOrder") List<PssOrder> pssOrder);
    
	List<String> selectOrderNumbers(@Param("contractNo") String contractNo, @Param("date") String date);

    Double querySupplierBalance(@Param("supplier") Integer supplier);
}
