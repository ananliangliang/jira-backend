INSERT INTO jira.user (id, name, username, password, create_time, update_time) VALUES (1, '张三', 'zhangsan', '{noop}123', '2022-05-18 02:01:14', '2022-05-24 11:57:10');
INSERT INTO jira.user (id, name, username, password, create_time, update_time) VALUES (2, '李四', 'lisi', '{noop}123', '2022-05-18 02:01:14', '2022-05-24 11:57:10');
INSERT INTO jira.user (id, name, username, password, create_time, update_time) VALUES (3, '王五', 'wangwu', '{noop}123', '2022-05-18 02:01:14', '2022-05-24 11:57:10');


INSERT INTO jira.project (name, organization, user_id, create_time, update_time)
VALUES ('骑手管理', null, 1, DEFAULT, DEFAULT);

INSERT INTO jira.project (name, organization, user_id, create_time, update_time)
VALUES ('物料管理系统', null, 2, DEFAULT, DEFAULT);

INSERT INTO jira.project (name, organization, user_id, create_time, update_time)
VALUES ('团购APP', null, 3, DEFAULT, DEFAULT);

INSERT INTO jira.project (name, organization, user_id, create_time, update_time)
VALUES ('总部管理系统', null, 1, DEFAULT, DEFAULT);

