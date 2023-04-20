package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.PurchaseItem;
import com.example.demo.Model.PurchaseOrder;
import com.example.demo.Model.User;

public interface PurchaseItemService {
	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
