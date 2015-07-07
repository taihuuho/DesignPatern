package edu.mum.lsvs;

public class ConcreteFlyWeight implements IFlyWeight{
    
    Image image;
    String name;
    String hospital;
    String id;
    
    public ConcreteFlyWeight(Image img) {
        image = img;
    }

    @Override
    public void printCustomerInfo(int id, String name, String hospital,
            Image img) {
        System.out.println("ID:"+id+" Name:"+ name+" Hospital:"+ hospital+"Location:"+img.getLocation());
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
        
}
