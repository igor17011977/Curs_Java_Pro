package dz17.first;

public enum ProductType {
    BOOK("Book"),
    CAR("Car"),
    TABLE("Table");
    ProductType(String type){
        this.type=type;
    }
    private String type;
    @Override
    public String toString(){
        return type;
    }
}
