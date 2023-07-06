import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter size of 1st array");
        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        System.out.println("Enter first array");
        for(int i=0; i<n1; i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of 2nd array");
        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        System.out.println("Enter second array");
        for(int i=0; i<n2; i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }

        int[] arr3 = new int[n1+n2];

        for(int i=0; i<n1; i++){
            arr3[i] = arr1[i];
        }

        for(int i=0; i<n2; i++){
            arr3[n1+i] = arr2[i];
        }

        System.out.println("Merge Array: ");
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
