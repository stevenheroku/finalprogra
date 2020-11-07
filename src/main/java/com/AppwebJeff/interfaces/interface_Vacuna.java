package com.AppwebJeff.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.AppwebJeff.Model.cat_laboratorio;
import com.AppwebJeff.Model.cat_tipo_vacuna;

public interface interface_Vacuna extends CrudRepository<cat_tipo_vacuna, Integer> {

}
