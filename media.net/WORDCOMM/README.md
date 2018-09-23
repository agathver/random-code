# Word Combinations

You are provided with a dictionary with selected set of words.Given two words, you are required to transform the first word to the second word such that at every step of the transformation you change only one character.A change is defined as inserting, deleting or modifying a character. At every step the resulting word should be a part of the dictionary. Given two words return the minimum number of steps required to change the first word to the second. Given words will be a part of the dictionary.

## Input

The input will consist of a list of words constituting a dictionary. Each word will appear on a separate line and will consist of lower case characters only. A line containing 'END' marks the end of dictionary. The maximum size of the dictionary N <=120 and every word in the dictionary will be less than 40 characters in length. The following lines will each consist of two strings separated by a space.

## Output

Return the minimum number of steps required to transform the first string to the other with the above mentioned rules. In case the transformation is not possible return -1.

## Example

### Input:

    cat
    mat
    hat
    ham
    mate
    END
    cat mate

### Output:

    2
