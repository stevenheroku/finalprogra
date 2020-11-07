package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.AppwebJeff.Model.cat_tipo_vacuna;

public interface Icat_Vacu {
	public List<cat_tipo_vacuna>listars();
	@OneToOne(mappedBy = "cat_tipo_vacuna", cascade = CascadeType.ALL, orphanRemoval = true)
	public Optional<cat_tipo_vacuna>listarId(int id);
	public int save(cat_tipo_vacuna c);
	public void delete(int id);

}
