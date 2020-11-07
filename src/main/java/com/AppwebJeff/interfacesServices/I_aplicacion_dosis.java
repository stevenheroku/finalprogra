package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.AppwebJeff.Model.tb_aplicacion_dosis;

public interface I_aplicacion_dosis {

	public List<tb_aplicacion_dosis>listar();
	@OneToOne(mappedBy = "tb_aplicacion_dosis", cascade = CascadeType.ALL, orphanRemoval = true)
	public Optional<tb_aplicacion_dosis>listarId(int id);
	public int save(tb_aplicacion_dosis c);
	public void delete(int id);
}
