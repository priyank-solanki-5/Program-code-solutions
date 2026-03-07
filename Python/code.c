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

#include<stdio.h>
#include<limits.h>
int secoundLargest(int arr[],int n){
    int largest = INT_MIN;
    int secoundLargest = INT_MIN;
    for(int a = 0; a<n; a++){
        if(arr[a]>largest){
            largest=arr[a];
        }
        else if(arr[a]>secoundLargest && arr[a] != largest){
            secoundLargest = arr[a];
        }
    }
    return secoundLargest;
}

void main(){
    int n;
    printf("enter a size of array\n");
    scanf("%d",&n);
    int arr[n];
    printf("enter a array elemens\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int result = secoundLargest(arr,n);
    if(result==0){
        printf("not found\n");
    }
    else{
        printf("found %d\n",result);        
    }
}