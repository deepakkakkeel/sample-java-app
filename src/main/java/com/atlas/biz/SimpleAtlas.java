package com.atlas.biz;

import com.atlas.api.Atlas;
import com.atlas.api.AtlasException;
import com.atlas.api.Country;
import com.atlas.api.CountryNotFoundException;
import com.atlas.data.DAO;
import com.atlas.data.JPADao;

public class SimpleAtlas implements Atlas{
	private DAO dao;
	
	public SimpleAtlas() {
		dao = new JPADao();
	}

	@Override
	public Country getCountry(String country) throws CountryNotFoundException, AtlasException {
		Country c = dao.read(country);
		if (c == null) {
			throw new CountryNotFoundException();
		}
		return c;	
	}
	
	
	@Override
	public void insertCountry(Country country) throws CountryNotFoundException, AtlasException {
		if (country.getCapital() == null || country.getCurrencny() == null || country.getName() == null) {
			throw new AtlasException();
		}
		dao.insert(country);
		
	}

}
