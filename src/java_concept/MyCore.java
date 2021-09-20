package java_concept;

public class MyCore {

    public String demo(int price){
        String brand="Samsung "+" : "+"And price of this mobile is : "+price +" rs ";
        return brand;

    }
    public int returnmethod(){
        int age=18;
        return age;
    }
    public static void main(String[] args){
        MyCore obj= new MyCore();
        String var=obj.demo(12000);
        System.out.println("This is the latest version of : "+var);
        int var1=obj.returnmethod();
        System.out.println("His real age is : "+var1);
    }
}
