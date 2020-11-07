package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.AppwebJeff.Model.tb_inventario_vacunas;

public interface I_inventario_vacunas {

	public List<tb_inventario_vacunas>listar();
	@OneToOne(mappedBy = "tb_inventario_vacunas", cascade = CascadeType.ALL, orphanRemoval = true)
	public Optional<tb_inventario_vacunas>listarId(int id);
	public int save(tb_inventario_vacunas c);
	public void delete(int id);
}
