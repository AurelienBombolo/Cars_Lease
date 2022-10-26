package Car_leasing;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
	List<Car> findByInUse(boolean inUs);
	List<Car> findByColor(String color);
	List<Car> findByBrandContaining(String brand);
	
}
