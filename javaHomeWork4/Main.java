package javaProject;

import javaProject.business.abstracts.AuthService;
import javaProject.business.abstracts.UserService;
import javaProject.business.concretes.AuthManager;
import javaProject.business.concretes.MailManager;
import javaProject.business.concretes.UserManager;
import javaProject.business.validator.ValidateManager;
import javaProject.core.abstracts.GoogleAuthService;
import javaProject.core.concretes.GoogleAdapters;
import javaProject.dataAccess.concretes.HibernateUserDao;
import javaProject.entities.concretes.User;
import javaProject.googleAuth.GoogleAuthManager;

public class Main {

    public static void main(String[] args) {


        User user = new User(1,"Dogukan","Gguzel","dgkngzl33@gmail.com","213243",false);
        User user2 = new User(1,"Dogukan","Gguzel","dgkngzl42@gmail.com","213243",false);
        UserService userService = new UserManager(new ValidateManager(),new MailManager(),new HibernateUserDao());

        GoogleAuthService googleAuthService = new GoogleAdapters();
        googleAuthService.registerGoogle(user);

        userService.add(user);
        userService.add(user2);


        AuthService authService=new AuthManager();
        authService.login(user);

    }
}
