package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.tb_inventario_vacunas;
import com.AppwebJeff.Model.tb_persona;
import com.AppwebJeff.interfaces.interface_inventario_vacuna;
import com.AppwebJeff.interfaces.interface_tb_persona;
import com.AppwebJeff.interfacesServices.I_tb_persona;
@Service
public class tb_persona_Service implements I_tb_persona {

	@Autowired
	private interface_tb_persona data;
	
	
	@Override
	public List<tb_persona> listar() {
		
		return (List<tb_persona>)data.findAll();
	}

	@Override
	public Optional<tb_persona> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(tb_persona c) {
		
		int res=0;
		tb_persona cat_lab =data.save(c);
		if(cat_lab.equals(null))
		{
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);

	}
	
	


}
