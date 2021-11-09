package Array;

public class LowerAndUpperBoundElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println("Lower Bound " + lowerbound(arr, 2));
        System.out.println("Upper Bound " + upperbound(arr, 2));
        System.out.println("Lower Bound " + lowerbound(arr, 3));
        System.out.println("Upper Bound " + upperbound(arr, 3));
    }

    public static int lowerbound(int[] arr, int data) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                ans = mid;
                high = mid - 1;
            } else if(data<arr[mid]) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
        public static int upperbound( int[] arr, int data){
            int low = 0;
            int high = arr.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == data) {
                    ans = mid;
                    low = mid + 1;
                } else if(data<arr[mid]) {
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }
    }

