#Principles of Reactive Programming

Reactive programming is about reacting to sequences of events that happen in time.
Functional view: Aggregate an envent sequence into a signal.
- A signal is a value that changes over time.
- It is represented as a function from time to the value domain.
- Instead of propagating updates to mutable state, we define new signals in terms of existing ones.

##Fundamental Signal Operations

There are two fundamental operations over signasl:
1. Obtain the value of the signal at the current time. In our library this is expressed by () application. E.g.: mousePosition() // the current mouse position
2. Define a signal in terms of other signasl. In our library, this is expressed by the Signal constructor.

##Contant Signals
The Sinal(...) syntax can also be used to defina a signal that has always the same value:
```
val sing = Sinal(3)
```

##How do we define a signal tha varies in time?
 - We can use externally define signals, such as mousePosition and map over them
 - Or we can use a var


