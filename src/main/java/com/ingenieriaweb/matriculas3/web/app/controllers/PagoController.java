package com.ingenieriaweb.matriculas3.web.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ingenieriaweb.matriculas3.web.app.models.Pago;
import com.ingenieriaweb.matriculas3.web.app.models.Matricula;
import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.models.Persona;
import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
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
    
    /**
     * Muestra el formulario de validación para un pago específico.
     * Recupera el pago por su ID y lo añade al modelo para ser mostrado en la vista.
     * @param id El ID del pago a validar.
     * @param model El modelo para pasar el objeto Pago a la vista.
     * @return La vista 'pagos/validar' si el pago existe, o redirecciona a '/pagos' si no se encuentra.
     */
    
    @GetMapping("/show/{id}")
    public String showFormulario(@PathVariable Integer id, Model model) {
        Pago pago = pagoService.obtenerPorId(id);

        if (pago != null) {
            if (pago.getMatricula() != null) {
                Matricula matricula = pago.getMatricula();
                matricula.getFechaMatricula(); // Acceso para forzar carga si es LAZY

                if (matricula.getDocente() != null) {
                    Docente docente = matricula.getDocente();
                    if (docente.getPersona() != null) {
                        // ¡CAMBIO AQUÍ! Usamos getNombres() y getApellidos()
                        docente.getPersona().getNombres();
                        docente.getPersona().getApellidos();
                        // También puedes cargar el correo de Persona si lo necesitas aquí
                        docente.getPersona().getCorreo();
                    }
                    // El error de getEmail() para Usuario aún no se puede resolver sin el modelo Usuario.java
                    // Si tienes el modelo Usuario, asegúrate de que tenga un método getEmail()
                    if (docente.getUsuario() != null) {
                        // docente.getUsuario().getEmail(); // Esta línea causará error si Usuario no tiene getEmail()
                    }
                }
            }

            model.addAttribute("pago", pago);
            return "pagos/show";
        }
        return "redirect:/pagos";
    }
    
    @PostMapping("/validar/{idPago}")
    public String validarPago(@PathVariable Integer idPago, RedirectAttributes redirectAttributes) {
        Optional<Pago> pagoOptional = Optional.ofNullable(pagoService.obtenerPorId(idPago));

        if (pagoOptional.isPresent()) {
            Pago pago = pagoOptional.get();
            if (pago.getEstadoActual() == 1) { // Solo validar si el estado actual es "Registrado"
                pago.setEstadoActual(2); // Cambiar a estado "Validado"
                pagoService.guardar(pago); // Guardar el pago actualizado
                redirectAttributes.addFlashAttribute("successMessage", "Pago #" + idPago + " validado exitosamente.");
            } else {
                redirectAttributes.addFlashAttribute("infoMessage", "El pago #" + idPago + " ya está validado o no se puede validar.");
            }
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "Pago #" + idPago + " no encontrado.");
        }
        return "redirect:/pagos"; // Redirigir a la lista de pagos
    }


    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        pagoService.eliminar(id);
        return "redirect:/pagos";
    }
}
