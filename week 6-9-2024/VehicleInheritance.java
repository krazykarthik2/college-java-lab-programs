// Base class
class Automobile {
    public int year;
    public String colour;

    public Automobile(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public showSpecs(){
        System.out.println("Year:"+year+",Color:"+colour);
    }
    
}

// Child class Car
class Car extends Automobile {
    public String make;
    public String model;
    public double mileage;
    public double price;

    public Car(int year, String colour, String make, String model, double mileage, double price) {
        super(year, colour);
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }
    public showSpecs(){
        System.out.println("Type: Car, Year:"+year+" , Color:"+colour+" ,Make:"+make+" ,Model:"+model+" , Mileage:"+mileage+" ,Price:"+price);
    }

}

// Child class Truck
class Truck extends Automobile {
    public String make;
    public String model;
    public double mileage;
    public double price;

    public Truck(int year, String colour, String make, String model, double mileage, double price) {
        super(year, colour);
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }
    public showSpecs(){
        System.out.println("Type: Truck, Year:"+year+" , Color:"+colour+" ,Make:"+make+" ,Model:"+model+" , Mileage:"+mileage+" ,Price:"+price);
    }

}

// Child class Van
class Van extends Automobile {
    public String make;
    public String model;
    public double mileage;
    public double price;

    public Van(int year, String colour, String make, String model, double mileage, double price) {
        super(year, colour);
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }
    public showSpecs(){
        System.out.println("Type: Van, Year:"+year+" , Color:"+colour+" ,Make:"+make+" ,Model:"+model+" , Mileage:"+mileage+" ,Price:"+price);
    }

}

class Main{
    public static void  main(String [] args){
        Automobile vehicle = new Automobile(1956,"red");
            Car bmw = new Car(2020, "blue", "BMW", "X5", 15.5, 65000);
        Truck volvo = new Truck(2018, "black", "Volvo", "FH", 8.0, 80000);
        Van omni = new Van(2021, "white", "Toyota", "Sienna", 12.0, 35000);
vehicle.showSpecs();
bmw.showSpecs();
volvo.showSpecs();
omni.showSpecs();
    }
}