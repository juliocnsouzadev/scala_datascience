# FRP Simple Implementation

## Implementation Idea
Each signal mantains
- its current values,
- the current expression tha define the signal value,
- a set of observers: the other signals  that depend on its values

Then, if the signal changes, all observer need to be re-eveluated.

## Dependency Maintenance

### How do we record dependencies in observers?

- When evaluating a signal-valued expression, need to know which signal caller gets defined or updated by the expression.
- If we kwno that, then executing a sig() menad adding caller to the observers of sig.
- When signal sig's value changes, all previusly observing signals are re-evaluated and the set sig.observes is cleared.
- Re-evaluation will re-enter a calling signal caller in sig.observers, as long as caller's value still depends on sig.

## Who's Calling?

How do we find out on whose behalf a signa expresson is evalutated?
One simpe way to do this is mantain a global data structure reffering to the current caller.
That data structure is accesd in a stack-like fashion because one evaluation of a signal might trigger others.
