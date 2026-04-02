package az.edu.ada.wm2.lab6.repository;

// QUESTION1LAB6 — Spring Data JPA repository (replaces manual in-memory impl)

import az.edu.ada.wm2.lab6.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findByExpirationDateBefore(LocalDate date);

    List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
