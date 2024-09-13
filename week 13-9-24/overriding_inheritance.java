import java.util.*;
class Book{
    String name ="";
    String author = "";
   
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void display(){
        System.out.println("Name:"+name+"\nAuthor:"+author);
    }
}
class Oxford  extends Book{
    int price;
    public void setPrice(int price){
        this.price = price;
    }
    public void display(){
        super.display();
        System.out.println("Oxford-Price:"+price);
    }
}
class McGrawHill  extends Book{
    int price;
    public void setPrice(int price){
        this.price = price;
    }
    public void display(){
        super.display();
        System.out.println("McGraw-Hill-Price:"+price);
    }
}
class Main{
    public  static void main(String [] args){
        Oxford ox = new Oxford();
        McGrawHill mc = new McGrawHill();
        System.out.println("Enter the details of the Book\n(Name, Author, McGraw-Hill-Price, Oxford-Price)");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        String author = sc.nextLine();
        int oxprice = sc.nextInt();
        int mcprice = sc.nextInt();
        ox.setName(name);
        ox.setAuthor(author);
        ox.setPrice(oxprice);
        mc.setName(name);
        mc.setAuthor(author);
        mc.setPrice(mcprice);
        ox.display();
        mc.display();
    }
}
