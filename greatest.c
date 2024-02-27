#include<stdio.h>

int main() {
    int p, q, r;
    printf("enter 3 numbers to find the greatest:");
    scanf("%d%d%d", &p, &q, &r);
    if(p>=q && p>=r) {
        printf("the greatest number p : %d", p);
    } else if(q >= r) {
         printf("the greatest number q : %d", q);
    } else {
         printf("the greatest number r : %d", r);
    }
    return 0;
} 