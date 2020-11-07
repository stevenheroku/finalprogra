package com.AppwebJeff.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppwebJeff.Model.cat_tipo_vacuna;
import com.AppwebJeff.Model.tb_aplicacion_dosis;
import com.AppwebJeff.interfaces.innterface_aplicacionDosis;
import com.AppwebJeff.interfaces.interface_Vacuna;
import com.AppwebJeff.interfacesServices.I_aplicacion_dosis;
@Service
public class aplicacion_Dosis_Service implements I_aplicacion_dosis {

	@Autowired
	private innterface_aplicacionDosis data;
	
	@Override
	public List<tb_aplicacion_dosis> listar() {
		
		return (List<tb_aplicacion_dosis>)data.findAll();
	}

	@Override
	public Optional<tb_aplicacion_dosis> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(tb_aplicacion_dosis c) {
		
		int res=0;
		tb_aplicacion_dosis apli_dosis =data.save(c);
		if(apli_dosis.equals(null))
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
