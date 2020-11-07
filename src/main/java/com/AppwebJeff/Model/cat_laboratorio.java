package com.AppwebJeff.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name= "cat_laboratorio")
public class cat_laboratorio {


	@NotNull(message = "Debe ingresar el Id")
	@Id  
	@Column(name = "id_laboratorio") 
	private int id_laboratorio;
	@NotEmpty(message = "campo obligatorio")
	private String Nombre_laboratorio;
	 @NotNull(message = "Debe ingresar el Id pais")
	private int cat_pais_id_pais;
	
	public cat_laboratorio() {
		// TODO Auto-generated constructor stub
	}
	
	public cat_laboratorio(int id_laboratorio, String nombre_laboratorio, int cat_pais_id_pais) {
		super();
		this.id_laboratorio = id_laboratorio;
		this.Nombre_laboratorio = nombre_laboratorio;
		this.cat_pais_id_pais =cat_pais_id_pais;
	}
        
	public int getId_laboratorio() {
		return id_laboratorio;
	}
	
	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getNombre_laboratorio() {
		return Nombre_laboratorio;
	}
	public void setNombre_laboratorio(String nombre_laboratorio) {
		Nombre_laboratorio = nombre_laboratorio;
	}
	
	public int getId_pais() {
		return cat_pais_id_pais;
	}
	public void setId_pais(int cat_pais_id_pais) {
		this.cat_pais_id_pais = cat_pais_id_pais;
	}	
}

