public class sumOfArrayNb {
    public static void main(String[] args) {
        int arr [] = {0,2,8,1,8};
        int max=0;
        int Min =10000;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++) {
            if (Min >= arr[i]) {
                Min = arr[i];
            }
        }
        System.out.println("the min nb is : "+ Min);
        System.out.println("the max nb is : "+ max);

    }
}
