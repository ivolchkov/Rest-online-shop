package ua.com.online.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.online.shop.entity.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
