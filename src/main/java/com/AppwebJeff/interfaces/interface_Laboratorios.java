package com.AppwebJeff.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AppwebJeff.Model.cat_laboratorio;

@Repository
public interface interface_Laboratorios extends CrudRepository<cat_laboratorio, Integer> {

}
