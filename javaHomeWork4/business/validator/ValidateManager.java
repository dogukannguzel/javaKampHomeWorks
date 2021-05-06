package javaProject.business.validator;

import javaProject.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateManager implements ValidateService{
    private List<User> users = new ArrayList<User>();

    @Override
    public boolean verify(User user) {
        if (nameAndLastNameCheck(user)&&passwordCheck(user)&&mailCheck(user,user.getMail())){
            users.add(user);
            return true;
        }else{
            return false;

        }



    }

    @Override
    public boolean nameAndLastNameCheck(User user) {
        if (user.getFirstName().length()<2||user.getLastName().length()<2){
            System.out.println("isim ya da soy isim 2 karekterden kucuk olamaz");
            return false;

        }

        return true;
    }

    @Override
    public boolean passwordCheck(User user) {
        if (user.getPassword().length()<6){
            System.out.println("Parola 6 karekterden küçük olamaz");
            return false;
        }

        return true;
    }

    @Override
    public boolean mailCheck(User user,String mail) {

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getMail());
        if(!matcher.matches()) {
            System.out.println("Mail adresi Yanlış");
            return false;
        }
        for (User userr : users) {
            if (mail == userr.getMail()) {
                System.out.println("Bu email ile sistemde zaten üye var !");
                return false;
            }
        }
         return true;
    }


}
