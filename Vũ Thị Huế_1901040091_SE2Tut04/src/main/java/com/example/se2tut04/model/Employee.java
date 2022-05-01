package com.example.se2tut04.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Length(min = 3, max = 30)
    private String name;

    @Min(value = 20, message = "Employee can not younger than 20")
    @Max(value = 60, message = "Employee can not older than 65")
    private int age;

    @NotEmpty(message = "can not have the empty image")
    private String image;

    @Length(min = 5, max = 100)
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public String getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
