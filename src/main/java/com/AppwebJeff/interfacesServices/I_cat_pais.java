package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;


import com.AppwebJeff.Model.cat_pais;

public interface I_cat_pais {

	
	public List<cat_pais>listar();
	public Optional<cat_pais>listarId(int id);
	public int save(cat_pais c);
	public void delete(int id);
}
