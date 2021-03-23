CREATE TABLE fly. Student (
  student_id bigint AUTO_INCREMENT NOT NULL,
  student_name varchar(255) DEFAULT NULL,
  student_dob date DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  mobileNum bigint NOT NULL,
  student_gender varchar(255) DEFAULT NULL,
  department varchar(255) DEFAULT NULL,
  PRIMARY KEY (student_id),
  UNIQUE KEY  (email)
);

CREATE TABLE fly.address (
  address_id bigint NOT NULL,
  city_name varchar(255) DEFAULT NULL,
  country varchar(255) DEFAULT NULL,
  state varchar(255) DEFAULT NULL,
  street varchar(255) DEFAULT NULL,
  student_id bigint DEFAULT NULL,
  PRIMARY KEY (address_id),
  KEY (student_id)
);

CREATE TABLE fly.course (
  course_id bigint NOT NULL,
  course_name varchar(255) DEFAULT NULL,
  isbn bigint NOT NULL,
  student_id bigint NOT NULL,
  PRIMARY KEY (course_id),
  KEY  (student_id),
  CONSTRAINT FOREIGN KEY (student_id) REFERENCES student (student_id)
);


