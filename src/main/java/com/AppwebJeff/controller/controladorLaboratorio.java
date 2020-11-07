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
import com.AppwebJeff.interfacesServices.Icat_lab;





@Controller
@RequestMapping
public class controladorLaboratorio {

	
	@Autowired 
    private Icat_lab service;
	

	
	@GetMapping({"/index","/vacunas"})
	public String index() 
	{
		
		return "index";
	}
	
	@GetMapping("/cargar")
	public String listar(Model model) {
		List<cat_laboratorio>cat_labjeff=service.listar();
		model.addAttribute("cat_Labora",cat_labjeff);
		
		return "listar";
	
	}
	
	
	
	@GetMapping("/create")
    public String agregar(){
    
        return "frmCrear";
    }
	
	@GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("cat_laboratorio", new cat_laboratorio());
        return "frmCrear";
    }
	
	
    @PostMapping("/save")
    public String save(@Valid cat_laboratorio cf ,BindingResult result,Model model){
    	
    	if(result.hasErrors())
    	{
    		return "frmCrear";
    	}
    	
    	service.save(cf);
        return "redirect:/cargar";
    }
    
    
    @GetMapping("/editar/{id_laboratorio}")
    public String editar(@PathVariable int id_laboratorio, Model model){
        Optional<cat_laboratorio>cat_labo =service.listarId(id_laboratorio);
        model.addAttribute("cat_laboratorio", cat_labo);
        return "frmCrear";
    }
                                                                                                                                                      
    @GetMapping("/eliminar/{id_laboratorio}")
    public String delete(@PathVariable int id_laboratorio, Model model){
    	service.delete(id_laboratorio);
       return "redirect:/cargar";
    }
	
	
	
}
