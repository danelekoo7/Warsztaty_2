package pl.coderslab.test;

import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

public class TestUser {
    public static void main(String[] args) {
        User user = new User(10, "kasia", "kajj@g", "fsdfwerabc", 2);
        UserDao userDao = new UserDao();
//        userDao.create(user);
//
//   System.out.println(userDao.read(6));
//        userDao.update(user);

//        userDao.delete(10);

        User user1 = userDao.read(11);
//        userDao.create(user1);

//        for (int i = 0; i <userDao.findAll().length ; i++) {
//            userDao.printUser(userDao.findAll()[i]);
//        }


        for (int i = 0; i <userDao.findAllByGroupId(2).length ; i++) {
            userDao.printUser(userDao.findAllByGroupId(2)[i]);
        }

    }
}