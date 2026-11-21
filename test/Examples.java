import java.util.Arrays;

/** Runs each solution against the examples from the Programmers problem statements. */
public class Examples {
    private static int failures = 0;

    private static void check(String name, Object actual, Object expected) {
        boolean ok = (actual instanceof int[] a && expected instanceof int[] e)
                ? Arrays.equals(a, e)
                : actual.equals(expected);
        String shown = actual instanceof int[] a ? Arrays.toString(a) : String.valueOf(actual);
        System.out.printf("%s %-16s -> %s%n", ok ? "PASS" : "FAIL", name, shown);
        if (!ok) failures++;
    }

    public static void main(String[] args) {
        check("K-th number",
                new Array.Array_1.Solution().solution(new int[] {1, 5, 2, 6, 3, 7, 4},
                        new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}),
                new int[] {5, 6, 3});

        var hash1 = new Hash.Hash_1.Solution();
        check("Runner 1", hash1.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}), "leo");
        check("Runner 2", hash1.solution(new String[] {"mislav", "stanko", "mislav", "ana"},
                new String[] {"stanko", "ana", "mislav"}), "mislav");

        var hash2 = new Hash.Hash_2.Solution();
        check("Phone book 1", hash2.solution(new String[] {"119", "97674223", "1195524421"}), false);
        check("Phone book 2", hash2.solution(new String[] {"123", "456", "789"}), true);
        check("Phone book 3", hash2.solution(new String[] {"12", "123", "1235", "567", "88"}), false);

        var hash3 = new Hash.Hash_3.Solution();
        check("Camouflage 1", hash3.solution(new String[][] {
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}), 5);
        check("Camouflage 2", hash3.solution(new String[][] {
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}), 3);

        System.out.println(failures == 0 ? "\nAll examples passed." : "\n" + failures + " example(s) failed.");
        if (failures > 0) System.exit(1);
    }
}
