public class Main {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int s=3;s>i+1;s--) System.out.print(" ");
            for(int j=0;j<=i;j++) System.out.print((char)('C'-j)+" ");
            for(int j=i-1;j>=0;j--) System.out.print((char)('C'-j)+" ");
            System.out.println();
        }
    }
}
