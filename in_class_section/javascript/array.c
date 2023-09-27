#include <stdio.h>

void printElem(int index) {
  int array[] = {7, 8, 2, 4};
  int elem = array[index];
  printf("%i\n", elem);
}

int main() {
  printElem(3);
  printElem(5);
  printElem(6);
  printElem(50000);
  printElem(1);
  return 0;
}
