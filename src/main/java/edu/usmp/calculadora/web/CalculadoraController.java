package edu.usmp.calculadora.web;
//importar
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.usmp.calculadora.model.Calculadora;

@Controller
public class CalculadoraController {

	@GetMapping("/new")
	public String initCreationForm(Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "calculadoraForm";
	}

	@PostMapping("/new")
	public String submitForm(@ModelAttribute Calculadora calculadora) {
		
		/*if(operacion.ope1)
		calculadora.getResultado();*/
				
		return "resultForm";
	}
}
