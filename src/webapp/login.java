package webapp;

import javadata.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out =response.getWriter();
//        out.println("LOGIN NAME = "+request.getParameter("user"));
//        out.println("\n");
//        out.println("PASSWORD = "+Maskify(request.getParameter("pass")));
        User user= new User();

        request.setAttribute("username",request.getParameter("user"));
        request.setAttribute("password",Maskify(request.getParameter("pass")));

        if(user.verifyuser(request.getParameter("user"),request.getParameter("pass"))){
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);
        }else{
            request.setAttribute("errormsg","Oops, the username or password was wrong");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public static String Maskify(String str){
//        char[] s = str.toCharArray();
//        if(s.length<4){
//            return str;
//        }
//        for(int i=0;i<s.length-4;i++){
//            s[i] = '#';
//        }
//        return new String(s);
        return str.length()<4 ? str: str.substring(0,str.length()-4).replaceAll(".","#")+str.substring(str.length()-4,str.length());

    }
}
