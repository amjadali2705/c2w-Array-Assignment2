import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        System.out.println("Enter first array");
        for(int i=0; i<n; i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        int[] arr2 = new int[n];
        System.out.println("Enter second array");
        for(int i=0; i<n; i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Common elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
            } 
        }
            
    }
    }
}
