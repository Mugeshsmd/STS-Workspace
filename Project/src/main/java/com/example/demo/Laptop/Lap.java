package com.example.demo.Laptop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Lap_Zone")

public class Lap {
	@Id
private int sno;
private String model;
private int price;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
