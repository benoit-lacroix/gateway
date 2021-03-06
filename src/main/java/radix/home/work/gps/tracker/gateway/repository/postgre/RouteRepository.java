package radix.home.work.gps.tracker.gateway.repository.postgre;

import org.springframework.data.repository.CrudRepository;
import radix.home.work.gps.tracker.gateway.entity.postgres.RouteEntity;

import java.util.Optional;

public interface RouteRepository extends CrudRepository<RouteEntity, Integer> {

    Optional<RouteEntity> findByPath(String path);
}
