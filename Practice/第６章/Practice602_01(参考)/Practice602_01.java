import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Practice602_01 extends HttpServlet{

	public void doGet(HttpServletRequest request,
							HttpServletResponse response)
								throws IOException,ServletException{
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Practice602_01</title></head>");
		out.println("<body>");
		out.println("<p>����ɂ��́I�i�������̊w�K����l�߂ł�");
		out.println("</p>");
		out.println("</body></html>");
	}
}
