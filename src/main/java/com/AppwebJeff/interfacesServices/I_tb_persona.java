package com.AppwebJeff.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.AppwebJeff.Model.tb_persona;

public interface I_tb_persona {

	public List<tb_persona>listar();
	public Optional<tb_persona>listarId(int id);
	public int save(tb_persona c);
	public void delete(int id);
}
