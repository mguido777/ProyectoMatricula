package com.ingenieriaweb.matriculas3.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.matriculas3.web.app.models.Pago;
import com.ingenieriaweb.matriculas3.web.app.services.PagoService;

@Controller
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping
    public String index(Model model) {
        List<Pago> pagos = pagoService.listarTodos();
        model.addAttribute("pagos", pagos);
        return "pagos/index";
    }

    @GetMapping("/crear")
    public String crearFormulario(Model model) {
        model.addAttribute("pago", new Pago());
        return "pagos/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("pago") Pago pago) {
        pagoService.guardar(pago);
        return "redirect:/pagos";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Integer id, Model model) {
        Pago pago = pagoService.obtenerPorId(id);
        if (pago != null) {
            model.addAttribute("pago", pago);
            return "pagos/form";
        }
        return "redirect:/pagos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        pagoService.eliminar(id);
        return "redirect:/pagos";
    }
}
