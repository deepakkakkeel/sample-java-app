package com.atlas.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	String name;
	String capital;
	String currencny;
	
	public Country() {
		
	}
	
	public Country(String name, String capital, String currencny) {
		super();
		this.name = name;
		this.capital = capital;
		this.currencny = currencny;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrencny() {
		return currencny;
	}
	public void setCurrencny(String currencny) {
		this.currencny = currencny;
	}
}
