package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import agendaspring.daos.ContatoDAO;
import agendaspring.models.Contato;

@Controller
public class ContatosController {

	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("DRACARYS!!");
		return "contatos/form";

	}

	@PostMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("Id: " + contato.getId());
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Endereco: " + contato.getEndereco());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Email: " + contato.getDataNascimento());
		System.out.println("Chamou o metodo de add");
		ContatoDAO dao = new ContatoDAO();
		dao.inserir(contato);
		return "contatos/ok";
	}

	@GetMapping("/contatos")
	public ModelAndView listar() {
		ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> lista = contatoDAO.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);
		return model;
	}

}
