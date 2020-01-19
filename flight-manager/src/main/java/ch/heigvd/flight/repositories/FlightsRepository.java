package ch.heigvd.flight.repositories;

import ch.heigvd.flight.entities.FlightsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface FlightsRepository extends CrudRepository<FlightsEntity, Long>{


    FlightsEntity findById(long Id);

    void deleteById(long Id);

    List<FlightsEntity> findAll();
}