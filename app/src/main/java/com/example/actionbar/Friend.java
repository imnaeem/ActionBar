package com.example.actionbar;

public class Friend {
    private int Id;
    private String Name;
    private String City;
    private int dob;
    private int Image;

    public Friend(int id, String name, int dob, String city, int image) {
        Id = id;
        Name = name;
        City = city;
        this.dob = dob;
        Image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }


}
