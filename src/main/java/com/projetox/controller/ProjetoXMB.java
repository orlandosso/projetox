package com.projetox.controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 * Projeto X
 * @author SoutoOrS
 *
 */
@ManagedBean
@SessionScoped
public class ProjetoXMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void enviar(){
		
	}
}