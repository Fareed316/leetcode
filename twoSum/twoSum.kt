class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val complement = target - num
            indexMap[complement]?.let { return intArrayOf(it, index) }
            indexMap[num] = index
        }
        throw IllegalArgumentException("No two elements sum up to the target value")
    }
}