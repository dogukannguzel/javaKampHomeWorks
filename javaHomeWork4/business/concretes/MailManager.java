package javaProject.business.concretes;

import javaProject.business.abstracts.MailService;
import javaProject.entities.concretes.User;

import java.util.Scanner;

public class MailManager implements MailService {
    @Override
    public void sendMail(User user) {
        System.out.println("Mail Gönderimi Başarılı lütfen hesabınızı onaylayın");
        verification(user);
    }

    @Override
    public void verification(User user) {
        Scanner ınput = new Scanner(System.in);
        System.out.println("Hesabınızı onaylamak için 1 e basınız");

        int code = ınput.nextInt();

        verifyMailController(user,code);



    }

    @Override
    public boolean verifyMailController(User user,int code) {

        if (code ==1){
            System.out.println("Kayıt başarıyla tamamlandı");
            user.setVerification(true);
            return  true;
        }

        return false;
    }
}
