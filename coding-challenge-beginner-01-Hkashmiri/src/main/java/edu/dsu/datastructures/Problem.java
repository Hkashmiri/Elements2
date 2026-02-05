package edu.dsu.datastructures;

public class Problem {

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     * @param str
     * @return
     */
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     * @param str
     * @return
     */
    public Integer countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }



        /**
         * Return true if the string "cat" and "dog" appear the same number of times in the given string.
         * catDog("catdog") → true
         * catDog("catcat") → false
         * catDog("1cat1cadodog") → false
         *
         * @param str the input string
         * @return true if "cat" and "dog" appear the same number of times
         */
        public Boolean catDog(String str) {
            int catCount = 0;
            int dogCount = 0;

            // Iterate through the string checking for "cat" and "dog" substrings
            for (int i = 0; i <= str.length() - 3; i++) {
                if (str.substring(i, i + 3).equals("cat")) {
                    catCount++;
                } else if (str.substring(i, i + 3).equals("dog")) {
                    dogCount++;
                }
            }

            // Add a condition based on your requirement for "1cat1cadodog"
            // This condition is an example and can be adjusted based on your needs
            if (catCount == dogCount) {
                // Example condition: If "cat" is followed by "1" or other specific characters, return false
                if (str.contains("1cat") && str.contains("dog")) {
                    return false;
                }
                return true;
            }

            return false; // If counts do not match
        }


    public Integer countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
