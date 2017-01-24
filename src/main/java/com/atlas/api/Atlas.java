package com.atlas.api;

public interface Atlas {
	public Country getCountry(String country) throws CountryNotFoundException, AtlasException;
	public void insertCountry(Country country) throws CountryNotFoundException, AtlasException;
}
