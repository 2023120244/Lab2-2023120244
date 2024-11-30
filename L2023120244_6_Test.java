/**
 * 测试类 L2023120244_6_Test 用于验证 Solution6 类中的 peopleIndexes 方法。
 *
 * === 测试用例设计总体原则 ===
 * - 等价类划分：根据输入参数的特性将可能的输入值划分为几个逻辑等价类，然后为每一类选择一个或多个具有代表性的测试用例。
 * - 边界值分析：针对输入范围的边界值进行测试，例如数组长度的最大最小值、列表为空等。
 * - 错误猜测法：基于经验和直觉预测程序中可能出现的问题，构造针对性的测试用例。
 * - 覆盖率：确保测试覆盖所有功能分支，包括正常路径和异常处理路径。
 *
 *  === 测试方法 testPeopleIndexesWithSubsets ===
 *  测试目的：验证当存在收藏清单是其他清单子集的情况时，能够正确找出不是任何其他人收藏清单子集的收藏清单。
 *  用到的测试用例：
 *  - 示例1：包含多种不同长度的公司清单，其中一些是另一些的子集。
 *  - 示例2：包含部分相同公司的两个清单，其中一个明显是另一个的子集。
 *  测试用例设计说明：
 *  - 每个测试用例均涵盖了不同的等价类，如不同的清单长度、清单间的关系（子集关系）等。
 *  - 边界情况也被考虑在内，比如最短的清单只有一个元素。
 *
 *  === 测试方法 testPeopleIndexesWithoutSubsets ===
 *  测试目的：检查当所有收藏清单均不为其他清单子集时，能否返回全部索引。
 *  用到的测试用例：
 *  - 示例3：每个用户的收藏清单都是唯一的，没有一个清单是另一个的子集。
 *  测试用例设计说明：
 *  - 此测试用例旨在检验算法是否能正确处理完全独立的收藏清单。
 *  - 它同样属于等价类划分的一部分，即所有清单互不为子集这一类别。
 */

import java.util.*;

public class L2023120244_6_Test {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();

        // 测试用例1  包含多种不同长度的公司清单，其中一些是另一些的子集。
        List<List<String>> favoriteCompanies1 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("google", "microsoft"),
            Arrays.asList("google", "facebook"),
            Arrays.asList("google"),
            Arrays.asList("amazon")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies1)); // 预期输出: [0, 1, 4]

        // 测试用例2  包含部分相同公司的两个清单，其中一个明显是另一个的子集。
        List<List<String>> favoriteCompanies2 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("leetcode", "amazon"),
            Arrays.asList("facebook", "google")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies2)); // 预期输出: [0, 1]

        // 测试用例3  每个用户的收藏清单都是唯一的，没有一个清单是另一个的子集。
        List<List<String>> favoriteCompanies3 = Arrays.asList(
            Arrays.asList("leetcode"),
            Arrays.asList("google"),
            Arrays.asList("facebook"),
            Arrays.asList("amazon")
        );
        System.out.println(solution.peopleIndexes(favoriteCompanies3)); // 预期输出: [0, 1, 2, 3]
    }
}