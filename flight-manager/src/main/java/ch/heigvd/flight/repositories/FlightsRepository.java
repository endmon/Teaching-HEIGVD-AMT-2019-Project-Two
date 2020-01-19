package ch.heigvd.flight.repositories;

import ch.heigvd.flight.entities.FlightsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface FlightsRepository extends CrudRepository<FlightsEntity, Long>{


    FlightsEntity findById(long Id);

    void deleteById(long Id);

    Page<FlightsEntity> findAll(Pageable pageable);
}