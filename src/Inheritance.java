public class Inheritance {
         public static void main(String[] args) {
             Substract s1 = new Substract();
             s1.Substract();
             s1.Add();
         }
}
class sum{
    int a = 50, b=20;
    int x, y;
    // non parameterised constructor
    sum() {
        System.out.println("Constructor Top");
        x=20;
        y=10;
    }
    void Add(){
        System.out.println(a+b);
    }
}
class Substract extends sum
{
    Substract(){
        System.out.println("Constructor Bottom");
    }

    void Substract(){
        System.out.println(a-b);
        System.out.println(x-y);
    }
}

// class-A and class B so class B extends class A
// it means for-example: iphone 15 features extends in iphone 16 with new extended feature
// inheritance dealt with parent child relationship help reusability
// it does not support multiple inheritance by using interface we can achieve it.
// IS A Relationship and HAS-A rln
// no args constructor in inheritance call top to bottom means parent to child
//  object to parent to child
// final keyword , super keyword imp
// in parent class int n=1000;
// in derived class void display return System.out.println(super.n) get 1000;

// ✅ Inheritance in Java:
//
// Java supports:
//   - Single Inheritance (via classes)
//   - Multilevel Inheritance (via classes)
//   - Hierarchical Inheritance (via classes)
//
// Java doesn’t support:
//   - Multiple Inheritance (via classes)
//   - Hybrid Inheritance (via classes)
//
// 👉 But using interfaces, Java allows Multiple Inheritance and Hybrid Inheritance.
