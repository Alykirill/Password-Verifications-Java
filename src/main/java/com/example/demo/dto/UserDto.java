package com.example.demo.dto;

import java.util.regex.Pattern;

public class UserDto  {
    private long id;
    private String user;
    private String password;

    public UserDto() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean hasRegularLetter() {
        String pwd = this.getPassword();
        String[] chars = pwd.split("(?!^)");
        for (String c : chars) {
            if (c.toLowerCase().equals(c) && !isNumeric(c) && !isSpecialCharacter(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSpecialCharacter(String c) {
        Pattern pattern = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
        return pattern.matcher(c).matches();
    }

    public boolean isNumeric(String c) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(c).matches();
    }

    public boolean hasUppercaseLetter() {
        String pwd = this.getPassword();
        String[] chars = pwd.split("(?!^)");
        for (String c : chars) {
            if (c.toUpperCase().equals(c) && !isNumeric(c) && !isSpecialCharacter(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNumber() {
        String pwd = this.getPassword();
        String[] chars = pwd.split("(?!^)");
        for (String c : chars) {
            if (isNumeric(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean correctLength() {
        return this.password.length() >= 6;
    }

    public boolean isError() {
        return !(hasNumber() && correctLength() && hasUppercaseLetter() && hasRegularLetter());
    }
}
