package com.umair

class EmployeeBean implements  Serializable{
    private String first
    private String last
    private String email

    String getFirst() {
        return first
    }

    void setFirst(String first) {
        this.first = first
    }

    String getLast() {
        return last
    }

    void setLast(String last) {
        this.last = last
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    @Override
    String toString() {
        return "EmployeeBean{" +
                "last='" + last + '\'' +
                ", first =' "+ first +'\'' +
                '}';
    }
}
