package Car_leasing;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="car")

public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String registration;
	private String brand;
	private String color;
	private String fuel;
	private double cylindre;
	private int maxSpeed;
	private int Km;
	private boolean inUs;
	@Temporal(TemporalType.DATE)
	private Date firstUse;
	
	private double power;
	
	

}
