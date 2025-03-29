##### 1
**Express the arithmetic series $S = 5 + 9 + 13 + ... + 89$ in sigma notation.**\
$\sum_{n=1}^{21} \left(5 + 4n\right)$
______________
##### 2
**Rewrite the arithmetic series $\sum_{k=3}^{15}(2k + 1)$ to start at $k = 1$**\
$\sum_{k=1}^{13}(2k + 1)$
______________
##### 3
**An arithmetic sequence is defined recursively by $a_1 = 12$ and $a_n = a_{n-1} + d. if a_{10} = 57$ find the value of $d$ and then find $a_{25}$.**\
$d = \frac{a_{10} - a_1}{n - 1} = \frac{57 - 12}{9} = 5$\
$a_{25} = a_1 + d(n - 1) = 12 + 5(24) = 132$
____
##### 4
**Find the sum of all multiples of 7 between 100 and 1000**\
The only possible $a_1$ after 100 and multiplied by 7 is 105;
And the only possible $a_n$ before 100 and multiplied by 7 is 994.\
$n = \frac{a_n - a_1}{d} = \frac{994 - 105}{7} = 128$\
So $S = \frac{n(a_1 + a_n)}{2} = \frac{128(105 + 994)}{2} = 70336$
__________
##### 5
**Given the arithmetic series $S = \sum_{k=1}{n}(3k + 2)$**
$a_1 = 3 + 2 = 5$\
$a_n = 3n + 2$\
From $S = \frac{n(a_1 + a_n)}{2}$\
We have $5300 = n(3n + 7)$\
$3n^2 + 7n - 5300 = 0$\

$n = \frac{-7 \pm \sqrt{7^2 - 4 \times 3 \times (-5300)}}{2 \times 3}$
$n \approx 40.88$\
Since $n \in \mathbb{Z} | n \le 0$
There is no such $n$.
______
##### 6
**In an arithmetic sequence, the 5th term is 20, and the 15th term is 60. Show that the 10th term is the arithmetic mean of the 5th and 15th terms.**\
$d = \frac{a_{15} - a_{5}}{15 - 5} = \frac{60 - 20}{15 - 10} = 4$\
$a_{10} = a_5 + 5 * 4 = 40$\
$Mean = \frac{20 + 60}{2} = 40$\
$=> a$ is Mean.
____
##### 7
**A stairscase has 20 steps. The first step is 5cm high, and each subsequent step is 0.5 cm higher then the previous one. What is the total height fot he staircase?**\
$S_{20} = \frac{20}{2}[2 \times 5 +(20 - 1)\times 0.5]$\
$S_{10} = 10[10 + 9.5] = 10 \times 19.5 = 195 cm$
____
##### 8
**An arithemtic serires has a first term of 11 and a common difference of 3. Find the smallest value of $n$ such thatn the sum $S_n$ exceeds 1000**\
$a_1 = 11, d = 3$\
Let's first write the formula of sum for the first $n$ elements of series:\
$S_n = \frac{n}{2}[2a_1 + (n - 1)d]$\
$S_n = \frac{n}{2}[22 + (n - 1)3]$\
$3n^2 + 19n - 2000 > 0$\
By solving this quadratic equation, we will get:\
$n \approx 23.84$\
Round up the result - $n = 23$
____
##### 9
**Rewrite $\sum_{k=3}^{12}4\left(\frac{1}{2}\right)^k$ as sum starting from $k=0$**\
$\sum_{k = 3 - 3}^{12 - 3}4\left(\frac{1}{2}\right)^{k - 3} = \sum_{k = 0}^{9}4\left(\frac{1}{2}\right)^{k+3} = \sum_{k = 0}^{9}4\left(\frac{1}{2}\right)^{k}\left(\frac{1}{2}\right)^3 = \sum_{k = 0}^{9}\left(\frac{1}{2}\right)^{k+1}$
____
##### 10
**Find the 10th term of a geometric sequence if $a_2 = -6$ and $a_5 = 48.$**\
First let's find $d$.\
$a_5 = a_3d^3$\
$48 = -6d^3$\
$d^3 = -8$\
$d = -2$\
Now let's find $a_10$\
$a_n = a_kd^{k - n}$\
$a_{10} = 48 (-2)^5 = 48 \times (-32) = -1536$
_____
##### 11
**In a geometric sequence, $a_4 = 54$ and $a_7 = 1458$. Find the common ratio $r$.**\
$1458 = 54d^3$\
$d^3 = 1458 / 54 = 27$\
$d = 3$
___________________
##### 12
**Calculate the sum of the first 15 terms fo the geometric dquence where $a_1 = 8$ and $r = \frac{3}{4}$**\
$S_n = a_1\frac{1 - r^n }{1 - r}$\
$15 = 8\frac{1 -\left(\frac{3}{4}\right)^{15}}{1-\frac{3}{4}} \approx 32$