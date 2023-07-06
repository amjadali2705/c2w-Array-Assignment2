import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter size of array");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("output: ");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            while(temp!=0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            if(sum%2==0){
                System.out.print(arr[i]+" ");
            }
            sum=0;
        }
    }
}
