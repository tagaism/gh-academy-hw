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
___________
##### 13
**Given the polynomial $P(x) = x^5 - 4x^3 + x^2 - 7$, classify it by degree and the number of terms.**\
Since the highest exponenta is 5 => degree is 5.\
And we have 4 terms it is called Polynomial with 4 terms (or quadronomial).
____________
##### 14
**Simplify $(2x^4 - 3x^3 + x - 5) + (x^3 - 2x^2 + 4x + 7)$**\
$2x^4 - 2x^3 - 2x^2 + 5x + 2$
___________
##### 15
**Find the product $(x^2 - x + 2)(x^2 + x + 1)$**\
$x^4 + x^3 + x^2 - x^3 - x^2 - x + 2x^2 + 2x + 2$\
$x^4 + 2x^2 + x + 2$
________
##### 16
**Find the GCD and LCM of $24x^3y^2z^5$ and $36x^5y^3z^2$.**\
GCD is: $12x^3y^2z^2.$\
LCM is: $72x^5y^3z^5.$
______
##### 17
**Factor $x^4 - 13x^2 + 36$.**\
$(x^2 - 9)(x^2 - 4)$\
$(x - 3)(x + 3)(x-2)(x + 2)$
_____
##### 18
**Expand $(2x + 3y)^5$ using the Binomial Theorem.**\
First, from the Pascal's theorem we got indexes for $n=5$ for each term of the polynomial, they are: 1, 5, 10, 10, 5, 1.\
It is going to be looking like this: $X + 5XY + 10XY + 10XY + 5XY + Y$\
Now, let find exponents for each elements of the every term using $(a + b)^2 = \sum_{k=0}^{n}\left(_{k}^n\right)a^{n-k}b^k$.\
$k = 0:\left(_{0}^5\right)(2x)^5(3y)^0=32x^5$\
$k = 1:\left(_{0}^5\right)(2x)^4(3y)^1=5\times16x^4\times3y=240x^4y$\
$k = 2:\left(_{0}^5\right)(2x)^3(3y)^2=10\times8x^3\times9y^2=720x^3y^2$\
$k = 3:\left(_{0}^5\right)(2x)^2(3y)^3=10\times4x^2\times27y^3=1080x^2y^3$\
$k = 4:\left(_{0}^5\right)(2x)^1(3y)^4=5\times2x\times81y^4=810xy^4$\
$k = 6:\left(_{0}^5\right)(2x)^0(3y)^5=243y^5$\
And now combine the polinomial, wich will be look like:\
$(2x + 3y)^5 = 32x^5 + 240x^4y + 720x^3y^2 + 1080x^2y^3 + 810xy^4 + 243y^5.$
_______________
##### 19
**Divide $6x^3 + 11x^2 - 31x + 15$ by $3x - 1$**\
$2x^2 + 5x - 7(1reminder)$
_________
##### 20
**List all possible rational zeros of $2x^4 - 5x^3 + x^2 - 4$.**\
Fractions for $p: \pm1, \pm2, \pm4$\
Fractions for $q: \pm1, \pm2$\
=> all possible rational zeros are: $\pm\frac{1}{2}, \pm1, \pm2, \pm4.$
