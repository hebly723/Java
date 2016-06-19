/**
 * 
 */
package form;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.ws.ResponseWrapper;

import java.io.*;
import java.util.LinkedHashMap;

/**
 * @author hebly723
 *
 */
public class formaction extends HttpServlet {

	/**
	 * 
	 */
	public formaction() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException{
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		String [] s = request.getParameterValues("xx");
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		for (int i=0;i<s.length;i++)
		{
			String string = s[i];
			System.out.println(string + "我看看这是啥");
			if (request.getParameter("x" + string)!=null&&!request.getParameter("x"+string).trim().equals(""))
			{
				String value = request.getParameter("x"+string);
				
				map.put(string, value);
				System.out.println(value);
			}
			/*System.out.println(map.values() + "这是zhi");
			System.err.println(map.keySet() + "这是键");*/
			
			//out.println(s[0]);
		}
		for (int i = 1; i <= s.length; i++) {
			out.println(map.get(""+ i));
		}
		
	}

}
