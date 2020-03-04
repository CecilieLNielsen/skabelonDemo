package FunctionLayer;

import DBAccess.UserMapper;

import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

    public static ArrayList<String> oversigt() throws OversigtException {
        return UserMapper.oversigt();

    }

    public static User createEmployee( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "employee");
        UserMapper.createUser( user );
        return user;
    }

}
