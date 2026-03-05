#include<stdio.h>
#include<time.h>

int BinarySearch(int arr[],int size,int target,int *stepcount){
    *stepcount = 0;
    int low = 0;
    int high = size-1;
    int mid;

    while(low<=high){
        (*stepcount)++;
        mid = low + (high - low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target) {
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
}

void main(){
  int arr1[]  = {30,10,14,54,87,98,24,65,47,54,98,21,54,65,41,777,214,654,24,21,45,87,21,454,656,6544,5454,9874,5646,32348,64611,10,14,54,47,54,98,21,54,21,454,87,98,24,65,656,6544,5454,9874,56,46,32348,6461,1};
  int size = sizeof(arr1);
  int stepcount = 0;
  int target = 65;
  
  clock_t start_time = clock();
    int result = BinarySearch(arr1,size,target,&stepcount);
  clock_t end_time = clock();
  double time  = ((double)(end_time-start_time))/CLOCKS_PER_SEC;
  if(result != -1){
  	printf("ans is : %d",result);
  }
  else{
  	printf("error\n");
  }
  printf("binary search time complexcity is O(log n)\n");
  printf("steap count is : %d\n",stepcount);
  printf("time required is : %f\n",time);
}