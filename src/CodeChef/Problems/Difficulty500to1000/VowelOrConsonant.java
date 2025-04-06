package CodeChef.Problems.Difficulty500to1000;
/*
Is it a VOWEL or CONSONANT
Write a program to take a character
(
C
)
(C) as input and check whether the given character is a vowel or a consonant.

N
O
T
E
:
−
NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

Input Format
First line will contain the character
C
C.
Output Format
Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

Constraints
C
C
w
i
l
l
will
b
e
be
a
n
an
u
p
p
e
r
upper
c
a
s
e
case
E
n
g
l
i
s
h
English
a
l
p
h
a
b
e
t
alphabet

---Input---
Z
---Output---
Consonant
**/


import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int a=0, b=0;
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        for(char i : v){
            if (s.equalsIgnoreCase(String.valueOf(i))){
                a++;
            } else {
                b++;
            }
        }
        if(a!=0){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
