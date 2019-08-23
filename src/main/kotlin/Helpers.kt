import kotlin.random.Random

// helpers for estimation
fun testListNode(expect: ListNode, block: () -> ListNode) {
    val start = System.currentTimeMillis()
    val output = block()
    val end = System.currentTimeMillis()
    val time = (end - start).toString()
    val result = if (expect == output) {
        "good"
    } else {
        "bad"
    }
    println("time: $time ms\tresult: $result")
}

fun testInt(expect: Int, block: () -> Int) {
    val start = System.currentTimeMillis()
    val output = block()
    val end = System.currentTimeMillis()
    val time = (end - start).toString()
    val result = if (expect == output) {
        "good"
    } else {
        "bad"
    }
    println("time: $time ms\tresult: $result")
}

/**
 * List for Q1
 * Example:
 * var li = ListNode(5)
 * var v = li.value
 */
data class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        return compare(this, other as ListNode)
    }

    private fun compare(list1: ListNode?, list2: ListNode?) :Boolean{
        if (list1 == null && list2 == null) {
            return true
        }
        if (list1?.value == list2?.value) {
            return compare(list1?.next, list2?.next)
        }
        return false
    }
}

// helpers for Q4
const val Q4_MAX = 100_000_000
fun randomSet(): Set<Int> {
    val set = mutableSetOf<Int>()
    repeat(Random.nextInt(100)) {
        set.add(Random.nextInt(Q4_MAX) + 1)
    }
    return set
}

fun generateSequence(n: Int, exclude: Set<Int>): Sequence<Int> {
    return sequence {
        repeat(Q4_MAX) {
            val num = it + 1
            if (!exclude.contains(num)) {
                yield(num)
            }
        }
        if (n > Q4_MAX) {
            repeat(n - Q4_MAX) {
                var i: Int
                do {
                    i = Random.nextInt(Q4_MAX) + 1
                } while (exclude.contains(i))
                yield(i)
            }
        }
    }
}