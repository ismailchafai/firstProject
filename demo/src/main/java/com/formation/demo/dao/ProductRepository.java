package com.formation.demo.dao;

import com.formation.demo.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chafai Ismail
 **/

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}