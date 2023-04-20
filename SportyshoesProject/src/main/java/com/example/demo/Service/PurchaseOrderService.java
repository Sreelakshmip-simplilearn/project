package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.PurchaseOrder;

public interface PurchaseOrderService {
public PurchaseOrder getPurchaseById(long id);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	public List<PurchaseOrder> getAllPurchaseOrderByUserId(Long userId);
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder);
}
