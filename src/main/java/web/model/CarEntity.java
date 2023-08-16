package web.model;

public class CarEntity {
    private  String model;

    private int years;

    private  String color;

    public CarEntity(String model, int years, String color){
        this.color= color;
        this.years= years;
        this.model= model;

    }

    public String getModel() {
        return model;
    }
    public int getYears(){
        return years;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        this.model= model;
    }
    public void setYears(int years){
        this.years= years;
    }
    public void setColor(String color){
        this.color= color;
    }
}

