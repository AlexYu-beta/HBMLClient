package dao;

import message.ResultMessage;
import model.PromotionFilter;
import po.PromotionPO;

import java.util.Map;

public interface PromotionDao {
	public Map<Integer, PromotionPO> getHotelPromotionList(PromotionFilter promotionFilter)throws Exception;

	public Map<Integer, PromotionPO> getWebPromotionList(PromotionFilter promotionFilter)throws Exception;

	public ResultMessage addPromotion(PromotionPO po)throws Exception;

	public ResultMessage deletePromotion(int id)throws Exception;

	public ResultMessage updatePromotion(PromotionPO po)throws Exception;
	 

}
