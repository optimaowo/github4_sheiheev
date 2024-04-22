package com.example.github4_sheiheev;

public class Contributor {
    public String login;
    public int contributions;

    @Override
    public String toString()
    {
        return login + " " + contributions + "/n";
    };

}
