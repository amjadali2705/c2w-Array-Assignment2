import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        int min=arr[0];
        for(int i=0; i<n; i++){
            
            if(arr[i]<min){
                min=arr[i];
            } 
        }
        System.out.println("min element: "+min);
       
    }
}
