package aurelien.bombolo.hello.invoice;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import car_lease_contract.Contract;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="invoice")



public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Temporal(TemporalType.DATE)
private Date date;
private double amount;
private String adresse;
@OneToOne(mappedBy = "invoice")
private Contract contract;

}
