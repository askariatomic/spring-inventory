package com.brightman.inventory.delivery_order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DeliveryOrderDAOImplementation implements DeliveryOrderDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DeliveryOrderResult> getAllDeliveryOrder() {
        String sql = "SELECT * FROM as_delivery_order ORDER BY id ASC";
        List<DeliveryOrderResult> deliveryOrder = jdbcTemplate.query(sql, new DeliveryOrderMapper());

        return deliveryOrder;
    }

    @Override
    public DeliveryOrderResult getDeliveryOrderById(int id) {
        String sql = "SELECT * FROM as_delivery_order WHERE bbmID = ?";
        DeliveryOrderResult deliveryOrder = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DeliveryOrderMapper());

        return deliveryOrder;
    }

    @Override
    public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
        String sql = "INSERT INTO as_delivery_order (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, deliveryOrder);
    }

    @Override
    public void updateDeliveryOrder(DeliveryOrder deliveryOrder, int id) {
        String sql = "UPDATE as_delivery_order SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, deliveryOrder);
    }

    @Override
    public void deleteDeliveryOrder(int id) {
        String sql = "DELETE FROM as_delivery_order WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_delivery_order', 'doID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
