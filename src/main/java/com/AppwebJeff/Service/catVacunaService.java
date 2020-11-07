package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_tipo_vacuna;
import com.AppwebJeff.interfaces.interface_Vacuna;
import com.AppwebJeff.interfacesServices.Icat_Vacu;

@Service
public class catVacunaService implements Icat_Vacu {

	@Autowired
	private interface_Vacuna data;
	
	@Override
	public List<cat_tipo_vacuna> listars() {
		// TODO Auto-generated method stub
		return (List<cat_tipo_vacuna>)data.findAll();
	}

	@Override
	public Optional<cat_tipo_vacuna> listarId(int id) {
		
		
		return data.findById(id);
	}

	@Override
	public int save(cat_tipo_vacuna c) {
		int res=0;
		cat_tipo_vacuna cat_lab =data.save(c);
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
