package com.texas.student.management.model.library;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AssignedBookKey implements Serializable {

    @Column(name = "library_u_id")
    private Long libraryUserId;

    @Column(name = "b_id")
    private Long bookId;

    public AssignedBookKey(){
    }

    public AssignedBookKey(Long libraryUserId, Long bookId) {
        this.libraryUserId = libraryUserId;
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignedBookKey that = (AssignedBookKey) o;
        return libraryUserId == that.libraryUserId &&
                bookId == that.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryUserId, bookId);
    }

    public Long getLibraryUserId() {
        return libraryUserId;
    }

    public void setLibraryUserId(Long libraryUserId) {
        this.libraryUserId = libraryUserId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }


}
