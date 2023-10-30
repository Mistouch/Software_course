package com.example.project1;

public class Users {

    private  String f_name,s_name,email,password;
    private long mobile;
    private boolean isEnable;

    public Users(String f_name, String s_name, String email, String password, long mobile, boolean isEnable) {
        this.f_name = f_name;
        this.s_name = s_name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.isEnable = isEnable;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
