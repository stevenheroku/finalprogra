package com.AppwebJeff.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Entity
@Table(name= "cat_pais")
public class cat_pais {
	@NotNull(message = "Debe ingresar el Id")
	@Id  
	@Column(name = "ID_PAIS") 
	private int ID_PAIS;
	@NotEmpty(message = "Debe ingresar el Nombre")
	private String NOMBRE_PAIS;
	
	public cat_pais() {
		super();
	}
	public cat_pais(@NotNull int iD_PAIS, String nOMBRE_PAIS) {
		super();
		ID_PAIS = iD_PAIS;
		NOMBRE_PAIS = nOMBRE_PAIS;
	}
	public int getID_PAIS() {
		return ID_PAIS;
	}
	public void setID_PAIS(int iD_PAIS) {
		ID_PAIS = iD_PAIS;
	}
	public String getNOMBRE_PAIS() {
		return NOMBRE_PAIS;
	}
	public void setNOMBRE_PAIS(String nOMBRE_PAIS) {
		NOMBRE_PAIS = nOMBRE_PAIS;
	}
	

}
