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

##Variable Signals
Values of Signasl are immutable, but our library also defines a subclass Var of Signal for signals tha can bem changed.
Var provides an "update" operation, which allows to redefine the value of a signal form the current time on.
```
val sing = Var(3)
sig.update(5) // from now on, sig returns 5 isntead of 3
```

##Update Syntax
In Scala, calss to update can be written as assingnments. for instancem for an array arr
```
arr(i) = 0
```
is translated to 
```
arr.update(i,0)
```
which calls an update method which can be thought of as follows.
```
class Arry[T] {
    def update(ixs: Int, vlaue: T): Unit
    ...
}
```

Generally an indexed assignment like:
```
f(E1,...,Ea) = E
```
is translated to:
```
f.update(E1...Ea,E)
```
This works also if n=0:
``
f() = E //is shorthand for...
f.update(E)
```
Hence:
```
sig.update(5)
```
can be abbreviated to 
```
sig() = 5
```

##Signals and Variables
Signals of type Var look a bit like mutable vairables where
```
sig()
```
is dereferecenting, and
```
sig() = newValue
```
is update
```
But there is a crucial difference:
We can map over signals, which gives us a relacion between tow signals that is mantained automactically, at all future points in time.
No such mechnism existis for mutable variables; we have to porpagate all updates manually.
