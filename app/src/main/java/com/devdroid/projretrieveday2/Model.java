package com.devdroid.projretrieveday2;

public class Model {
    private  String name; // name of the employee
    private  String id; // id of the employee
    private  String designation; // designation of the employee
    private  String phone; // phone o

    public Model(String name, String id, String designation, String phone) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
