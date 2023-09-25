#include <stdio.h>

void something(int index) {
  int array[] = {5, 2, 4};
  // C is weakly typed - types can lie
  int elem = array[index];
  printf("%i\n", elem);
}

int main() {
  something(0);
  something(6);
  something(50000);
  something(1);
  return 0;
}
