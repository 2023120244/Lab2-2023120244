import java.util.*;

public class L2023120244_6_Test {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();

        // 测试用例1
        List<List<String>> favoriteCompanies1 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("google", "microsoft"),
            Arrays.asList("google", "facebook"),
            Arrays.asList("google"),
            Arrays.asList("amazon")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies1)); // 预期输出: [0, 1, 4]

        // 测试用例2
        List<List<String>> favoriteCompanies2 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("leetcode", "amazon"),
            Arrays.asList("facebook", "google")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies2)); // 预期输出: [0, 1]

        // 测试用例3
        List<List<String>> favoriteCompanies3 = Arrays.asList(
            Arrays.asList("leetcode"),
            Arrays.asList("google"),
            Arrays.asList("facebook"),
            Arrays.asList("amazon")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies3)); // 预期输出: [0, 1, 2, 3]
    }
}