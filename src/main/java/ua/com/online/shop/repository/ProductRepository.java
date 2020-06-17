package ua.com.online.shop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.online.shop.entity.CategoryEntity;
import ua.com.online.shop.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    Page<ProductEntity> findAllByCategory(CategoryEntity category, Pageable pageable);
}
