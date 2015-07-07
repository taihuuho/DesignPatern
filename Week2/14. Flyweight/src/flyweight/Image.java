package edu.mum.lsvs;

public class Image {
    
    String location;
    String picture;
    
    public Image(String loc,String pic) {
        location = loc;
        picture = pic;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    

}
