package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.OversigtException;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "oversigt", new Oversigt() );
        commands.put("createEmployee", new createEmployee());
        commands.put("OversigtEmployee", new OversigtEmployee());
        commands.put("deleteCustomer", new deleteCustomer());
        commands.put("changePasswordCustomer", new changePasswordCustomer());
        commands.put("logOut", new logOut());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response )
            throws LoginSampleException, OversigtException;

}
