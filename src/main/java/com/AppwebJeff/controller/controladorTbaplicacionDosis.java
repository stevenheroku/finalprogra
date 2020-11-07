package com.AppwebJeff.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AppwebJeff.Model.tb_aplicacion_dosis;

import com.AppwebJeff.interfacesServices.I_aplicacion_dosis;


@Controller
@RequestMapping
public class controladorTbaplicacionDosis {
	@Autowired 
    private I_aplicacion_dosis service;
	
	
	
	
	

	
	
	@GetMapping("/AplicacionDosis")
	public String listar(Model model) {
		List<tb_aplicacion_dosis>TABLE_dosis=service.listar();
		model.addAttribute("tabla_aplicacionDosis",TABLE_dosis);
		
		return "listarTbAplicacionDosis";
	
	}
	
	@GetMapping("/agregarAplicacionDosis")
    public String agregar(Model model){
        model.addAttribute("tb_aplicacion_dosis", new tb_aplicacion_dosis());
        return "formAplicacionDosis";
    }
	
	
	
    @PostMapping("/aguardaraAplicacionDosis")
    public String save(@Valid tb_aplicacion_dosis cf, BindingResult result, Model model){
    	
    	
        	if(result.hasErrors())
        	{
        		return "formAplicacionDosis";
        	}
    	service.save(cf);
        return "redirect:/AplicacionDosis";
    }
    
    @GetMapping("/editarAplicacionDosis/{ID_APLICACION}")
    public String editar(@PathVariable int ID_APLICACION, Model model){
        Optional<tb_aplicacion_dosis>id_apli =service.listarId(ID_APLICACION);
        model.addAttribute("tb_aplicacion_dosis", id_apli);
        return "formAplicacionDosis";
    }
                                                                                                                                                      
    @GetMapping("/eliminarAplicacionDosis/{ID_APLICACION}")
    public String delete(@PathVariable int ID_APLICACION, Model model){
    	service.delete(ID_APLICACION);
       return "redirect:/AplicacionDosis";
    }
    
	
}