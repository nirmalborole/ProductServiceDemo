package com.example.apidemo.repositories;

import com.example.apidemo.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public Page<Product> findAll(Pageable pageable);


    @Query("select p.description,p.title from Product p where p.id= :id")
    Optional<Product> getCustomHQL(@Param("id") long id);

    @Query(value = "select p.description,p.title from  product p where p.id= :id", nativeQuery = true)
    Optional<Product> getCustomSQL(@Param("id") long id);
}
