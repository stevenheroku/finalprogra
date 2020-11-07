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


import com.AppwebJeff.Model.tb_persona;
import com.AppwebJeff.interfaces.interface_pacientes;
import com.AppwebJeff.interfacesServices.I_tb_persona;
import com.AppwebJeff.interfacesServices.pacientes_I;


@Controller
@RequestMapping
public class controladorTbPersonas {

	@Autowired 
    private I_tb_persona service;
	
	@Autowired
	private pacientes_I data;
	
	
	
	@GetMapping({"/tbpers","/tbpersona"})
	public String index() 
	{
		
		return "listarTbPersonas";
	}
	
	
	@GetMapping("/pacientesvacu")
	public String listar(Model model) {
		List<tb_persona>TABLE_PER=service.listar();
		model.addAttribute("tabla_personas",TABLE_PER);
		
		return "listarTbPersonas";
	
	}
	
	@GetMapping("/agregarpaciente")
    public String agregar(Model model){
        model.addAttribute("tb_persona", new tb_persona());
        return "formPersonas";
    }
	
	
	
    @PostMapping("/aguardarpaciente")
    public String save(@Valid tb_persona cf,BindingResult result,  Model model){
    		
        	if(result.hasErrors())
        	{
        		return "formPersonas";
        	}
        	
    	service.save(cf);
        return "redirect:/pacientesvacu";
    }
    
    @GetMapping("/editarpaciente/{CUI}")
    public String editar(@PathVariable String CUI, Model model){
        Optional<tb_persona>cui =data.listarId(CUI);
        model.addAttribute("tb_persona", cui);
        return "formPersonas";
    }
                                                                                                                                                      
    @GetMapping("/eliminarpaciente/{CUI}")
    public String delete(@PathVariable String CUI, Model model){
    	data.delete(CUI);
       return "redirect:/pacientesvacu";
    }
    
	
}
