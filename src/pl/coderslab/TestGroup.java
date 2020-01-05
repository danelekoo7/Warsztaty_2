package pl.coderslab;

import pl.coderslab.dao.GroupDao;
import pl.coderslab.model.Group;

public class TestGroup {
    public static void main(String[] args) {
        Group group = new Group(4, "słaba grupa");
        GroupDao groupDao = new GroupDao();
//        groupDao.create(group);


//        groupDao.read(1);
//        groupDao.update(group);
//     groupDao.delete(5);

        Group group1 = groupDao.read(4);
        groupDao.create(group1);

        for (int i = 0; i <groupDao.findAll().length ; i++) {
            groupDao.printGroup(groupDao.findAll()[i]);
        }


    }
}