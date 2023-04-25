package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laps")

public class Smd {
	@Id
	private int sno;
	private String brand;
	private String model;
	private String ram;
	private String rom;
	private String proccessor;
	private String battery_capacity;
	private String graphics_card;
	private String display_type;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getProccessor() {
		return proccessor;
	}
	public void setProccessor(String proccessor) {
		this.proccessor = proccessor;
	}
	public String getBattery_capacity() {
		return battery_capacity;
	}
	public void setBattery_capacity(String battery_capacity) {
		this.battery_capacity = battery_capacity;
	}
	public String getGraphics_card() {
		return graphics_card;
	}
	public void setGraphics_card(String graphics_card) {
		this.graphics_card = graphics_card;
	}
	public String getDisplay_type() {
		return display_type;
	}
	public void setDisplay_type(String display_type) {
		this.display_type = display_type;
	}
	

}
