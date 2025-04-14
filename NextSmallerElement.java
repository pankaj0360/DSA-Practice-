public class NextSmallerElement {
    public static void main(String[] args) {
        int arr [] = {17,35,100,70,32};
        int result[] = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
           for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                   result[i]=-1;
               }else {
                   result[i]=arr[j];
                   break;
               }
           }
        }
        result[result.length-1]=-1;
        System.out.print("Next Smaller Elements: ");
        for(int i=0;i<result.length;i++){

            System.out.print(result[i]+" " );
        }

    }
}
//public class NextSmallerElement {
//    public static void main(String[] args) {
//        int arr[] = {4, 8, 5, 2, 25};
//        int result[] = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            int nextSmaller = -1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    nextSmaller = arr[j];
//                    break;
//                }
//            }
//            result[i] = nextSmaller;
//        }
//
//        System.out.print("Next Smaller Elements: ");
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }
//}
