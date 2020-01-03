package pl.coderslab;

public class Task3 {
    public String query1 = "CREATE TABLE user_group\n" +
            "(\n" +
            "    id   INT(11) AUTO_INCREMENT,\n" +
            "    name VARCHAR(255),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";

     public String query2 = "CREATE TABLE users\n" +
             "(\n" +
             "    id            INT(11) AUTO_INCREMENT,\n" +
             "    username      VARCHAR(255),\n" +
             "    email         VARCHAR(255),\n" +
             "    password      VARCHAR(245),\n" +
             "    PRIMARY KEY (id),\n" +
             "    user_group_id INT(11),\n" +
             "    FOREIGN KEY (user_group_id) REFERENCES user_group (id) ON DELETE CASCADE\n" +
             ");";

     public String query3 = "CREATE TABLE exercise\n" +
             "(\n" +
             "    id          INT(11) AUTO_INCREMENT,\n" +
             "    title       VARCHAR(255),\n" +
             "    description TEXT,\n" +
             "    PRIMARY KEY (id)\n" +
             ");";

     public String query4 = "CREATE TABLE solution\n" +
             "(\n" +
             "    id          INT(11) AUTO_INCREMENT,\n" +
             "    created     DATETIME,\n" +
             "    updated     DATETIME,\n" +
             "    description TEXT,\n" +
             "    PRIMARY KEY (id),\n" +
             "    users_id    INT(11),\n" +
             "    FOREIGN KEY (users_id) REFERENCES users (id)\n" +
             "        ON DELETE CASCADE,\n" +
             "    exercise_id INT(11),\n" +
             "    FOREIGN KEY (exercise_id) REFERENCES exercise (id) ON DELETE CASCADE\n" +
             ");";
}
