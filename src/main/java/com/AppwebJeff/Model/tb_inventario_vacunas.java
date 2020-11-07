package com.AppwebJeff.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_inventario_vacunas")
public class tb_inventario_vacunas {
	@NotNull(message = "Id Obligatorio")
	@Id  
    @Column(name = "ID_INVENTARIO_VACUNA",unique = true, nullable =false) 
	public int ID_INVENTARIO_VACUNA;
	@NotNull(message = "campo Obligatorio")
	public int ID_TIPO_VACUNA;
	@NotNull(message = "campo Obligatorio")
	public int ID_LABORATORIO;
	@NotEmpty(message = "fecha compra obligatoria")
	public String FECHA_COMPRA;
	@NotEmpty(message = "fecha caducidad obligatoria")
	public String FECHA_CADUCIDAD;
	@NotEmpty(message = "numero lote obligatorio")
	public String NUMERO_LOTE;
	@NotNull(message = "campo Obligatorio")
	public float PRECIO_LOTE;
	@NotNull(message = "campo Obligatorio")
	public int CANTIDAD_LOTE;
	public tb_inventario_vacunas() {
		super();
	}
	public tb_inventario_vacunas(int iD_INVENTARIO_VACUNA, int iD_TIPO_VACUNA, int iD_LABORATORIO, String fECHA_COMPRA,
			String fECHA_CADUCIDAD, String nUMERO_LOTE, float pRECIO_LOTE, int cANTIDAD_LOTE) {
		super();
		ID_INVENTARIO_VACUNA = iD_INVENTARIO_VACUNA;
		ID_TIPO_VACUNA = iD_TIPO_VACUNA;
		ID_LABORATORIO = iD_LABORATORIO;
		FECHA_COMPRA = fECHA_COMPRA;
		FECHA_CADUCIDAD = fECHA_CADUCIDAD;
		NUMERO_LOTE = nUMERO_LOTE;
		PRECIO_LOTE = pRECIO_LOTE;
		CANTIDAD_LOTE = cANTIDAD_LOTE;
	}
	public int getID_INVENTARIO_VACUNA() {
		return ID_INVENTARIO_VACUNA;
	}
	public void setID_INVENTARIO_VACUNA(int iD_INVENTARIO_VACUNA) {
		ID_INVENTARIO_VACUNA = iD_INVENTARIO_VACUNA;
	}
	public int getID_TIPO_VACUNA() {
		return ID_TIPO_VACUNA;
	}
	public void setID_TIPO_VACUNA(int iD_TIPO_VACUNA) {
		ID_TIPO_VACUNA = iD_TIPO_VACUNA;
	}
	public int getID_LABORATORIO() {
		return ID_LABORATORIO;
	}
	public void setID_LABORATORIO(int iD_LABORATORIO) {
		ID_LABORATORIO = iD_LABORATORIO;
	}
	public String getFECHA_COMPRA() {
		return FECHA_COMPRA;
	}
	public void setFECHA_COMPRA(String fECHA_COMPRA) {
		FECHA_COMPRA = fECHA_COMPRA;
	}
	public String getFECHA_CADUCIDAD() {
		return FECHA_CADUCIDAD;
	}
	public void setFECHA_CADUCIDAD(String fECHA_CADUCIDAD) {
		FECHA_CADUCIDAD = fECHA_CADUCIDAD;
	}
	public String getNUMERO_LOTE() {
		return NUMERO_LOTE;
	}
	public void setNUMERO_LOTE(String nUMERO_LOTE) {
		NUMERO_LOTE = nUMERO_LOTE;
	}
	public float getPRECIO_LOTE() {
		return PRECIO_LOTE;
	}
	public void setPRECIO_LOTE(float pRECIO_LOTE) {
		PRECIO_LOTE = pRECIO_LOTE;
	}
	public int getCANTIDAD_LOTE() {
		return CANTIDAD_LOTE;
	}
	public void setCANTIDAD_LOTE(int cANTIDAD_LOTE) {
		CANTIDAD_LOTE = cANTIDAD_LOTE;
	}
	
	
	
}
