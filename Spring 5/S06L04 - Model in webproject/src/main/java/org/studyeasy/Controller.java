package org.studyeasy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studyeasy.model.Person;


@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person> staff= new ArrayList<>();
		staff.add(new Person("Amit", 27));
		staff.add(new Person("Sanchita", 22));
		request.setAttribute("staff", staff);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

	
}
