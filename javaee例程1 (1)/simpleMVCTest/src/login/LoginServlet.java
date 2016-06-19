package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=GB2312");//设置响应的MIME类型。   
		java.io.PrintWriter out = response.getWriter();   
	    //out.print("script Lanuage='JavaScript'>window.alert('登录成功！')</script>");   
		              
		String type=request.getParameter("typeId");   
		if (type.trim().equals("login")) 
		{   
		String name=request.getParameter("name");//获取视图里的name   
		String pas=request.getParameter("pas");//获取视图里的password   
		Model newModel=new Model();//调用模型   
		newModel.setName(name);   
		newModel.setPas(pas);   
		if(newModel.login())   
		{ 
		    out.print("<script Lanuage='JavaScript'>window.alert('登录成功！')</script>");   
		}   
		else 
		{   
		    out.print("<script Lanuage='JavaScript'>window.alert('登录失败！')</script>");   
		}   
	  }
	}	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GB2312");//设置响应的MIME类型。   
		java.io.PrintWriter out = response.getWriter();   
		              
		String type=request.getParameter("typeId");   
		if (type.trim().equals("login")) {   
		String name=request.getParameter("name");//获取视图里的name   
		String pas=request.getParameter("pas");//获取视图里的password   
		Model newModel=new Model();//调用模型   
		newModel.setName(name);   
		newModel.setPas(pas);   
		if(newModel.login())   
		{ 
			RequestDispatcher rd = request.getRequestDispatcher("resultOK.jsp");
			rd.forward(request,response);
		}   
		else {   
			RequestDispatcher rd = request.getRequestDispatcher("resultError.jsp");
			rd.include(request,response);
		}   
	  }
	}
}
