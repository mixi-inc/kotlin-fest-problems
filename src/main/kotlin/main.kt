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
    val testSequence = generateSequence(200_000_000, randomSet())
    testInt(0) {
        return@testInt answer4(testSequence)
    }
}

// submit code below after editing
fun answer1(list1: ListNode, list2: ListNode): ListNode {
    return ListNode(0)
}

fun answer2(y: Int, b: Int, r: Int): Int {
    return 0
}

fun answer3(inputs: Int): Int {
    return 0
}

fun answer4(input: Sequence<Int>): Int {
    return 0
}
