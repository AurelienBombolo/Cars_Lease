package car_lease_contract;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository
 <Contract, Long> {

}
