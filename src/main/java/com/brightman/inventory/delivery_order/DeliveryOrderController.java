package com.brightman.inventory.delivery_order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("deliveryOrder")
public class DeliveryOrderController {
    @Autowired
    private DeliveryOrderService deliveryOrderService;

    @GetMapping("/")
    public ResponseEntity<List<DeliveryOrderResult>> getAll() {
        List<DeliveryOrderResult> listDeliveryOrder = deliveryOrderService.getAllDeliveryOrder();

        return new ResponseEntity<List<DeliveryOrderResult>>(listDeliveryOrder, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryOrderResult> getById(@PathVariable("id") int id) {
        DeliveryOrderResult deliveryOrderResult = deliveryOrderService.getDeliveryOrderById(id);

        return new ResponseEntity<DeliveryOrderResult>(deliveryOrderResult, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DeliveryOrderResult> addDeliveryOrder(@RequestBody DeliveryOrder deliveryOrder) {
        deliveryOrderService.addDeliveryOrder(deliveryOrder);
        DeliveryOrderResult deliveryOrderResult = deliveryOrderService.getDeliveryOrderById(deliveryOrderService.lastestInput());

        return new ResponseEntity<DeliveryOrderResult>(deliveryOrderResult, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliveryOrderResult> updateDeliveryOrder(@PathVariable("id") int id, @RequestBody DeliveryOrder deliveryOrder) {
        deliveryOrderService.updateDeliveryOrder(deliveryOrder, id);
        DeliveryOrderResult deliveryOrderResult = deliveryOrderService.getDeliveryOrderById(id);

        return new ResponseEntity<DeliveryOrderResult>(deliveryOrderResult, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeliveryOrderResult> deleteDeliveryOrder(@PathVariable("id") int id) {
        DeliveryOrderResult deliveryOrderResult = deliveryOrderService.getDeliveryOrderById(id);
        deliveryOrderService.deleteDeliveryOrder(id);

        return new ResponseEntity<DeliveryOrderResult>(deliveryOrderResult, HttpStatus.OK);
    }
}
