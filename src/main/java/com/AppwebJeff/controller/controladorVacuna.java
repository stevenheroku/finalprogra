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

import com.AppwebJeff.Model.cat_laboratorio;
import com.AppwebJeff.Model.cat_tipo_vacuna;
import com.AppwebJeff.interfacesServices.Icat_Vacu;
import com.AppwebJeff.interfacesServices.Icat_lab;

@Controller
@RequestMapping
public class controladorVacuna {

	@Autowired 
    private Icat_Vacu service;
	@Autowired 
	 private Icat_Vacu data;
	
	
	@GetMapping({"/nn","/vacunasjeff"})
	public String index() 
	{
		
		return "listarCatVacuna";
	}
	
	
	@GetMapping("/catvacuna")
	public String listar(Model model) {
		List<cat_tipo_vacuna>cat_vacu=service.listars();
		model.addAttribute("cat_vacunacion",cat_vacu);
		
		return "listarCatVacuna";
	
	}
	
	
	@GetMapping("/agregar")
    public String agregar(Model model){
        model.addAttribute("cat_tipo_vacuna", new cat_tipo_vacuna());
        return "formCatVacuna";
    }
	
	
	
    @PostMapping("/aguardar")
    public String save(@Valid cat_tipo_vacuna cf,BindingResult result, Model model){
    	

        	if(result.hasErrors())
        	{
        		return "formCatVacuna";
        	}
        	
    	service.save(cf);
        return "redirect:/catvacuna";
    }
    
    @GetMapping("/editarvacuna/{ID_TIPO_VACUNA}")
    public String editar(@PathVariable int ID_TIPO_VACUNA, Model model){
        Optional<cat_tipo_vacuna>ID_vacu =service.listarId(ID_TIPO_VACUNA);
        model.addAttribute("cat_tipo_vacuna", ID_vacu);
        return "formCatVacuna";
    }
                                                                                                                                                      
    @GetMapping("/eliminarvacun/{ID_TIPO_VACUNA}")
    public String delete(@PathVariable int ID_TIPO_VACUNA, Model model){
    	service.delete(ID_TIPO_VACUNA);
       return "redirect:/catvacuna";
    }
    
   


}
