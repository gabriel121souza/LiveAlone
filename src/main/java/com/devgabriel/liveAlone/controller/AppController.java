package com.devgabriel.liveAlone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devgabriel.liveAlone.model.Produto;
import com.devgabriel.liveAlone.service.ProdutoService;

@Controller
public class AppController {
	
	@Autowired
	public ProdutoService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Produto> listaProdutos = service.listAll();
		model.addAttribute("listaProdutos", listaProdutos);
		return "index";
		
	}
	//navegando pela pagina new 
	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Produto produto = new Produto();
		model.addAttribute("produto", produto);
		return "novo_produto";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String salvarProduto(@ModelAttribute("produto") Produto produto) {
		service.save(produto);
		return "redirect:/";
		}
		
	}

