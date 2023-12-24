package org.sid.orderservice.repository;

import org.sid.orderservice.entitites.Order;
import org.sid.orderservice.entitites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
}
