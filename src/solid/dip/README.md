#Dependency Inversion Principle

- High-level modules should not depend on low-level modules.
Both should depend on abstractions.
- Abstractions should not depend on details.
Details should depend on abstractions.

This can be achieved by a decoupling the definition of the service from the implementation.

--- 

High-level modules performs operations on low-level constructs. They are consumed directly by the presentation layer.

Low-level modules are dependency modules - helps high-level to do their work.