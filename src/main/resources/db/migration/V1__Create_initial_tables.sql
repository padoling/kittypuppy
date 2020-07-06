CREATE TABLE user (
    id INT AUTO_INCREMENT,
    email VARCHAR(255),
    password VARCHAR(100),
    user_name VARCHAR(20),
    user_type VARCHAR(10),
    reg_date datetime,
    PRIMARY KEY (id)
);

CREATE TABLE pet (
    id INT AUTO_INCREMENT,
    user_id INT,
    name VARCHAR(20),
    species VARCHAR(3),
    sex CHAR(1),
    age INT,
    photo_url VARCHAR(256),
    description VARCHAR(256),
    PRIMARY KEY (id)
);

CREATE TABLE post (
    id INT AUTO_INCREMENT,
    user_id INT,
    pet_id INT,
    content VARCHAR(1000),
    PRIMARY KEY (id)
);

CREATE TABLE post_comment (
    id INT AUTO_INCREMENT,
    post_id INT,
    user_id INT,
    content VARCHAR(256),
    PRIMARY KEY (id)
);

CREATE TABLE post_likes (
    id INT AUTO_INCREMENT,
    post_id INT,
    user_id INT,
    PRIMARY KEY (id)
);

CREATE TABLE image (
    id INT AUTO_INCREMENT,
    post_id INT,
    image_url VARCHAR(256),
    PRIMARY KEY (id)
);