package javaProject.business.validator;

import javaProject.entities.concretes.User;

public interface ValidateService {
    boolean nameAndLastNameCheck(User user);
    boolean passwordCheck(User user);
    boolean mailCheck(User user,String mail);
    boolean verify(User user);

}
