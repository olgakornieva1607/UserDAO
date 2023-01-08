package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        User user = new User();
        user.setUserName("jack");
        user.setEmail("jack@mail.com");
        user.setPassword("jackpassword");
        userDao.create(user);

        User read = userDao.read(4);
        System.out.println(read);
        User readNotExist = userDao.read(2);
        System.out.println(readNotExist);

        User userToUpdate = userDao.read(4);
        userToUpdate.setUserName("Jack");
        userToUpdate.setEmail("newemail@mail.com");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);

        User[] all = userDao.findAll();
        for (User u : all){
            System.out.println(u);
        }
        userDao.delete(4);
    }
}
