package javaProject.business.concretes;

import javaProject.business.abstracts.AuthService;
import javaProject.dataAccess.abstracts.UserDao;
import javaProject.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class AuthManager implements AuthService {


    @Override
    public void login(User user) {
        if (!user.isVerification()){
            System.out.println("Üyeliğinizi doğrulamadınız lütfen doğrulayınız");
            return;
        }
        System.out.println("Başarıyla giriş yaptınız " + user.getFirstName());


    }
}
