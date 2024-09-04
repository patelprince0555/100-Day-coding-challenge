import java.util.Arrays;

public class Write_a_code_for_anagrams {
    public static boolean anagrams(String str , String str1){
        str= str.toLowerCase();
        str1=str1.toLowerCase();
        if(str.length()!=str1.length()){
            return false;
        }
        char newstr[]=str.toCharArray();
        char newstr1[]=str1.toCharArray();

        Arrays.sort(newstr);
        Arrays.sort(newstr1);

        return Arrays.equals(newstr, newstr1);

    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        if (anagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}



// In Java, the String class comes with a rich set of methods that allow you to manipulate and query string data. Below is a list of commonly used methods in the String class:

// 1. Character Extraction
// char charAt(int index): Returns the character at the specified index.

// int codePointAt(int index): Returns the Unicode code point of the character at the specified index.

// int codePointBefore(int index): Returns the Unicode code point of the character before the specified index.

// int codePointCount(int beginIndex, int endIndex): Returns the number of Unicode code points in the specified text range.

// 2. String Comparison
// boolean equals(Object anObject): Compares this string to the specified object.

// boolean equalsIgnoreCase(String anotherString): Compares this string to another string, ignoring case considerations.

// int compareTo(String anotherString): Compares two strings lexicographically.

// int compareToIgnoreCase(String str): Compares two strings lexicographically, ignoring case differences.

// boolean regionMatches(int toffset, String other, int ooffset, int len): Tests if two string regions are equal.

// boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len): Tests if two string regions are equal, ignoring case.
// 3. String Search
// boolean contains(CharSequence s): Returns true if this string contains the specified sequence of characters.

// int indexOf(int ch): Returns the index within this string of the first occurrence of the specified character.

// int indexOf(int ch, int fromIndex): Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.

// int indexOf(String str): Returns the index within this string of the first occurrence of the specified substring.

// int indexOf(String str, int fromIndex): Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

// int lastIndexOf(int ch): Returns the index within this string of the last occurrence of the specified character.

// int lastIndexOf(int ch, int fromIndex): Returns the index within this string of the last occurrence of the specified character, starting the search at the specified index.

// int lastIndexOf(String str): Returns the index within this string of the last occurrence of the specified substring.

// int lastIndexOf(String str, int fromIndex): Returns the index within this string of the last occurrence of the specified substring, starting at the specified index.

// 4. Substring
// String substring(int beginIndex): Returns a new string that is a substring of this string, starting from the specified index.

// String substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string, starting from beginIndex and ending at endIndex.

// 5. String Modification
// String concat(String str): Concatenates the specified string to the end of this string.

// String replace(char oldChar, char newChar): Returns a string resulting from replacing all occurrences of oldChar with newChar.

// String replace(CharSequence target, CharSequence replacement): Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.

// String replaceAll(String regex, String replacement): Replaces each substring of this string that matches the given regular expression with the given replacement.

// String replaceFirst(String regex, String replacement): Replaces the first substring of this string that matches the given regular expression with the given replacement.

// String[] split(String regex): Splits this string around matches of the given regular expression.

// String[] split(String regex, int limit): Splits this string around matches of the given regular expression, with a limit on the number of splits.

// String toLowerCase(): Converts all characters in this string to lower case.

// String toUpperCase(): Converts all characters in this string to upper case.

// String trim(): Removes leading and trailing whitespace.

// 6. String Conversion
// String toString(): Returns the string itself.

// char[] toCharArray(): Converts this string to a new character array.

// static String valueOf(int i): Returns the string representation of the integer argument.

// static String valueOf(Object obj): Returns the string representation of the Object argument.

// 7. Miscellaneous
// int length(): Returns the length of this string.

// boolean isEmpty(): Returns true if this string is empty.

// String intern(): Returns a canonical representation for the string object.

// boolean matches(String regex): Tells whether or not this string matches the given regular expression.

// CharSequence subSequence(int beginIndex, int endIndex): Returns a new character sequence that is a subsequence of this sequence.