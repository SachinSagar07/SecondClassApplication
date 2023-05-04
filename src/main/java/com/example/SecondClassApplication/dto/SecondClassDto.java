package com.example.SecondClassApplication.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Data
public class SecondClassDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String pname;

    private String paddress;

    private Long paadharNumber;

    private Integer seatNo;
    
    

	public SecondClassDto(Integer id, String pname, String paddress, Long paadharNumber, Integer seatNo) {
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
