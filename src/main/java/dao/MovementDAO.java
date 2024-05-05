package dao;

import entities.Movement;
import org.springframework.data.repository.CrudRepository;

public interface MovementDAO extends CrudRepository<Movement, Long> {
}