package com.example.SecondClassApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SecondClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Please enter your name")
    private String pname;

    @NotBlank(message = "Please enter your address")
    @Length(max=20,min = 1)
    @Size(max = 20,min=1)
    private String paddress;

    private Long paadharNumber;

    private Integer seatNo;
    
    

	public SecondClass(Integer id, @NotBlank(message = "Please enter your name") String pname,
			@NotBlank(message = "Please enter your address") @Length(max = 20, min = 1) @Size(max = 20, min = 1) String paddress,
			Long paadharNumber, Integer seatNo) {
		super();
		this.id = id;
		this.pname = pname;
		this.paddress = paddress;
		this.paadharNumber = paadharNumber;
		this.seatNo = seatNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public Long getPaadharNumber() {
		return paadharNumber;
	}

	public void setPaadharNumber(Long paadharNumber) {
		this.paadharNumber = paadharNumber;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
    
    
}
