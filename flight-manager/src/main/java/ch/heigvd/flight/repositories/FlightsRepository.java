package ch.heigvd.flight.repositories;

import ch.heigvd.flight.entities.FlightsEntity;
import org.springframework.data.repository.CrudRepository;


public interface FlightsRepository extends CrudRepository<FlightsEntity, Long>{
    FlightsEntity findById(long id);
}