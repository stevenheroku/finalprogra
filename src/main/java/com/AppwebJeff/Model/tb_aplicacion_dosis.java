package com.AppwebJeff.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tb_aplicacion_dosis")
public class tb_aplicacion_dosis {
	@NotNull(message = "Debe ingresar Id ")
	@Id  
    @Column(name = "ID_APLICACION", unique = true, nullable =false) 
	public int ID_APLICACION;
	@NotNull(message = "campo Obligatorio")
	public int ID_INVENTARIO_VACUNA;
	@NotEmpty(message = "campo Obligatorio")
	public String CUI;
	@NotEmpty(message = "campo Obligatorio")
	public String FECHA_APLICACION;
	@NotNull(message = "campo Obligatorio")
	public int CANTIDAD_APLICADA;
	
	public tb_aplicacion_dosis() {
		super();
	}
	public tb_aplicacion_dosis(int iD_APLICACION, int iD_INVENTARIO_VACUNA, String cUI, String fECHA_APLICACION,
			int cANTIDAD_APLICADA) {
		super();
		ID_APLICACION = iD_APLICACION;
		ID_INVENTARIO_VACUNA = iD_INVENTARIO_VACUNA;
		CUI = cUI;
		FECHA_APLICACION = fECHA_APLICACION;
		CANTIDAD_APLICADA = cANTIDAD_APLICADA;
	}
	public int getID_APLICACION() {
		return ID_APLICACION;
	}
	public void setID_APLICACION(int iD_APLICACION) {
		ID_APLICACION = iD_APLICACION;
	}
	public int getID_INVENTARIO_VACUNA() {
		return ID_INVENTARIO_VACUNA;
	}
	public void setID_INVENTARIO_VACUNA(int iD_INVENTARIO_VACUNA) {
		ID_INVENTARIO_VACUNA = iD_INVENTARIO_VACUNA;
	}
	public String getCUI() {
		return CUI;
	}
	public void setCUI(String cUI) {
		CUI = cUI;
	}
	public String getFECHA_APLICACION() {
		return FECHA_APLICACION;
	}
	public void setFECHA_APLICACION(String fECHA_APLICACION) {
		FECHA_APLICACION = fECHA_APLICACION;
	}
	public int getCANTIDAD_APLICADA() {
		return CANTIDAD_APLICADA;
	}
	public void setCANTIDAD_APLICADA(int cANTIDAD_APLICADA) {
		CANTIDAD_APLICADA = cANTIDAD_APLICADA;
	}

}
