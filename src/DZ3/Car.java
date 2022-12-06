package DZ3;


public class Car {
    private String StartElectricity(){
        return "Start Electricity";
    }
    private String StartCommand(){
        return "Start Command";
    }
    private String StartFuelSystem(){
        return "Start Fuel System";
    }
    public void Start(){
        System.out.println(this.StartCommand());
        System.out.println(this.StartElectricity());
        System.out.println(this.StartFuelSystem());

    }
    public static void main(String[] args){
        Car Car = new Car();
        Car.Start();
    }
}
