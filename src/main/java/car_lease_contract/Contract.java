package car_lease_contract;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import aurelien.bombolo.hello.invoice.Invoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="contract")


public class Contract {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Temporal(TemporalType.DATE)
private Date date;
@Temporal(TemporalType.DATE)
private Date startLease;
@Temporal(TemporalType.DATE)
private Date endLease;
private  double advance;
private double leftToPay;
private double totalPrice;
private String placeOfReturn;

@OneToOne
private Invoice invoice; 
}
