package org.openxava.web.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * tmp
 * 
 * @author Javier Paniza
 */
@WebServlet("/xava/upload") // tmp As� o en web.xml / o "/xava/xupload"
public class UploadServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doGet] "); // tmp
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doPost] application=" + request.getParameter("application")); // tmp
		System.out.println("[UploadServlet.doPost] module=" + request.getParameter("module")); // tmp
		// TMP ME QUED� POR AQU�. ESTE SERVLET DEBER�A ASIGNAR LA IMAGEN A LA VISTA.
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doDelete] "); // tmp
	}

}
