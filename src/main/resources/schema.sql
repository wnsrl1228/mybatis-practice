
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS member;
CREATE TABLE member(
                      id BIGINT auto_increment,
                      name varchar (30) not null,
                      age varchar (30) not null,
                      email varchar (30) not null,
                      primary key(id)
);

CREATE TABLE board(
                      id BIGINT auto_increment,
                      title varchar (30) not null,
                      content varchar (30) not null,
                      name varchar (30) not null,
                      memberId BIGINT not null,
                      primary key(id)
);

ALTER TABLE `board` ADD constraint `FK_MEMBER_TO_BOARD_1` foreign key (`memberId`)
    references `member` (`id`) ON DELETE CASCADE;


INSERT INTO member(name, age, email) VALUES('name1', 12, 'email1');
INSERT INTO member(name, age, email) VALUES('name2', 23, 'email2');
INSERT INTO board(title, content, name, memberId) VALUES('title2', 'content2', 'name2', 1);
INSERT INTO board(title, content, name, memberId) VALUES('title3', 'content3', 'name3', 1);
INSERT INTO board(title, content, name, memberId) VALUES('title4', 'content4', 'name4', 1);
INSERT INTO board(title, content, name, memberId) VALUES('title5', 'content5', 'name5', 1);
INSERT INTO board(title, content, name, memberId) VALUES('title6', 'content6', 'name6', 1);
