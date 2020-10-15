package pid.exercise.sort;

public class MergeSort {

    public static int[] mergeSort(int[] array) {

            //1. Find the middle of the array
            int mid = (array.length)/2;
            int[] left = new int[mid];
            int [] right = new int[array.length-mid];
            
            if(array.length<=1){
                return array;
            }
            
            for(int i=0; i<left.length; i++){
                left[i]=array[i];
            }
            
            for(int i=0; i<right.length; i++){
                right[i]=array[i+mid];
            }
            
            left = mergeSort(left);
            right = mergeSort(right);
            
            int [] result = new int[left.length+right.length];
            result = merge(left, right);
            
        return result;
        
      }
        
        public static int[] merge(int [] left, int [] right){
            int leftPointer=0;
            int rightPointer=0;
            int resultPointer=0;
            int [] result = new int[left.length+right.length];
            
            while(leftPointer<left.length || rightPointer<right.length){
                if(leftPointer<left.length && rightPointer<right.length){
                    if(left[leftPointer]<right[rightPointer]){
                        result[resultPointer++]=left[leftPointer++];
                    } else {
                        result[resultPointer++]=right[rightPointer++];
                    }
                } else if(leftPointer<left.length){
                    result[resultPointer++]=left[leftPointer++];
                } else if(rightPointer<right.length){
                    result[resultPointer++]=right[rightPointer++];
                }
            }
            
            return result;
        }
}
