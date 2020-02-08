package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List <Order> findAllByClientId(Long clientId);
}
