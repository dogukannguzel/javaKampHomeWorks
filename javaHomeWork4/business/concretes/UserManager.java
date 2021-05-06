package javaProject.business.concretes;

import javaProject.business.abstracts.MailService;
import javaProject.business.abstracts.UserService;
import javaProject.business.validator.ValidateService;
import javaProject.dataAccess.abstracts.UserDao;
import javaProject.entities.concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;
    private ValidateService validateService;
    private MailService mailService;
    public UserManager(ValidateService validateService,MailService mailService,UserDao userDao) {
        this.validateService = validateService;
        this.mailService=mailService;
        this.userDao=userDao;
    }

    @Override
    public void add(User user) {
            if (validateService.verify(user)){
                System.out.println("Kayıt başarıyla tamamlandı");
                mailService.sendMail(user);
                userDao.add(user);
            }else{

                System.out.println("cannot to user");
            }
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi");
    }

    @Override
    public void uptade(User user) {
        System.out.println("Kullanıcı guncelleme işlemi yaptı !");
    }
}
