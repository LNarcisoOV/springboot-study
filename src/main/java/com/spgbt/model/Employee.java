package com.spgbt.model;

public class Employee {

    private Long id;
    private String name;
    private Integer age;
    private String sector;

    public Employee(Long id, String name, Integer age, String sector) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sector = sector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
