package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.model.CB;
import com.inti.model.Paiement;
import com.inti.model.Paypal;
import com.inti.util.HibernateUtil;


@WebServlet("/paiement")
public class PaiementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Session s;
       
    public PaiementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/paiement.jsp").forward(request, response);
	
		s = HibernateUtil.getSessionFactory().openSession();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try 
		{
			s.beginTransaction();
			
			Paiement p1 = null;
			
			if(request.getParameter("paiement").equals("cb"))
			{
				p1 = new CB(Double.parseDouble(request.getParameter("montant")), LocalDate.parse(request.getParameter("date")), Integer.parseInt(request.getParameter("num")), LocalDate.parse(request.getParameter("dateE")));
			}
			else
			{
				p1 = new Paypal(Double.parseDouble(request.getParameter("montant")), LocalDate.parse(request.getParameter("date")), Integer.parseInt(request.getParameter("numP")));
			}
			
			s.save(p1);
			
			s.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			
			s.getTransaction().rollback();
		}
		
		doGet(request, response);
	}

}
