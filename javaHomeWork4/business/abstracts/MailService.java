package javaProject.business.abstracts;

import javaProject.entities.concretes.User;

public interface MailService {
    void sendMail(User user);
    void verification(User user);
    boolean verifyMailController(User user,int code);

}
