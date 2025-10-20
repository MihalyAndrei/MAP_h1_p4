import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] keyboards={40, 35, 70, 15, 45};
        int[] usbs={20,15,40,15};
        int buget=30;
        System.out.println("Electronic shop");

        //1
        System.out.print("The prices of the keyboards are: ");
        for(int keyboard:keyboards){
            System.out.print(keyboard+" ");
        }
        System.out.println("\n"+"The price of the cheapest keyboard is: "+eShop.cheapestItem(keyboards));

        //2
        System.out.print("\nThe prices of the keyboards are: ");
        for(int keyboard:keyboards){
            System.out.print(keyboard+" ");
        }
        System.out.print(" ,the prices of the usbs are: ");
        for(int usb:usbs){
            System.out.print(usb+" ");
        }
        System.out.println("\nThe most expensive item here is "+eShop.expensiveItemMultiple(keyboards,usbs));

        //3
        System.out.print("\nThe prices of the USB's are: ");
        for(int keyboard:keyboards){
            System.out.print(keyboard+" ");
        }
        System.out.print(", and his buget is "+buget);
        if(eShop.affordableItem(usbs,buget)!=0){
            System.out.print("\n"+"He can afford: "+eShop.affordableItem(usbs,buget));
        }
        else{
            System.out.print("\nHe can't afford anything");
        }

        //4

    }
}