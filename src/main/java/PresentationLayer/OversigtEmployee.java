package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.OversigtException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class OversigtEmployee extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OversigtException {
        ArrayList<String> userEmailsEmployee = LogicFacade.userEmailsEmployee();

        HttpSession session = request.getSession();

        session.setAttribute( "userEmails", userEmailsEmployee );

        session.setAttribute("userEmailCount", userEmailsEmployee.size());

        return "userEmailsEmployee";
    }
}
