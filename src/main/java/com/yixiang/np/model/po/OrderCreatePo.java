package com.yixiang.np.model.po;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pengpeng on 16-9-8.
 */
public class OrderCreatePo implements Serializable {

    private PltmOrder pltmOrder;

    private Integer airlineId;//航线id

    private List<PltmOrderFlight> pltmOrderFlights;

    private List<PltmOrderPassenger> pltmOrderPassengerList;

    public OrderCreatePo() {
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public PltmOrder getPltmOrder() {
        return pltmOrder;
    }

    public void setPltmOrder(PltmOrder pltmOrder) {
        this.pltmOrder = pltmOrder;
    }

    public List<PltmOrderFlight> getPltmOrderFlights() {
        return pltmOrderFlights;
    }

    public void setPltmOrderFlights(List<PltmOrderFlight> pltmOrderFlights) {
        this.pltmOrderFlights = pltmOrderFlights;
    }

    public List<PltmOrderPassenger> getPltmOrderPassengerList() {
        return pltmOrderPassengerList;
    }

    public void setPltmOrderPassengerList(List<PltmOrderPassenger> pltmOrderPassengerList) {
        this.pltmOrderPassengerList = pltmOrderPassengerList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderCreatePo{");
        sb.append("pltmOrder=").append(pltmOrder);
        sb.append(", airlineId=").append(airlineId);
        sb.append(", pltmOrderFlights=").append(pltmOrderFlights);
        sb.append(", pltmOrderPassengerList=").append(pltmOrderPassengerList);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        OrderCreatePo req = new OrderCreatePo();
        PltmOrder pltmOrder = new PltmOrder();
        req.setPltmOrder(pltmOrder);
        pltmOrder.setCreateTime(new Date());
        pltmOrder.setCreateUser(123);
        pltmOrder.setId(1234l);
        pltmOrder.setLastModifyPerson(123);
        pltmOrder.setLuggageInfo("2");
        pltmOrder.setLastModifyTime(new Date());
        pltmOrder.setOrderNumber("20160908110312344321");
        pltmOrder.setOrderStatus(1);
        pltmOrder.setPayAccount("851387557");
        pltmOrder.setPayName("金鹏");
        pltmOrder.setPayPrice(1980d);
        pltmOrder.setPayUserId(123);
        pltmOrder.setPayTime(new Date());
        pltmOrder.setPssOrderNumber("20160908110312344321PSS");
        pltmOrder.setPurchQuantity(2);
        pltmOrder.setUnitPrice(800d);
        pltmOrder.setTicketLimitTime(3);
        pltmOrder.setRemark("测试");
        pltmOrder.setTravelDays("100天100晚");


        List<PltmOrderFlight> pltmOrderFlights = new ArrayList<PltmOrderFlight>();
        req.setPltmOrderFlights(pltmOrderFlights);
        PltmOrderFlight pltmOrderFlight = new PltmOrderFlight();
        pltmOrderFlights.add(pltmOrderFlight);
        pltmOrderFlight.setId(123l);
        pltmOrderFlight.setOrderNumber("20160908110312344321");
        pltmOrderFlight.setFlightId(123);
        pltmOrderFlight.setFlightNumber("3U888");
        pltmOrderFlight.setFlightSegment(1);
        pltmOrderFlight.setDepartureCity("CTU");
        pltmOrderFlight.setArrivalCity("PEK");
        pltmOrderFlight.setIntervalDay(2);
        pltmOrderFlight.setDepartureDate(new Date());
        pltmOrderFlight.setDepartureTime("11:22");
        pltmOrderFlight.setArrivalTime("11:52");
        pltmOrderFlight.setCabin("Y");
        pltmOrderFlight.setDepartureTerminal("T1");
        pltmOrderFlight.setArrivalTerminal("T2");
        pltmOrderFlight.setCreateUser(1231);
        pltmOrderFlight.setCreateTime(new Date());
        pltmOrderFlight.setLastModifyTime(new Date());
        pltmOrderFlight.setLastModifyPerson(123);

        String reqJson = JSON.toJSONString(req);
        System.err.print(reqJson);

    }
}
