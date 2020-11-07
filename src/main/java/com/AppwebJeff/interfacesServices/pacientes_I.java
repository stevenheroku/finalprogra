package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.AppwebJeff.Model.tb_persona;

public interface pacientes_I {
	public List<tb_persona>listar();
	public Optional<tb_persona>listarId(String id);
	public int save(tb_persona c);
	public void delete(String id);
}
