package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.OversigtException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logOut extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();
        session.invalidate();
      return "../index";
    }
}
