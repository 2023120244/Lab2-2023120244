/**
 * @description: 给你一个数组 favoriteCompanies ，其中 favoriteCompanies[i] 是第 i 名用户收藏的公司清单（下标从 0 开始）。
 * <p>
 * 请找出不是其他任何人收藏的公司清单的子集的收藏清单，并返回该清单下标。下标需要按升序排列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
 * 输出：[0,1,4]
 * 解释：
 * favoriteCompanies[2]=["google","facebook"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集。
 * favoriteCompanies[3]=["google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 和 favoriteCompanies[1]=["google","microsoft"] 的子集。
 * 其余的收藏清单均不是其他任何人收藏的公司清单的子集，因此，答案为 [0,1,4] 。
 * 示例 2：
 * <p>
 * 输入：favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
 * 输出：[0,1]
 * 解释：favoriteCompanies[2]=["facebook","google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集，因此，答案为 [0,1] 。
 * 示例 3：
 * <p>
 * 输入：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
 * 输出：[0,1,2,3]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= favoriteCompanies.length <= 100
 * 1 <= favoriteCompanies[i].length <= 500
 * 1 <= favoriteCompanies[i][j].length <= 20
 * favoriteCompanies[i] 中的所有字符串 各不相同 。
 * 用户收藏的公司清单也 各不相同 ，也就是说，即便我们按字母顺序排序每个清单， favoriteCompanies[i] != favoriteCompanies[j] 仍然成立。
 * 所有字符串仅包含小写英文字母。
 */
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