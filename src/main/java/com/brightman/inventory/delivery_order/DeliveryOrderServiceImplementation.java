package com.brightman.inventory.delivery_order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrderServiceImplementation implements DeliveryOrderService {
    @Autowired
    private DeliveryOrderDAO deliveryOrderDAO;

    @Override
    public List<DeliveryOrderResult> getAllDeliveryOrder() {
        return deliveryOrderDAO.getAllDeliveryOrder();
    }

    @Override
    public DeliveryOrderResult getDeliveryOrderById(int id) {
        return deliveryOrderDAO.getDeliveryOrderById(id);
    }

    @Override
    public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
        deliveryOrderDAO.addDeliveryOrder(deliveryOrder);
    }

    @Override
    public void updateDeliveryOrder(DeliveryOrder deliveryOrder, int id) {
        deliveryOrderDAO.updateDeliveryOrder(deliveryOrder, id);
    }

    @Override
    public void deleteDeliveryOrder(int id) {
        deliveryOrderDAO.deleteDeliveryOrder(id);
    }

    @Override
    public int lastestInput() {
        return deliveryOrderDAO.lastestInput();
    }
}

