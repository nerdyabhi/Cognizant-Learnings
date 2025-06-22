# E-commerce Search Function

## What is Big O Notation?

Big O notation is a mathematical notation used to describe the computational complexity of algorithms, specifically how the runtime or space requirements grow relative to the input size. It provides an upper bound on the growth rate of an algorithm's time or space complexity in the worst-case scenario.


## Search Algorithm Performance
### Linear Search
- **Best case**: O(1) - Found on first check
- **Average case**: O(n) - Checks half the items on average
- **Worst case**: O(n) - Must check every item

### Binary Search
- **Best case**: O(1) - Target found at middle position
- **Average case**: O(log n) - Eliminates half the search space each iteration
- **Worst case**: O(log n) - Continues halving until one element remains

## Time Complexity Comparison

- **Linear Search**: Performance degrades linearly (1000 products = up to 1000 operations)
- **Binary Search**: Logarithmic performance (1000 products = maximum 10 operations)

## Which Algorithm to Choose?

**Use Binary Search for E-commerce**

**Why?**
- Online stores have thousands of products
- Binary search stays fast even with lots of items
- Fast search = happy customers
- Worth sorting products first to get better search speed

**Trade-off**: You need to keep products in sorted order, but searches will be much faster.
