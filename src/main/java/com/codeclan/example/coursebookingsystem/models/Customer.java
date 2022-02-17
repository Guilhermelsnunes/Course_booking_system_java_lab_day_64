package com.codeclan.example.coursebookingsystem.models;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "town")
    private String town;

    @Column(name = "age")
    private int age;

    @JsonBackReference
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Customer(String town, int age) {
        this.town = town;
        this.age = age;
        this.bookings= new ArrayList<Booking>();
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
