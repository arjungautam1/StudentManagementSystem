package com.texas.student.management.model.library;

import com.texas.student.management.model.user.User;

import javax.persistence.*;
import java.util.Set;

/*
*
*
*
*
*
* */

@Entity
@Table(name = "library_users")
public class LibraryUser {
    @Id
    @Column(name = "library_user_id")
    private Long userId;

    @OneToMany(mappedBy = "libraryUser")
    private Set<AssignedBook> assignedBooks;


    @OneToOne
    @MapsId
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<AssignedBook> getAssignedBooks() {
        return assignedBooks;
    }

    public void setAssignedBooks(Set<AssignedBook> assignedBooks) {
        this.assignedBooks = assignedBooks;
    }
}
