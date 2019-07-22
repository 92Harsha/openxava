package org.openxava.web.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import org.openxava.actions.*;
import org.openxava.controller.*;
import org.openxava.util.*;
import org.openxava.web.*;


/**
 * tmp
 * 
 * @author Javier Paniza
 */
@WebServlet("/xava/upload")
public class UploadServlet extends HttpServlet { // tmp �Hacer una clase base para obtener manager y llamar acciones? 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doGet] "); // tmp
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doPost] "); // tmp
		executeAction(request, response, new LoadImageAction(), true);
		/* tmp
		try {
			ModuleContext context = (ModuleContext) request.getSession().getAttribute("context");
			ModuleManager manager = (ModuleManager) context.get(request, "manager"); // TMP
			manager.parseMultipartRequest(request); // tmp �Cuando se libera xava.upload.fileitems?
			LoadImageAction action = new LoadImageAction();
			// tmp action.setNewImageProperty(request.getParameter("property")); 
			action.setNewImageProperty(Ids.undecorate(request.getParameter("propertyKey"))); // tmp
			Messages errors = (Messages) request.getAttribute("errors");
			Messages messages = (Messages) request.getAttribute("messages");
			manager.executeAction(action, errors, messages, request);
		}
		catch (Exception ex) { // tmp �C�mo hacemos esto?
			ex.printStackTrace();
			throw new ServletException("Error al subir archivo"); // tmp i18n �Lanzar esta excepci�n?
		}
		*/
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[UploadServlet.doDelete] "); // tmp
		executeAction(request, response, new DeleteImageAction(), false);
		/* tmp
		try {
			ModuleContext context = (ModuleContext) request.getSession().getAttribute("context");
			ModuleManager manager = (ModuleManager) context.get(request, "manager");
			DeleteImageAction action = new DeleteImageAction();
			// tmp action.setNewImageProperty(request.getParameter("property"));
			action.setNewImageProperty(Ids.undecorate(request.getParameter("propertyKey")));
			Messages errors = (Messages) request.getAttribute("errors");
			Messages messages = (Messages) request.getAttribute("messages");
			manager.executeAction(action, errors, messages, request);
		}
		catch (Exception ex) { // tmp �C�mo hacemos esto?
			ex.printStackTrace();
			throw new ServletException("Error al subir archivo"); // tmp i18n �Lanzar esta excepci�n?
		}		
		*/
	}
	
	private void executeAction(HttpServletRequest request, HttpServletResponse response, IAction action, boolean parseMultipart) throws ServletException {
		try {
			ModuleContext context = (ModuleContext) request.getSession().getAttribute("context");
			ModuleManager manager = (ModuleManager) context.get(request, "manager"); // TMP
			if (parseMultipart) manager.parseMultipartRequest(request); // tmp �Cuando se libera xava.upload.fileitems?
			String property = Ids.undecorate(request.getParameter("propertyKey"));
			PropertiesManager pm = new PropertiesManager(action);
			pm.executeSet("newImageProperty", property);
			Messages errors = (Messages) request.getAttribute("errors");
			Messages messages = (Messages) request.getAttribute("messages");
			manager.executeAction(action, errors, messages, request);
		}
		catch (Exception ex) { 
			ex.printStackTrace(); // tmp Con log
			throw new ServletException("Error al subir archivo"); // tmp i18n 
		}		
	}

}
