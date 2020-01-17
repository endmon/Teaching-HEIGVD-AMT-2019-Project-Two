package ch.heigvd.flight.repositories;

import ch.heigvd.user.entities.FlightsEntity;
import org.springframework.data.repository.CrudRepository;


public interface FlightsRepository extends CrudRepository<FlightsEntity, Long>{
    FlightsEntity findByEmail(String email);
}