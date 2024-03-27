CREATE TABLE lists (
    list_id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    description varchar(255),

    PRIMARY KEY (list_id)
);

CREATE TABLE tasks (
    task_id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    due_date DATE,
    completed BOOLEAN NOT NULL,
    list_id int,
    list_order int,

    PRIMARY KEY (task_id),
    FOREIGN KEY (list_id) REFERENCES lists(list_id)
);

CREATE TABLE users (
    user_id int NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,

    PRIMARY KEY (user_id)
);

CREATE TABLE user_lists (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    list_id int NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (list_id) REFERENCES lists(list_id)
);



