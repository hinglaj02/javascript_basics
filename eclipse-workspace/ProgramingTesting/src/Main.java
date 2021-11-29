
//RUN TIME POLYMORPHISM EXAMPLE

class Animal{ 
void eat(){
System.out.println("Animals Eat");
} 
} 

class Herbivores extends Animal{ 
void eat(){
System.out.println("Herbivores Eat Plants");
}
}

class Omnivores extends Animal{ 
void eat(){
System.out.println("Omnivores Eat Plants and meat");
}
}

public class Main {

	public static void main(String args[]){
    	Animal A = new Animal();
    	Animal h = new Herbivores(); //upcasting 
Animal o = new Omnivores(); //upcasting
A.eat();
   	h.eat();
    	o.eat(); 

	}}
