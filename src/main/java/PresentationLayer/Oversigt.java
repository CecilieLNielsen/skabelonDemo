package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OversigtException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class Oversigt extends Command {


    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OversigtException {
        ArrayList<String> userEmails = LogicFacade.oversigt();

        HttpSession session = request.getSession();

        session.setAttribute( "emails", userEmails );

        session.setAttribute("emailCount", userEmails.size());

        return "oversigt";
    }
}
