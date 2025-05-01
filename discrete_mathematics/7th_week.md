#### 1
Work out the computational complexity of the following piece of code assuming that $n=2^m$\
```java
for(int i = n; i > 0; i--) {
    for(int j = 0; j < n; j*=2) {
        for(int k = 0; i < j; k++) {
            ... // constants number C of operations;
        }
    }
}
```
Inner loop has O(n) complexity.\
Next loop is O(lg n) complexity.\
And the innest one, since $n$ is always the same is parent loop\
 it has same time complexity O(lg n)\
 Therefore, it means two inner loops run each time n times.
 => Overall time complexity is $O(n^2)$
 
 ----------------------------
