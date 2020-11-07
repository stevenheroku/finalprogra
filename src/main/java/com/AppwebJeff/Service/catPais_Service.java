package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_laboratorio;
import com.AppwebJeff.Model.cat_pais;
import com.AppwebJeff.interfaces.interface_Laboratorios;
import com.AppwebJeff.interfaces.interface_catPais;
import com.AppwebJeff.interfacesServices.I_cat_pais;
@Service
public class catPais_Service implements I_cat_pais {

	@Autowired
	private interface_catPais data;
	
	@Override
	public List<cat_pais> listar() {
		// TODO Auto-generated method stub
		return (List<cat_pais>)data.findAll();
	}

	@Override
	public Optional<cat_pais> listarId(int id) {
		
		
		return data.findById(id);
	}

	@Override
	public int save(cat_pais c) {
		int res=0;
		cat_pais catPais =data.save(c);
		if(catPais.equals(null))
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
