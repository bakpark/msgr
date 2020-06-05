CREATE TABLE `user` (
  `uid` long PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `email` varchar(255)
);

CREATE TABLE `room` (
  `uid` long PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255)
);

CREATE TABLE `chat` (
  `uid` long PRIMARY KEY AUTO_INCREMENT,
  `room_uid` long,
  `sender_id` long,
  `msg` varchar(255),
  `time` datetime
);

CREATE TABLE `participant_info` (
  `uid` long PRIMARY KEY AUTO_INCREMENT,
  `user_id` long,
  `room_id` long
);

CREATE TABLE `visit` (
  `uid` long PRIMARY KEY AUTO_INCREMENT,
  `visitor_id` long,
  `room_id` long,
  `time` timestamp
);
