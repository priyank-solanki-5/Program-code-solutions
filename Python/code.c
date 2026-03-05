// #include<stdio.h>
// void main(){
//     int n;
//     printf("enter a length of array\n");
//     scanf("%d",&n);
//     int arr[n];
//     int i,j;
//     for(i=0;i<n;i++){
//         scanf("%d",&arr[i]);
//     }
//     printf("\nthis is unshorted array\n");
//     for(int i=0;i<n;i++){
//         printf("%d\t",arr[i]);
//     }
//     for(i=0;i<n-1;i++){
//         for(j=0;j<n-i-1;j++){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//     }
//     printf("\n this is sorted array\n");
//     for(i=0;i<n;i++){
//         printf("%d\t",arr[i]);
//     }
// }

// #include<stdio.h>
// void main(){
//     int n;
//     printf("enter a length of array\n");
//     scanf("%d",&n);
//     int arr[n];
//     int i,j;
//     for(i=0;i<n;i++){
//         scanf("%d",&arr[i]);
//     }
//     printf("\nthis is array\n");
//     for(int i=0;i<n;i++){
//         printf("%d\t",arr[i]);
//     }
//     int max=arr[0];
//     for(i=0;i<n;i++){
//         if(arr[i]>max){
//            max=arr[i];                
//         }
//     }
//     printf("maximum value is %d",max);
// }

// missing element in array

// #include<stdio.h>
// int findElement(int arr[], int n){
//     int N = n + 1;
//     int sumOfNumber = (N * (N + 1))/2;
//     int sum = 0;
//     for(int i = 0; i < n; i++){
//         sum+=arr[i];
//     }
//     int result = sumOfNumber - sum;
//     return result;
// }
// void main(){
//     printf("enter a length of array\n");
//     int n;
//     scanf("%d",&n);
//     int arr[n];
//     for(int i=0; i<n; i++){
//         scanf("%d",&arr[i]);
//     }
//     for(int i=0; i<n; i++){
//         printf("%d",arr[i]);
//         printf("\t");
//     }
//     int result = findElement(arr, n);
//     printf("result is:%d",result);
// }