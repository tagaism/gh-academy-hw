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
multiplication principle for the case b)?
$25^4 = 390625$
