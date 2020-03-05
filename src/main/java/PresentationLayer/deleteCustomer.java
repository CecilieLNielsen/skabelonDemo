package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class deleteCustomer extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        HttpSession session = request.getSession();
        String email = request.getParameter( "email" );
        LogicFacade.deleteCustomer(email);
        session.setAttribute("deleteEmail", email);

        return "deleteCustomer";

}
}
