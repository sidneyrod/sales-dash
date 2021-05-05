package com.sid.sidsales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sid.sidsales.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
