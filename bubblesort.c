#include<stdio.h>

void swap(int *arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
void bubblesort(int arr[], int n)
{
    int i, j;
    for(i=0; i<n-1; i++) 

    for(j=0; j<n-i-1; j++)
    if(arr[j] > arr[j + 1])
    swap(arr, j, j + 1);
}
void printarray(int arr[], int size) 
{
    int i;
    for(i=0; i< size; i++) 
        printf("%d", arr[i]);
        printf("\n");
}
    int main() {
        int arr[] = {5, 1, 4, 2, 8};
        // printf("enter the words:\n");
        // scanf("%d", &arr);
        int N = sizeof(arr) / sizeof(arr[0]);
        bubblesort(arr, N);
        printf("Sorted array: ");
        printarray(arr, N);
        return 0;

    }


