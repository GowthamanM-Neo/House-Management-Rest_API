package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseModel {

	@Id
	private String houseId;
	private String houseNo;
	private String status;
	private String type;
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "HouseModel [houseId=" + houseId + ", houseNo=" + houseNo + ", status=" + status + ", type=" + type
				+ "]";
	}
}
