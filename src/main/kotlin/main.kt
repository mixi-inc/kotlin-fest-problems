// Submit your answer code using functions below.
// You can use additional function as well.
// Don't forget copy import statements, if you use some libraries.
// submit to:
// https://forms.gle/3pTnurkXmpvdr6kp6
fun answer1(list1: ListNode, list2: ListNode): ListNode {
    return ListNode(0)
}

fun answer2(y: Int, b: Int, r: Int): Int {
    return 0
}

fun answer3(inputs: Int): Long {
    return 0
}

fun answer4(input: Sequence<Int>): Int {
    return 0
}

// ---- submit above ----

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
    testLong(0) {
        return@testLong answer3(10)
    }

    println("Q4")
    val testSequence = generateSequence(200_000_000, randomSet())
    testInt(0) {
        return@testInt answer4(testSequence)
    }
}
