package com.texas.student.management.model.library;

import javax.persistence.*;
import java.io.Serializable;

/*
*
*
*
* */
@Entity
@Table(name="library_user_book")
public class AssignedBook {

    @EmbeddedId
    private AssignedBookKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "library_user_id")
    private LibraryUser libraryUser;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;
    private long submissionDate;
    private long submittedDate;
    private long fine;


    public enum Package{
        WEEKLY,
        MONTHLY,
        YEARLY
    }
    public LibraryUser getLibraryUser() {
        return libraryUser;
    }

    public void setLibraryUser(LibraryUser libraryUser) {
        this.libraryUser = libraryUser;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(long submissionDate) {
        this.submissionDate = submissionDate;
    }

    public long getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(long submittedDate) {
        this.submittedDate = submittedDate;
    }

    public long getFine() {
        return fine;
    }

    public void setFine(long fine) {
        this.fine = fine;
    }

    public AssignedBookKey getId() {
        return id;
    }

    public void setId(AssignedBookKey id) {
        this.id = id;
    }
}

/*@Embeddable
class AssignedBookKey implements Serializable {

    @Column(name = "library_u_id")
    private long libraryUserId;

    @Column(name = "b_id")
    private long bookId;

    public long getLibraryUserId() {
        return libraryUserId;
    }

    public void setLibraryUserId(long libraryUserId) {
        this.libraryUserId = libraryUserId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
    
}*/
