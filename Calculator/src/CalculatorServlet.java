

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
    PrintWriter out = response.getWriter();
    String n1 = request.getParameter("no1");
    String n2 = request.getParameter("no2");
    String opt = request.getParameter("opt");
    if(opt.equals("p"))
    out.println(Integer.parseInt(n1) + Integer.parseInt(n2));
    else if(opt.equals("m"));
    out.println(Integer.parseInt(n1) + Integer.parseInt(n2));
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws     IOException,ServletException
    {
    doPost(request,response);
    }

}
