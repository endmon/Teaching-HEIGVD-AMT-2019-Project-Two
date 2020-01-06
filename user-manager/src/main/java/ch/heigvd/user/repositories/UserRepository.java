package main.java.ch.heigvd.user.repositories;

import main.java.ch.heigvd.user.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long>{
    UserEntity findByUsername(String username);
}