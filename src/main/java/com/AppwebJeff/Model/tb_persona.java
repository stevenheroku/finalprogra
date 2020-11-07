package com.AppwebJeff.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="tb_persona")
public class tb_persona {

	@NotEmpty
	@Id  
    @Column(name = "CUI") 
	 @Size( max = 13, message="El CUI del la persona solo debe tener 13 digitos")
	public String CUI;
	
	@NotEmpty(message = "campo obligatorio")
	public String NOMBRE;
	
	@NotEmpty(message = "fecha de nacimiento obligatoria")
	public String FECHA_NACIMIENTO;
	
	@NotEmpty(message = "Direccion obligatoria")
	public String DIRECCION;
	
	@NotEmpty(message = "telefono movil obligatorio")
	public String TELEFONO_MOVIL;
	
	@NotEmpty(message = "telefono casa obligatorio")
	public String TELEFONO_CASA;
	
	@NotEmpty(message = "Nombre del encargado obligatorio")
	public String NOMBRE_ENCARGADO;
	
	@NotEmpty(message = "Cui del encargado obligatorio")
	public String CUI_ENCARGADO;
	public tb_persona() {
		super();
	}
	public tb_persona(String cUI, String nOMBRE, String fECHA_NACIMIENTO, String dIRECCION, String tELEFONO_MOVIL,
			String tELEFONO_CASA, String nOMBRE_ENCARGADO, String cUI_ENCARGADO) {
		super();
		CUI = cUI;
		NOMBRE = nOMBRE;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		DIRECCION = dIRECCION;
		TELEFONO_MOVIL = tELEFONO_MOVIL;
		TELEFONO_CASA = tELEFONO_CASA;
		NOMBRE_ENCARGADO = nOMBRE_ENCARGADO;
		CUI_ENCARGADO = cUI_ENCARGADO;
	}
	public String getCUI() {
		return CUI;
	}
	public void setCUI(String cUI) {
		CUI = cUI;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}
	public void setFECHA_NACIMIENTO(String fECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public String getTELEFONO_MOVIL() {
		return TELEFONO_MOVIL;
	}
	public void setTELEFONO_MOVIL(String tELEFONO_MOVIL) {
		TELEFONO_MOVIL = tELEFONO_MOVIL;
	}
	public String getTELEFONO_CASA() {
		return TELEFONO_CASA;
	}
	public void setTELEFONO_CASA(String tELEFONO_CASA) {
		TELEFONO_CASA = tELEFONO_CASA;
	}
	public String getNOMBRE_ENCARGADO() {
		return NOMBRE_ENCARGADO;
	}
	public void setNOMBRE_ENCARGADO(String nOMBRE_ENCARGADO) {
		NOMBRE_ENCARGADO = nOMBRE_ENCARGADO;
	}
	public String getCUI_ENCARGADO() {
		return CUI_ENCARGADO;
	}
	public void setCUI_ENCARGADO(String cUI_ENCARGADO) {
		CUI_ENCARGADO = cUI_ENCARGADO;
	}

	
}
