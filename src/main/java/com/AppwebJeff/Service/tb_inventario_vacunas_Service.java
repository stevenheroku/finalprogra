package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_laboratorio;
import com.AppwebJeff.Model.tb_inventario_vacunas;
import com.AppwebJeff.interfaces.interface_inventario_vacuna;
import com.AppwebJeff.interfacesServices.I_inventario_vacunas;
@Service
public class tb_inventario_vacunas_Service implements I_inventario_vacunas {

	@Autowired
	private interface_inventario_vacuna data;
	
	@Override
	public List<tb_inventario_vacunas> listar() {
		
		return (List<tb_inventario_vacunas>)data.findAll();
	}

	@Override
	public Optional<tb_inventario_vacunas> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(tb_inventario_vacunas c) {
		
		int res=0;
		tb_inventario_vacunas cat_lab =data.save(c);
		if(cat_lab.equals(null))
		{
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		
		data.deleteById (id);

	}

}
