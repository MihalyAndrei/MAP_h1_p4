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

    public static int expensiveItemMultiple(int[] items,int[] items2){
        int max=0;
        int max2=0;
        for (int item:items){
            if(item>max){
                max=item;
            }
        }
        for (int item:items2){
            if(item>max2){
                max2=item;
            }
        }
        if (max2<max){
            max2=max;
        }
        return max2;
    }
}
