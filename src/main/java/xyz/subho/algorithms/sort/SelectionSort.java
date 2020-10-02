class SelectionSort{
    static void selectionSort(int arr[], int n)                         
    {  
        int i, j, minimum;  
        for (i = 0; i < n-1; i++)  
        {  
            minimum = i;  
            for (j = i+1; j < n; j++)  
            if (arr[j] < arr[minimum])  
                minimum = j;   
            int temp = arr[minimum];
            arr[minimum]=arr[i];
            arr[i] = temp;
        } 
        for(int eachElement:arr)                                        //printing sorted array
            System.out.print(eachElement+" "); 
    }


    public static void main(String[] a){
        int[] unsortedArray = new int[]{8,2,9,4,5,1};                   //hardcoded array
        selectionSort(unsortedArray,unsortedArray.length);              //sending array with length
    }
}

