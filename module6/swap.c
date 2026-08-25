#include <stdio.h>
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void broken_swap(int a, int b) {
    // function receive value of a and b and not address so swap wont happen on original values
    int temp = a;
    a = b;
    b = temp;
}

int main(){
    int a =15, b = 10;
    printf("Before swap a = %d. b = %d \n", a, b);
    swap(&a, &b);
    printf("After swap a = %d. b = %d \n\n", a, b);

    printf("Before broken swap a = %d. b = %d", a, b);
    broken_swap(a, b);
    printf("\nAfter broken swap a = %d. b = %d", a, b);

}