import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a searching algorithm to perform");
        System.out.println("Linear Search");
        System.out.println("Binary Search");
        System.out.println("Jump Search");
        System.out.println("Exponential Search");

        System.out.println("Enter your choice(1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int []elements = elements(sc);
                 int target = GetTarget(sc);
                linearsearch.LinearSearch(elements, target);
                break;
        
            case 2:
                
        }



        
        
        

        


    }
      public static int [] elements(Scanner sc){
        System.out.println("Enter a elements: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enterr the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

     public static int GetTarget(Scanner sc){
     
        System.out.println("Enter a target number: ");
        return sc.nextInt();

    }
 


}


