package com.examen.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examen.demo.entities.AccesoVisitante;
import com.examen.demo.entities.Visitante;
import com.examen.demo.repository.AccesoRepository;
import com.examen.demo.repository.EmpresaRepository;
import com.examen.demo.repository.VisitanteRepository;






@Controller
public class ViewControl {
	
	@Autowired
	VisitanteRepository visitanteRepository;
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Autowired
	AccesoRepository accesoRepository;
	

	
	@GetMapping("/login")
	public String vistaLogin() {
		
		return "login";
		
	}
	
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
		
	}
	
	@GetMapping("/registro/visitante")
	public String registroV(Model model) {
		
	   model.addAttribute("visitante", new Visitante());
	   model.addAttribute("enlace", "/registro/registroV");
	   model.addAttribute("empresa", empresaRepository.findAll());

		return "/visitante";
	}

	
	@PostMapping("/registro/registroV")
	public String visitanteRegistro(@ModelAttribute(value="visitante") Visitante visitante, RedirectAttributes r) {
			
			visitanteRepository.save(visitante);
			return "redirect:/";
		}
		
		
		
		
		
		
		@GetMapping("/registro/ingreso")
		public String ingreso(Model model) {
			
		   model.addAttribute("ingreso", new AccesoVisitante());
		   model.addAttribute("enlace", "/registro/registroI");
		   model.addAttribute("visitantes", visitanteRepository.findAll());

			return "/ingreso";
		}
		
		
		@PostMapping("/registro/registroI")
	public String ingresoRegistro(@ModelAttribute(value="ingreso") AccesoVisitante ingreso, RedirectAttributes r) {
			
			accesoRepository.save(ingreso);
			return "redirect:/";
		}
		
		@GetMapping("/registro/codigoQR")
		public String codigoQR(Model model) {
			

			return "/codigoQR";
		}
}
