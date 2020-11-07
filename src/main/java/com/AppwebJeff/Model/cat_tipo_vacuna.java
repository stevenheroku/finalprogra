package com.AppwebJeff.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cat_tipo_vacuna")
public class cat_tipo_vacuna {
	@NotNull
	@Id  
    @Column(name = "ID_TIPO_VACUNA", unique = true, nullable =false) 
	public int ID_TIPO_VACUNA;
	@NotNull (message = "Maximo un Digito")
	@Min(1)@Max(20)
	public int cat_laboratorios_id_laboratorio;
	@NotNull(message = "Debe ingresar el Id pais")
	public int cat_laboratorios_cat_pais_id_pais;
	@NotNull(message = "Debe ingresar el Id vacuna")
	public int idcat_tipo_vacuna;
	@NotEmpty(message = "Debe ingresar los efectos adversos")
	public String EFECTOS_ADVERSOS;
	@NotEmpty(message = "Debe ingresar el modo Almacen")
	public String MODO_ALMACEN;
	@NotNull(message = "Debe ingresar numero de dosis")
	public int numero_de_dosis;
	@NotEmpty(message = "Debe ingresar el nombre de la vacuna")
	public String NOMBRE_VACUNA;
	
	public cat_tipo_vacuna() {
		super();
	}
	public cat_tipo_vacuna(int iD_TIPO_VACUNA, int cat_laboratorios_id_laboratorio,
			int cat_laboratorios_cat_pais_id_pais, int idcat_tipo_vacuna, String eFECTOS_ADVERSOS, String mODO_ALMACEN,
			int numero_de_dosis, String nOMBRE_VACUNA) {
		super();
		ID_TIPO_VACUNA = iD_TIPO_VACUNA;
		this.cat_laboratorios_id_laboratorio = cat_laboratorios_id_laboratorio;
		this.cat_laboratorios_cat_pais_id_pais = cat_laboratorios_cat_pais_id_pais;
		this.idcat_tipo_vacuna = idcat_tipo_vacuna;
		EFECTOS_ADVERSOS = eFECTOS_ADVERSOS;
		MODO_ALMACEN = mODO_ALMACEN;
		this.numero_de_dosis = numero_de_dosis;
		NOMBRE_VACUNA = nOMBRE_VACUNA;
	}
	public int getID_TIPO_VACUNA() {
		return ID_TIPO_VACUNA;
	}
	public void setID_TIPO_VACUNA(int iD_TIPO_VACUNA) {
		ID_TIPO_VACUNA = iD_TIPO_VACUNA;
	}
	public int getCat_laboratorios_id_laboratorio() {
		return cat_laboratorios_id_laboratorio;
	}
	public void setCat_laboratorios_id_laboratorio(int cat_laboratorios_id_laboratorio) {
		this.cat_laboratorios_id_laboratorio = cat_laboratorios_id_laboratorio;
	}
	public int getCat_laboratorios_cat_pais_id_pais() {
		return cat_laboratorios_cat_pais_id_pais;
	}
	public void setCat_laboratorios_cat_pais_id_pais(int cat_laboratorios_cat_pais_id_pais) {
		this.cat_laboratorios_cat_pais_id_pais = cat_laboratorios_cat_pais_id_pais;
	}
	public int getIdcat_tipo_vacuna() {
		return idcat_tipo_vacuna;
	}
	public void setIdcat_tipo_vacuna(int idcat_tipo_vacuna) {
		this.idcat_tipo_vacuna = idcat_tipo_vacuna;
	}
	public String getEFECTOS_ADVERSOS() {
		return EFECTOS_ADVERSOS;
	}
	public void setEFECTOS_ADVERSOS(String eFECTOS_ADVERSOS) {
		EFECTOS_ADVERSOS = eFECTOS_ADVERSOS;
	}
	public String getMODO_ALMACEN() {
		return MODO_ALMACEN;
	}
	public void setMODO_ALMACEN(String mODO_ALMACEN) {
		MODO_ALMACEN = mODO_ALMACEN;
	}
	public int getNumero_de_dosis() {
		return numero_de_dosis;
	}
	public void setNumero_de_dosis(int numero_de_dosis) {
		this.numero_de_dosis = numero_de_dosis;
	}
	public String getNOMBRE_VACUNA() {
		return NOMBRE_VACUNA;
	}
	public void setNOMBRE_VACUNA(String nOMBRE_VACUNA) {
		NOMBRE_VACUNA = nOMBRE_VACUNA;
	}
	
	
	
	

}
