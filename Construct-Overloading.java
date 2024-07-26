class Container{
    int weight;
    String color;
    double price;
    Container(){
        System.out.println("I am a Default Constructor");
    }
    Container(
        int weight,
        String color,
        double price
    ){
        this.weight=weight;
        this.color=color;
        this.price=price;
        System.out.println("I am a Parameterized Constructor");

    }
    void print(){
        System.out.println(weight+" "+ color +' '+ price);
    }
}
class Demo{
    public static void main(String [] args){
        Container c1 = new Container();
        Container c2 = new Container(10,"red",567.45);
        c1.print();
        c2.print();
    }
}
