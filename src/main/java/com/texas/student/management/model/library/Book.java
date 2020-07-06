package com.texas.student.management.model.library;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private long id;
    private String ISBN;
    private String name;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private Librarian createdBy;


    @ManyToOne
    @JoinColumn(name = "updated_by")
    private Librarian updatedBy;


    @OneToMany(mappedBy = "book")
    private Set<AssignedBook> assignedBooks;


    private long createdDate;
    private long updatedDate;


    private BookType booktype;
    enum BookType{
        ENGLISH,
        NEPALI,
        SCIENCE,
        MATHEMATICS,
        MANAGEMENT,
        TECHNOLOGY
    }

    private int quantity;
    private String author;
    private String publication;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookType getBooktype() {
        return booktype;
    }

    public void setBooktype(BookType booktype) {
        this.booktype = booktype;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Librarian getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Librarian createdBy) {
        this.createdBy = createdBy;
    }

    public Librarian getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Librarian updatedBy) {
        this.updatedBy = updatedBy;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(long updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Set<AssignedBook> getAssignedBooks() {
        return assignedBooks;
    }

    public void setAssignedBooks(Set<AssignedBook> assignedBooks) {
        this.assignedBooks = assignedBooks;
    }
}
