package com.devgabriel.liveAlone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
