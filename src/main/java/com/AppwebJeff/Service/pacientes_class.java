package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_tipo_vacuna;
import com.AppwebJeff.Model.tb_persona;
import com.AppwebJeff.interfaces.interface_Laboratorios;
import com.AppwebJeff.interfaces.interface_pacientes;
import com.AppwebJeff.interfacesServices.pacientes_I;
@Service
public class pacientes_class implements pacientes_I {

	
	@Autowired
	private interface_pacientes data;
	
	@Override
	public List<tb_persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<tb_persona> listarId(String id) {
		
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
	public void delete(String id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
