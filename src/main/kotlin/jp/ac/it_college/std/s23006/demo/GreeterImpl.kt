package jp.ac.it_college.std.s23006.demo

import org.springframework.stereotype.Component

@Component
class GreeterImpl : Greeter {
    override fun sayHello(name: String) = "Hello $name"
}