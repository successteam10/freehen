package com.example.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.venta;

@Repository
public interface ventaRepository extends JpaRepository<venta, Integer> {

}
