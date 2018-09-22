package com.hojong.meokgol.data_model;

public class User
{
    public Integer user_idx;
    public String user_id;
    public String user_name;
    public String user_passwd;

    public User(String user_id, String user_passwd)
    {
        this.user_id = user_id;
        this.user_passwd = user_passwd;
    }

    @Override
    public String toString()
    {
        return user_idx + ":" + user_id + "," + user_name;
    }
}
