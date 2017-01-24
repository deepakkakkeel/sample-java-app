package com.atlas.data;

import com.atlas.api.Country;

public interface DAO {
	public void insert(Country country);
	public Country read(String name); 
}
