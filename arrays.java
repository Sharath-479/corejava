

public class arrays
{
    public static void main(String a[])
    {
    //     int nums[]={1,2,3,4};
    //     nums[1]=10;

    // //dynamic value allocation
    //     int num[]=new int[4];

    //     num[0]=8;
    //     num[1]=5;
    //     num[2]=4;
    //     num[3]=12;

    // //printing values of arrays

    //     for(int i=0;i<4;i++){
    //         System.out.println(num[i]);
    //     }

    
    //     System.out.println(nums[1]);

    //2d array

        int arr[][]=new int[3][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

    }
}