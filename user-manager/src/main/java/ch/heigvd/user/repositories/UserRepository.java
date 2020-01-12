package ch.heigvd.user.repositories;

import ch.heigvd.user.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long>{
    UserEntity findByEmail(String email);
}