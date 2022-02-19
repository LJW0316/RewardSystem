import java.util.Scanner;

public class exp3_3 {
    public static void sort(double arr[],int low,int high){
        if(low<high){
            int index=index(arr,low,high);
            sort(arr,low,index-1);
            sort(arr,index+1,high);
        }
    }
    public static int index(double arr[],int low,int high){
        double temp=arr[low];
        while(low<high) {
            while (arr[high] >= temp && low < high) {
                high--;
            }
            arr[low] = arr[high];
            while (arr[low] <= temp && low < high) {
                low++;
            }
            arr[high] = arr[low];

        }
        arr[low]=temp;
        return low;
    }

    public static int find(double arr[],double value){
        int low=0;
        int high=arr.length-1;
        int middle;
        while(low<=high){
            middle = (low+high)/2;
            if(arr[middle] > value){
                high=middle-1;
            }
            else if(arr[middle] < value){
                low=middle+1;
            }
            else{
                return middle;
            }
        }
        System.out.println("没有找到");
        return -1;
    }

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入数组元素个数");
        int num=reader.nextInt();
        double arr[]=new double[num];
        int i=0;
        while(i<num){
            arr[i]=reader.nextDouble();
            i++;
        }
        sort(arr,0,num-1);
        System.out.println("排序后的数组为");
        for(int j=0;j<num;j++){
            System.out.println(arr[j]);
        }
        System.out.println("请输入需要查找的元素值");
        double value=reader.nextDouble();
        int index=find(arr,value);
        if(index!=-1){
            System.out.println(value+"的索引号为："+index);
        }
    }

}
