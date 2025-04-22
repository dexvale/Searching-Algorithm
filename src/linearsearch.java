public class linearsearch {

    public static int LinearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                
                System.out.println("Element is found at index " + i + ".");
                return i;
                
            }
           
        }
       
        System.out.println("Element is not found.");
        return -1;

    }

}
