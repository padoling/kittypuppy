CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT,
    social_type ENUM('K', 'G', 'N'),
    social_uid VARCHAR(100),
    user_type VARCHAR(10),
    nickname VARCHAR(20),
    email VARCHAR(255),
    refresh_token VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE pet (
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT,
    name VARCHAR(20),
    species ENUM('C', 'D'),
    sex ENUM('F', 'M'),
    age INT,
    photo_url VARCHAR(255),
    description VARCHAR(255),
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
    content VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE post_likes (
    id INT AUTO_INCREMENT,
    post_id INT,
    user_id INT,
    PRIMARY KEY (id)
);

CREATE TABLE post_image (
    id INT AUTO_INCREMENT,
    post_id INT,
    image_url VARCHAR(255),
    PRIMARY KEY (id)
);