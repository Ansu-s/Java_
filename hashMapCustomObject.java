package com.java.LinkedList;

public class hashMapCustomObject {

    private String firstname ;
    private String lastname ;

    @Override
    public String toString() {
        return "hashMapCustomObject{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public hashMapCustomObject(String firstname, String lastname) {


        this.firstname = firstname;
        this.lastname = lastname;

    }
}
