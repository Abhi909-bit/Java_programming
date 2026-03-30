// program to find the second largest element in an array
// arr = {1,2,3,4,5}


public class secondLargestElement {
    public static void main(String args[]){
        int[] arr ={3,2,5,7,1,9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int var:arr){
            if(var>first){
                second=first;
                first = var;
            } else if( var> second && var!=first){
                second =var;
            }
        }

        System.out.println("Second largest element is: "+second);

    }
}
