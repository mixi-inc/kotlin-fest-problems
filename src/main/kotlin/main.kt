import java.io.File

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

fun testList(expect: List<Int>, block: () -> List<Int>) {
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

// These are dummy test cases.
// We will use more test cases to estimate your code.
fun main() {
    println("Q1")
    val list1 = ListNode(5)
    list1.next = ListNode(4)
    val list2 = ListNode(3)
    list2.next = ListNode(2)
    testListNode(ListNode(0)) {
        return@testListNode answer1(list1, list2)
    }

    println("Q2")
    testInt(0) {
        return@testInt answer2(1, 2, 3)
    }

    println("Q3")
    testInt(0) {
        return@testInt answer3(10)
    }

    println("Q4")
    testList(listOf(0)) {
        return@testList answer4(File("src/main/resources/numbers.txt"))
    }
}

// submit code below after editing
/**
 * List for Q1
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 */
data class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun answer1(list1: ListNode, list2: ListNode): ListNode {
    return ListNode(0)
}

fun answer2(y: Int, b: Int, r: Int): Int {
    return 0
}

fun answer3(inputs: Int): Int {
    return 0
}

fun answer4(input: File): List<Int> {
    return listOf(0)
}