public class patternEight {
    public static void main(String args[]){
      for(int i = 3 ; i>0;i--){
        for(int k = 3 ; k>i ; k--){
            System.out.print(" ");
        }
        for(int j = 0 ; j<(2*i - 1) ; j++){
            System.out.print("*" + " ");
        }
        System.out.println("");
      }
    }
}
