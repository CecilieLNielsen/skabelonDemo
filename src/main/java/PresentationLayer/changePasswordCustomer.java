package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OversigtException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class changePasswordCustomer extends Command {


    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
    String email = request.getParameter("email");
    String password1 = request.getParameter("password1");
    String password2 = request.getParameter("password2");
    if (password1.equals(password2)) {
        LogicFacade.changePasswordCustomer(email, password1);
        HttpSession session = request.getSession();
        session.setAttribute("email", email);

    } else {
        throw new IllegalArgumentException("Passwords doesn't match");
    }
    return "employeepage";

    }
}
