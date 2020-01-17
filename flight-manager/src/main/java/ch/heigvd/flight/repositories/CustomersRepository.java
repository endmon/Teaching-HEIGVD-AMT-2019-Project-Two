package ch.heigvd.flight.repositories;

import ch.heigvd.flight.entities.CustomersEntity;
import org.springframework.data.repository.CrudRepository;


public interface CustomersRepository extends CrudRepository<CustomersEntity, Long>{
    CustomersEntity findByPseudo(String customer_pseudo);
}