package car_lease_contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
	@Autowired
	ContractRepository contractRepository;

	public Contract addContract (Contract contract) {
		return contractRepository.save(contract);
	}
	public List<Contract> getAllContract(){
		return contractRepository.findAll();
	}
	
	public Contract getContractById(Long id) {
		return contractRepository.findById(id).get();
	}
}
