package com.example.se2tut04.object;

public class EmployeeDTO {
    private String email;
    private String password;
    private  String repassword;


    public EmployeeDTO(){

    }
    public String getName() {
        return email;
    }

    public void setName(String name) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + email + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                '}';
    }
}
