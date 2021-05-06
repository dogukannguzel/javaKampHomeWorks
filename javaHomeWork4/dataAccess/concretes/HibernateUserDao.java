package javaProject.dataAccess.concretes;

import javaProject.dataAccess.abstracts.UserDao;
import javaProject.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    private List<User> users = new ArrayList<User>();
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() +  " eklendi ...");
        users.add(user);

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " kullanıcısı silindi");
    }

    @Override
    public void uptade(User user) {
        System.out.println(user.getFirstName() + " kullanıcı hesabında değişiklik yaptı");
    }

    @Override
    public List<User> getAll() {
      List<User>customer = new ArrayList<User>();

      for (User user:users){
          customer.add(user);
      }


        return customer;
    }
}
