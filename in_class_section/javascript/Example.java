public class Example {
    public static void abstracted(int[] array, Predicate p) {
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (p.matches(element)) {
                System.out.println(element);
            }
        }
    }

    public static void printAllElementsLessThanFive(int[] array) {
        return abstracted(array, new LessThanFive());
    }

    public static void printAllElementsGreaterThan(int[] array, int value) {
        // return abstracted(array, new GreaterThan(value));
        // return abstracted(array, (int e) -> e > value);
        return abstracted(array,
                          new Predicate {
                              public boolean matches(int element) {
                                  return e > value;
                              }
                          });
    }
}
