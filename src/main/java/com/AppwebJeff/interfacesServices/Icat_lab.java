package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.AppwebJeff.Model.cat_laboratorio;


public interface Icat_lab {
	public List<cat_laboratorio>listar();
	public Optional<cat_laboratorio>listarId(int id);
	public int save(cat_laboratorio c);
	public void delete(int id);

}
