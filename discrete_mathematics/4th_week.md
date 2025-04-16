#### 1
Suppose that during the most recent fiscal year, the annual revenue of Acme Computer was 138 billion dollars
and its net profit was 8 billion dollars, the annual revenue
of Nadir Software was 87 billion dollars and its net profit
was 5 billion dollars, and the annual revenue of Quixote
Media was 111 billion dollars and its net profit was
13 billion dollars. Determine the truth value of each of
these propositions for the most recent fiscal year.\
a) Quixote Media had the largest annual revenue.\
    Is $False$\
b) Nadir Software had the lowest net profit and Acme
Computer had the largest annual revenue.\
Is $True$\
c) Acme Computer had the largest net profit or Quixote
Media had the largest net profit.\
Is $True$\
d) If Quixote Media had the smallest net profit, then
Acme Computer had the largest annual revenue.\
$p$ - Quixote Media had the smallest net profit - $False$\
$q$ - Acme Computer had the largest annual revenue - $True$\
$p \rarr q$ - $True$\
e) Nadir Software had the smallest net profit if and only
if Acme Computer had the largest annual revenue.\
$p \harr q$ - $True$

---
#### 2
Let p and q be the propositions\
p : It is below freezing.\
q : It is snowing.\
Write these propositions using p and q and logical connectives (including negations).\
a) $p \land q$\
b) $p \land  \neg $ q\
c) $ \neg  p \land  \neg $ q\
d) $ \neg (p \lor q) $\
e) $ p \rarr q$\
f) $ (p \lor q) \land (\neg q \rarr p)$\
g) $ p \rarr q$\

---
### 3
How many rows appear in a truth table for each of these
compound propositions?\
a) p → ¬p - 2\
b) (p ∨ ¬r) ∧ (q ∨ ¬s) - 16 \
c) q ∨ p ∨ ¬s ∨ ¬r ∨ ¬t ∨ u - 64\
d) (p ∧ r ∧ t) ↔ (q ∧ t) - 32\

---
### 4
**Exercise 31: Construct a truth table for each of these compound propositions.**

**a) $p \land \neg p$**

| $p$ | $\neg p$ | $p \land \neg p$ |
|-----|----------|-----------------|
| T   | F        | F               |
| F   | T        | F               |

**b) $p \lor \neg p$**

| $p$ | $\neg p$ | $p \lor \neg p$ |
|-----|----------|----------------|
| T   | F        | T               |
| F   | T        | T               |

**c) $(p \lor \neg q) \rightarrow q$**

| $p$ | $q$ | $\neg q$ | $p \lor \neg q$ | $(p \lor \neg q) \rightarrow q$ |
|-----|-----|----------|-----------------|---------------------------------|
| T   | T   | F        | T               | T                               |
| T   | F   | T        | T               | F                               |
| F   | T   | F        | F               | T                               |
| F   | F   | T        | T               | F                               |

**d) $(p \lor q) \rightarrow (p \land q)$**

| $p$ | $q$ | $p \lor q$ | $p \land q$ | $(p \lor q) \rightarrow (p \land q)$ |
|-----|-----|-----------|-----------|-------------------------------------|
| T   | T   | T         | T         | T                                   |
| T   | F   | T         | F         | F                                   |
| F   | T   | T         | F         | F                                   |
| F   | F   | F         | F         | T                                   |

**e) $(p \rightarrow q) \leftrightarrow (\neg q \rightarrow \neg p)$**

| $p$ | $q$ | $p \rightarrow q$ | $\neg q$ | $\neg p$ | $\neg q \rightarrow \neg p$ | $(p \rightarrow q) \leftrightarrow (\neg q \rightarrow \neg p)$ |
|-----|-----|-------------------|----------|----------|-----------------------------|---------------------------------------------------|
| T   | T   | T                 | F        | F        | T                           | T                                                 |
| T   | F   | F                 | T        | F        | F                           | T                                                 |
| F   | T   | T                 | F        | T        | T                           | T                                                 |
| F   | F   | T                 | T        | T        | T                           | T                                                 |

**f) $(p \rightarrow q) \rightarrow (q \rightarrow p)$**

| $p$ | $q$ | $p \rightarrow q$ | $q \rightarrow p$ | $(p \rightarrow q) \rightarrow (q \rightarrow p)$ |
|-----|-----|-------------------|-------------------|---------------------------------------------------|
| T   | T   | T                 | T                 | T                                                 |
| T   | F   | F                 | T                 | T                                                 |
| F   | T   | T                 | F                 | F                                                 |
| F   | F   | T                 | T                 | T                                                 |

### 5
The first professor wants coffee but since he doesn't know about others he answered "I don't know."\
The second one also wants it, but answered "I don't know" since he doesn't know if the third one wants.\
And the third professor doesn't want coffee. And answered "not everyone wants coffee".
The 1st professor - wants;
The 2nd - wants;
The 3rd - doesn't want.

### 6
** Use De Morgan's Laws to find the negation of each of the following statements.**

**a) Jan is rich and happy.**

* p: Jan is rich
* q: Jan is happy
* Original statement: $p \land q$
* Negation: $\neg(p \land q)$
* De Morgan's Law: $\neg(p \land q) \equiv \neg p \lor \neg q$
* Negated statement: Jan is not rich or Jan is not happy.

**b) Carlos will bicycle or run tomorrow.**

* p: Carlos will bicycle tomorrow
* q: Carlos will run tomorrow
* Original statement: $p \lor q$
* Negation: $\neg(p \lor q)$
* De Morgan's Law: $\neg(p \lor q) \equiv \neg p \land \neg q$
* Negated statement: Carlos will not bicycle and Carlos will not run tomorrow.

**c) Mei walks or takes the bus to class.**

* p: Mei walks to class
* q: Mei takes the bus to class
* Original statement: $p \lor q$
* Negation: $\neg(p \lor q)$
* De Morgan's Law: $\neg(p \lor q) \equiv \neg p \land \neg q$
* Negated statement: Mei does not walk to class and Mei does not take the bus to class.

**d) Ibrahim is smart and hardworking.**

* p: Ibrahim is smart
* q: Ibrahim is hardworking
* Original statement: $p \land q$
* Negation: $\neg(p \land q)$
* De Morgan's Law: $\neg(p \land q) \equiv \neg p \lor \neg q$
* Negated statement: Ibrahim is not smart or Ibrahim is not hardworking.

### 7
** Show that each of these conditional statements is a tautology by using truth tables.**

**a) $(p \land q) \rightarrow p$**

| $p$ | $q$ | $p \land q$ | $(p \land q) \rightarrow p$ |
|-----|-----|-------------|-----------------------------|
| T   | T   | T           | T                           |
| T   | F   | F           | T                           |
| F   | T   | F           | T                           |
| F   | F   | F           | T                           |

This is a tautology.

**b) $p \rightarrow (p \lor q)$**

| $p$ | $q$ | $p \lor q$ | $p \rightarrow (p \lor q)$ |
|-----|-----|-------------|-----------------------------|
| T   | T   | T           | T                           |
| T   | F   | T           | T                           |
| F   | T   | T           | T                           |
| F   | F   | F           | T                           |

This is a tautology.

**c) $\neg p \rightarrow (p \rightarrow q)$**

| $p$ | $q$ | $\neg p$ | $p \rightarrow q$ | $\neg p \rightarrow (p \rightarrow q)$ |
|-----|-----|----------|-------------------|--------------------------------------|
| T   | T   | F        | T                 | T                                       |
| T   | F   | F        | F                 | T                                       |
| F   | T   | T        | T                 | T                                       |
| F   | F   | T        | T                 | T                                       |

This is a tautology.

**d) $(p \land q) \rightarrow (p \rightarrow q)$**

| $p$ | $q$ | $p \land q$ | $p \rightarrow q$ | $(p \land q) \rightarrow (p \rightarrow q)$ |
|-----|-----|-------------|-------------------|---------------------------------------------|
| T   | T   | T           | T                 | T                                             |
| T   | F   | F           | F                 | T                                             |
| F   | T   | F           | T                 | T                                             |
| F   | F   | F           | T                 | T                                             |

This is a tautology.

**e) $(p \rightarrow q) \rightarrow p$**

| $p$ | $q$ | $p \rightarrow q$ | $(p \rightarrow q) \rightarrow p$ |
|-----|-----|-------------------|-----------------------------|
| T   | T   | T                 | T                           |
| T   | F   | F                 | T                           |
| F   | T   | T                 | F                           |
| F   | F   | T                 | F                           |

This is not a tautology.

**f) $(p \rightarrow q) \rightarrow \neg q$**

| $p$ | $q$ | $p \rightarrow q$ | $\neg q$ | $(p \rightarrow q) \rightarrow \neg q$ |
|-----|-----|-------------------|---------|--------------------------------------|
| T   | T   | T                 | F       | F                                       |
| T   | F   | F                 | T       | T                                       |
| F   | T   | T                 | F       | F                                       |
| F   | F   | T                 | T       | T                                       |

This is not a tautology.

### 8
**Show that each of these conditional statements is a tautology without using truth tables.**\
**a)  $(p \land q) \rightarrow p$**\
1. $(p \land q) \rightarrow p$
2. $\neg (p \land q) \lor p$
3. $(\neg p \lor \neg q) \lor p$
4. $\neg p \lor (\neg q \lor p)$
5. $\neg p \lor (p \lor \neg q)$
6. $(\neg p \lor p) \lor \neg q$
7. $T \lor \neg q$
8. $T$\

**b)  $p \rightarrow (p \lor q)$**\
1. $p \rightarrow (p \lor q)$
1. $\neg p \lor (p \lor q)$
1. $\neg p \lor p \lor q$
1. $T \lor q$
1. $T$\

**c)  $\neg p \rightarrow (p \rightarrow q)$**\
1. $\neg p \rightarrow (p \rightarrow q)$
1. $\neg p \rightarrow (\neg p \lor q)$
1. $\neg(\neg p) \lor (\neg p \lor q)$
1. $p \lor \neg p \lor q$
1. $T \lor q$
1. $T$

**d)  $(p \land q) \rightarrow (p \rightarrow q)$**\
1. $\neg p \rightarrow (p \rightarrow q)$
1. $\neg p \rightarrow (\neg p \lor q)$
1. $(¬p∨¬q)∨(¬p∨q)$
1. $¬p∨¬q∨¬p∨q$
1. $¬p∨¬p∨¬q∨q$
1. $¬¬p∨T$
1. $T$