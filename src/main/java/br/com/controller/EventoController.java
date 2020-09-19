package br.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.entity.Evento;
import br.com.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	EventoRepository edao;
	
	@GetMapping("/")
	public ModelAndView iniciar() throws Exception{
		ModelAndView mv = new ModelAndView("sistema");
		mv.addObject("lista", edao.findAll());
		return mv;
	}
	
	@PostMapping("/gravar")
	public ModelAndView gravar(@RequestParam String nome,@RequestParam String data,
			@RequestParam String horario,@RequestParam String descricao,
			HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView("sistema");
		try {			
			Evento e = new Evento(null, nome, data, horario, descricao);
			edao.save(e);
			mv.addObject("lista",edao.findAll());
			mv.addObject("msg","Dados Gravados!");
			response.sendRedirect("/");
		}catch(Exception ex) {
			mv.addObject("msg","Erro na gravação: " + ex.getMessage());
			ex.printStackTrace();
		}		
		return mv;
	}
	
	@GetMapping(value="/excluir/{cod}")
	public void excluir(@PathVariable Long cod, HttpServletResponse response, HttpServletRequest request) throws Exception{
		try {
			Evento e = edao.findById(cod).get();
			edao.delete(e);
			response.sendRedirect("/");			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	
	
}
