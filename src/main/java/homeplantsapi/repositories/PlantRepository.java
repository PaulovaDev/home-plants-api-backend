package homeplantsapi.repositories;
import org.springframework.stereotype.Repository;
import homeplantsapi.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}