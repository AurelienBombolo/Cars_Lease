package car_lease_contract;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
	


	
	@GetMapping("/contracts")
	
	public List<Contract> ListContract(){
		return contractService.getAllContract();
	}
	
	
	@Autowired
	ContractService contractService = new ContractService();
	@GetMapping("/contracts/{id}")
    public ResponseEntity<Contract> getContractById(@PathVariable("id") long id){
        Optional<Contract> oContract = Optional.of(contractService.getContractById(id));
        
        if (oContract.isPresent())
            return new ResponseEntity<>(oContract.get(),HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
