package dataservice.orderdataservice;

import po.OrderPO;

public interface OrderDataService {
	public void insert(OrderPO order);
	public void delete(OrderPO order);
	public void update(OrderPO order);
	public OrderPO find(String id);
}
