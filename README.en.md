# mixi Kotlin Problems for Kotlin Fest 2019

Let's solve 4 problems below using main.kt

on estimation.
同点の場合、ランキング表示では全体の処理時間が短い人ほど上位になります。
評価時に全回答の処理時間の合計が4分を越えた場合は失格とします。
テストケースは企画終了後に公開とします。

# Answer form

https://forms.gle/3pTnurkXmpvdr6kp6

## Q1

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

```
Input: (2 -> 4 -> 3) , (5 -> 6 -> 4)
Output: (7 -> 0 -> 8)
Explanation: 342 + 465 = 807.
```

Source
https://leetcode.com/problems/add-two-numbers/

## Q2

Alice and Bob are decorating a Christmas Tree.

Alice wants only 3 types of ornaments to be used on the Christmas Tree: yellow, blue and red. They have y yellow ornaments, b blue ornaments and r red ornaments.

In Bob's opinion, a Christmas Tree will be beautiful if:

the number of blue ornaments used is greater by exactly 1 than the number of yellow ornaments, and
the number of red ornaments used is greater by exactly 1 than the number of blue ornaments.
That is, if they have 8 yellow ornaments, 13 blue ornaments and 9 red ornaments, we can choose 4 yellow, 5 blue and 6 red ornaments (5=4+1 and 6=5+1).

Alice wants to choose as many ornaments as possible, but she also wants the Christmas Tree to be beautiful according to Bob's opinion.

In the example two paragraphs above, we would choose 7 yellow, 8 blue and 9 red ornaments. If we do it, we will use 7+8+9=24 ornaments. That is the maximum number.

Since Alice and Bob are busy with preparing food to the New Year's Eve, they are asking you to find out the maximum number of ornaments that can be used in their beautiful Christmas Tree!

It is guaranteed that it is possible to choose at least 6 (1+2+3=6) ornaments.

Input
The function take three integers y, b, r (1≤y≤100, 2≤b≤100, 3≤r≤100) — the number of yellow, blue and red ornaments.

It is guaranteed that it is possible to choose at least 6 (1+2+3=6) ornaments.

Output  
Print one number — the maximum number of ornaments that can be used.

```
input:
y:8, b:13, r:9

output:
24
```

Source:  
https://codeforces.com/contest/1171/problem/B

## Q3

Given an positive even integer `n`. Calculate sum of even positive integers not greater than `n`.

```
Input: 10
Output: 30
Explanation: 2+4+6+8+10
```


## Q4

Given a list of 20,000,000 numbers, and each between 0 and 100,000,000. 
Please count (in a reasonable time) numbers that are not on the list.
```
Input: Sequence<Int>
Output: count of missin numbers
```
