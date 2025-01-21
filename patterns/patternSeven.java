public class patternSeven {
    public static void main(String args[]){
        for(int i = 0 ; i<8 ; i++){
            for(int k = 8 ; k>i ; k--){
                    System.out.print(" ");
            }
            for(int j =0 ; j<(2*i -1);j++){ 
                    System.out.print("*" + "");              
            }
            System.out.println();
        }
    }
}
