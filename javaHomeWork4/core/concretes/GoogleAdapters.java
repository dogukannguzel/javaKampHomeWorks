package javaProject.core.concretes;

import javaProject.core.abstracts.GoogleAuthService;
import javaProject.entities.concretes.User;
import javaProject.googleAuth.GoogleAuthManager;

public class GoogleAdapters implements GoogleAuthService {
    @Override
    public void registerGoogle(User user) {
        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.register(user.getMail(), user.getPassword());

    }


    public void loginGoogle(User user){
        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.login(user.getMail(),user.getPassword());

    }

}
