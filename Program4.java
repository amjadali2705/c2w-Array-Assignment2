import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int sElem=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            if(arr[i]==sElem){
                System.out.println("Element found at "+i);
                break;
            } 
        }
       
    }
}