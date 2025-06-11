/*package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AsesorController {
	
	@GetMapping("/asesores")
    public String mostrarVistaAsesor(Model model) {
        
        return "asesores/muestra"; // busca 'asesor.html' en /resources/templates
    }


}*/
package com.ingenieriaweb.matriculas3.web.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AsesorController {

 

    @GetMapping("/asesores")
    public String mostrarAsesores(Model model) {
    	
    	
        return "asesores/muestra"; // Ruta: templates/asesores/muestra.html
    }
}
