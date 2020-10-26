package com.order.repository;

import com.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
