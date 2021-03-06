package ch.heigvd.flight.repositories;

import ch.heigvd.flight.entities.CustomersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomersRepository extends CrudRepository<CustomersEntity, Long>{
    CustomersEntity findById(long customer_id);

    void deleteById(long customer_id);

    Page<CustomersEntity> findAll(Pageable pageable);

}