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

class binarySearch{
    public static int binarySearch(int[] arr, int target){
        int low  = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low ) /2;
            if(arr[mid] == target){
                System.out.println("Element is found at index " + mid + ".");
                return mid;
            }else if(arr[mid] < target){
                low  = mid + 1;
            }else{
                low = mid -1;
            }
            
        }
        System.out.println("Element is not found.");
        return -1;
    }
}
