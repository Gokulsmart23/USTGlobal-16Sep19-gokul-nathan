package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {
			String pass = req.getParameter("password");
			String confirmPass = req.getParameter("confirmpassword");
			
			if (pass.equals(confirmPass)) {
				EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				
				RequestDispatcher dispacher = req.getRequestDispatcher("/home");
				dispacher.forward(req, resp);
			} else {
				String msg = "Password not matching";
				req.setAttribute("msg", msg);
				
				RequestDispatcher dispacher = req.getRequestDispatcher("/changepassword.jsp");
				dispacher.forward(req, resp);
			}
		} else {
			RequestDispatcher dispacher = req.getRequestDispatcher("/login.jsp");
			dispacher.forward(req, resp);
		}
	}
}
