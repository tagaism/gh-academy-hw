### 1
**You have three shirts and four pairs of pants. How many outfits consisting of one shirt and one pair of pants**\
$ 3 * 4 = 12$ outfits in total.

-------------------------------
### 2
**In how many ways can we form a license plate if there are 7 characters, none of which is the letter O, the first of which is a numerical digit (0-9), the second of which is a letter, and the remaining five of which can be either a digit or a letter (but not the letter O)?**\
10 for the first position (any digit from 0-9).
25 for the second position (any letter except 'O').\
35 for each of the remaining five positions (10 digits + 25 letters excluding 'O').\
And since there are 5 such positions, it's 35×35×35×35×35, or 35^5
Which is $1,313,046,875$

--------------------------------
### 3
**My city is running a lottery. In the lottery, 25 balls numbered 1 through 25 are placed in a bin. Four balls are drawn one at a time and their numbers are recorded. The winning combination consists of the four selected numbers in the order they are selected. How many winning combinations are there, if:**\
a) each ball is discarded after it is removed:
In this case, the order of the balls matters; we can implement the permutation principle:\
$P(25, 4) = 25! / (25 - 4)! = 25!/21! = 25 * 24 * 23 * 22 = 303600;$\

b) each boall is replaced in the bin after it is removed and bevore the next ball is drawn:\
In this case we simply implement the multiplication principle:\
multiplication principle $25^4 = 390625$
____________________________________

### 4
**On the island of Mumble, the Mumblian alphabet has only 5 letters, and every word in the Mumblian language has no more than 3 letters in it. How many words are possible? (A word can use a letter more than once, but 0 letters does not count as a word.)**\
For 1-letter words: 5 possibilities (A, B, C, D, E)\
For 2-letter words: $5^2=25$ possibilities (e.g., AA, AB, AC, BA, BB, etc.)\
For 3-letter words: $5^3=125$ possibilities.\
And the sum of all words possibilities is 155.
____________________________________

### 5
**The Smith family has 4 sons and 3 daughters. In how many ways can they be seated in a row of 7 chairs such that at least 2 boys are next to each other?**\

Ways to arrange the 3 daughters: $3!=3×2×1=6$ ways.
Ways to arrange the 4 sons in the 4 available slots: $4!=4×3×2×1=24$ ways.
So, the total number of ways where no two boys are next to each other is indeed $3!×4!=6×24=144.$
Since $7!$ is the total ways without any restriction. and 144 is a number of ways "no boys sitting to each other" way we just subtract them:\
$7! - 144 = 4896$ ways
____________________________________

### 6
**How many sequences $x_1,x_2,x_3,…,x_7$ can be formed in which all the $x_i$ are integers greater than $0$ and less than $6$, and no two adjacent $x_i$ are equal?**\
The restriction is that we can use only $1, 2, 3, 4, 5$.\
For the first place we have 5 choices.\
Therefor, since the adjacent can't be the same, we have only 4 choices. For the other 5 positions we also have 4 choices for each.\
Using Multiplication Principle:\
$5×4×4×4×4×4×4$\
$5×4^6 = 5×4096 = 20480$

### 8
**How many distinct arrangements are there of PAPA**\
Here we use Permutation with repetition principle:\
$\frac{4!}{2! × 2!} = 3 × 4 / 2 = 6$