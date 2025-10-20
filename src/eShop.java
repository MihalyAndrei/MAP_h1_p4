public class eShop {
    public static int cheapestItem(int[] items){
        int min=Integer.MAX_VALUE;
        for (int item:items){
            if(item<min){
                min=item;
            }
        }
        return min;
    }
}
