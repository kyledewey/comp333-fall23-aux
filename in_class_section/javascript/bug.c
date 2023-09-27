// compiler update - newer version is smarter
int* p = NULL;

...*p... // undefined behavior: p != NULL

/* if (p == NULL) { */
/*   denyAccess(); */
/* } else { */
  allowAccess();
/* } */

String x = 5;

x == y && y == z DOES NOT imply x == z
  
x === y

  
