package businesslogic.orderbl;

import java.util.Map;

import businesslogicservice.orderblservice.OrderBLService;
import businesslogicservice.orderblservice.OrderCustomerService;
import vo.OrderVO;

public class OrderCustomerServiceImpl implements OrderBLService, OrderCustomerService
{

	@Override
	public boolean makeOrder() {
		System.out.println("订单已生成，已成功保存到数据库中！");
		return false;
	}

	@Override
	public boolean isUpToStandard() {
		//要持有关于credit的数据(或者是拥有user里面的credit数据)，来判断是否符合生成订单的标准
		System.out.println("信用值符合规范，转到生成订单方法。");
		return false;
	}

	@Override
	public boolean editOrder() {
		// 
		System.out.println("修改订单成功，转到更新订单方法来更新修改的订单");
		Order orderNeededToUpdate = new Order();
		updateOrderPO(orderNeededToUpdate);
		return false;
	}

	@Override
	public boolean cancelOrder() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void evaluateOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appealForAbnormalOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAppeal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, OrderVO> showOrderList(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showOrderList(OrderVO[] orderList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateOrderPO(Order orderNeededToUpdate) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
