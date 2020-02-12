package com.brightman.inventory.delivery_order;

import java.util.List;

public interface DeliveryOrderDAO {
    List<DeliveryOrderResult> getAllDeliveryOrder();
    DeliveryOrderResult getDeliveryOrderById(int id);
    void addDeliveryOrder(DeliveryOrder deliveryOrder);
    void updateDeliveryOrder(DeliveryOrder deliveryOrder, int id);
    void deleteDeliveryOrder(int id);
    int lastestInput();
}
