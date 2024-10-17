
DROP TABLE IF EXISTS board;
CREATE TABLE board(
                          id BIGINT auto_increment,
                          title varchar (30) not null,
                          content varchar (30) not null,
                          name varchar (30) not null,
                          primary key(id)
);

INSERT INTO board(title, content, name) VALUES('title2', 'content2', 'name2');
INSERT INTO board(title, content, name) VALUES('title3', 'content3', 'name3');
INSERT INTO board(title, content, name) VALUES('title4', 'content4', 'name4');
INSERT INTO board(title, content, name) VALUES('title5', 'content5', 'name5');
INSERT INTO board(title, content, name) VALUES('title6', 'content6', 'name6');
