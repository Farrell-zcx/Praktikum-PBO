package guided;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   MODUL 09: STATIC CLASS & COLLECTION FRAMEWORK   ");
        System.out.println("==================================================\n");

        System.out.println(">>> 1. STATIC VARIABLE (guided.static_variable) <<<");
        guided.static_variable.Driver.main(args);

        System.out.println("\n>>> 2. STATIC METHOD (guided.static_method) <<<");
        guided.static_method.Driver.main(args);

        System.out.println("\n>>> 3. ITERATION (guided.iteration) <<<");
        guided.iteration.MainIteration.main(args);

        System.out.println("\n>>> 4. SORTING (guided.sorting) <<<");
        guided.sorting.MainSort.main(args);

        System.out.println("\n>>> 5. FILTERING (guided.filtering) <<<");
        guided.filtering.MainFilter.main(args);
    }
}

