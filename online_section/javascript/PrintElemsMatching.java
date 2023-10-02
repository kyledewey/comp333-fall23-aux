public class PrintElemsMatching {
    public static void printElementsMatching(int[] array, Predicate predicate) {
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (predicate.matches(element)) {
                System.out.println(element);
            }
        }
    }

    public static void printAllElementsLessThanFive(int[] array) {
        // printElementsMatching(array, new LessThanFive());
        // printElementsMatching(array, (int e) -> e < 5);
        printElementsMatching(array,
                              // anonymous class
                              new Predicate {
                                  public boolean matches(int e) {
                                      return e < 5;
                                  }
                              });
    }

    public void printAllElements(int[] array) {
        // printElementsMatching(array, new AlwaysTrue());
        printElementsMatching(array, (int e) -> true);
    }

    public void printAllElementsLessThan(int[] array, int amount) {
        // printElementsMatching(array, new LessThan(amount));
        printElementsMatching(array, (int e) -> e < amount);
    }
}
