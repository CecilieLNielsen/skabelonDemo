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
        UserMapper.createEmployee( user );
        return user;
    }

    public static ArrayList<String> userEmailsEmployee() throws OversigtException {
        return UserMapper.userEmailsEmployee();

    }

    public static void deleteCustomer( String email ) throws LoginSampleException {
       // User user = new User(email);
        UserMapper.deleteCustomer( email );
        //return user;
    }

    public static void changePasswordCustomer(String email, String password) throws LoginSampleException {
        //User user = new User(email, password, "customer");
        UserMapper.changePasswordCustomer(email, password);
        //return user;
    }



}
