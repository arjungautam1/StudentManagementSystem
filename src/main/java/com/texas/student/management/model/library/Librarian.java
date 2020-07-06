package com.texas.student.management.model.library;

import com.texas.student.management.model.user.User;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "librarian")
public class Librarian extends User {

}
