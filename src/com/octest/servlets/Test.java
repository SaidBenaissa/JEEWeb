package com.octest.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;
import com.octest.beans.Voiture;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Auteur auteur = new Auteur();
		 auteur.setPrenom("Benaissa");
		 auteur.setNom("Said");
		 auteur.setActif(true);
		 
		 request.setAttribute("auteur", auteur);
		 
		 
		 
		 Voiture voiture= new Voiture();
		 voiture.setColeur("Blue");
		 voiture.setModel("Audi A4");
		 voiture.setActif(true);
		 
		 request.setAttribute("voiture", voiture);
		 String [] titres= {"Une etoile a ete decouverte","Au paye des merveille","Qui bosse gagne"};
		 request.setAttribute("titres", titres);
		 
		 this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
	}

}
