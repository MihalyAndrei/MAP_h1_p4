import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] keyboards={40, 35, 70, 15, 45};
        int[] usbs={20,15,40,15};
        System.out.println("Electronic shop");

        //1
        System.out.print("The prices of the keyboards are: ");
        for(int keyboard:keyboards){
            System.out.print(keyboard+" ");
        }
        System.out.print("\n"+"The price of the cheapest keyboard is: "+eShop.cheapestItem(keyboards));

        //2
        System.out.print("\nThe prices of the keyboards are: ");
        for(int keyboard:keyboards){
            System.out.print(keyboard+" ");
        }
        System.out.print(" ,the prices of the usbs are: ");
        for(int usb:usbs){
            System.out.print(usb+" ");
        }
        System.out.print("The most expensive item here is "+eShop.expensiveItemMultiple(keyboards,usbs));

        //3
    }
}