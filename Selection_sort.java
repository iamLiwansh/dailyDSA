class selection_sort{
    public static void main(String args[]){
        int arr[] = {2,5,8,1,9,6};
        int len = arr.length;
        // System.out.println(len);
        for(int i =0;i<len-1;i++){
            for(int j = i+1 ;j<len;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0 ; i<=len-1 ; i++){
        System.out.println(arr[i]);
        }
    }
}