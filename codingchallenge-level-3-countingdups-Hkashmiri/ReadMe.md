# Count Duplicates Coding Challenge

## Overview

In this challenge, you will implement a method to count the number of non-unique character sets (duplicate characters) in a given string. The goal is to determine how many characters appear more than once within the string, considering each character independently.

## Example Scenarios

1.	Input: "abcdefga"
Output: 1
Explanation: Only the character 'a' is duplicated, so the count is 1.
2.	Input: "xyzxyzxyz"
Output: 3
Explanation: The characters 'x', 'y', and 'z' each appear more than once, so the count is 3.
3.	Input: "aabbc"
Output: 2
Explanation: The characters 'a' and 'b' are duplicated, resulting in a count of 2.

## Requirements

**1.	Data Structures:**
You are required to implement your solution using one of the following Java data structures:
   * List 
   * Set 
   * Map

**2.	Explanation:**
Be prepared to explain why you chose the specific data structure. Consider the strengths and weaknesses of each option in terms of functionality and efficiency:
* List: Good for ordered data and allows duplicates, but requires more work to count unique items.
* Set: Naturally handles unique elements, making it a strong choice for counting duplicates without repetition.
* Map: Allows key-value pairs, where each character can be a key and its occurrence count as the value, providing an efficient way to track occurrences.
**3.	Method Definition:**

Implement the following method in the Problem class:

public int countDuplicates(String data)

* Input: A String called data. 
* Output: An int representing the number of non-unique character sets.

Constraints

* The input string may contain both uppercase and lowercase letters.
* You should treat uppercase and lowercase letters as distinct characters.
* Focus on optimizing for efficiency given potential large input sizes.

Approach Tips

* **List**: If you choose a List, consider using helper methods to check for duplicates while iterating through the string. However, be cautious of the complexity as finding duplicates may require nested loops.
* **Set**: A Set provides uniqueness inherently. One approach could be to track characters in two Set collections: one for seen characters and another for duplicates.
* **Map**: Using a Map allows each character to be mapped to a count. You can iterate through the string once, incrementing counts, then iterate over the map to count keys with values greater than one.

### Unit Testing

The provided test cases cover a variety of scenarios, including:

* Strings with a single duplicate.
* Strings with multiple distinct duplicates.
* Strings without any duplicates.
* Strings with different character types (letters, numbers).

Write additional test cases as necessary to ensure robustness and edge-case handling.

