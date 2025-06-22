# Financial Forecasting Tool

## What is Recursion?

Recursion is when a function calls itself to solve a problem by breaking it into smaller, similar problems. Think of it like Russian nesting dolls - each layer reveals a smaller version of the same thing.

**Key parts:**
- **Base case**: When to stop calling itself (when years = 0)
- **Recursive case**: How it calls itself with a simpler problem (years - 1)

## Our Financial Forecasting Implementation

Our `forecastValue()` function calculates future investment value using recursion:

```java
public static double forecastValue(double currentValue, double growthRate, int years) {
    if (years == 0) {           // Base case: no more years to calculate
        return currentValue;
    }
    // Recursive case: apply growth for one year, then recurse for remaining years
    return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
}
```

**How it works:**
- Each year builds on the previous year's value
- Same calculation repeated over time periods
- Natural "countdown" structure (years decreases each call)

## Algorithm Analysis

### Our Recursive Approach
- **Time Complexity**: O(n) where n = number of years
  - Each year requires one function call
  - Total calls = number of years
- **Space Complexity**: O(n) due to call stack
  - Each recursive call adds a frame to the call stack
  - Maximum stack depth = number of years

### Why This Works Well for Financial Forecasting
- **Natural fit**: Financial growth is inherently recursive (each year builds on the last)
- **Clear logic**: Easy to understand and maintain
- **Accurate**: Handles compound growth correctly

## Optimization Opportunities

For very large time periods (100+ years), you could optimize by:
- **Memoization**: Store calculated intermediate values
- **Iterative approach**: Use a loop instead of recursion to save memory
- **Mathematical formula**: Use compound interest formula for O(1) calculation

## Real-World Application

This tool demonstrates:
- Investment growth over time
- Compound interest calculations  
- Long-term financial planning
- How small growth rates compound significantly over time

**Example**: $1,000 at 10% annual growth becomes $1,610.51 after 5 years.
