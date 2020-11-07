package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_laboratorio;
import com.AppwebJeff.interfaces.interface_Laboratorios;
import com.AppwebJeff.interfacesServices.Icat_lab;

@Service
public class cLaboratorioService implements Icat_lab {

	
	@Autowired
	private interface_Laboratorios data;
	
	@Override
	public List<cat_laboratorio> listar() {
		// TODO Auto-generated method stub
		return (List<cat_laboratorio>)data.findAll();
	}

	@Override
	public Optional<cat_laboratorio> listarId(int id) {
		
		
		return data.findById(id);
	}

	@Override
	public int save(cat_laboratorio c) {
		int res=0;
		cat_laboratorio cat_lab =data.save(c);
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
