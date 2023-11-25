package OOP;

import java.util.*;

public class C6bt2 {
	interface Animal {
		void speak();

		void eat();

		void sleep();
	}

	class Dog implements Animal {
		@Override
		public void speak() {
			System.out.println("The dog barks.");
		}

		@Override
		public void eat() {
			System.out.println("The dog eats bones.");
		}

		@Override
		public void sleep() {
			System.out.println("The dog sleeps in its bed.");
		}
	}

	class Cat implements Animal {
		@Override
		public void speak() {
			System.out.println("The cat meows.");
		}

		@Override
		public void eat() {
			System.out.println("The cat eats fish.");
		}

		@Override
		public void sleep() {
			System.out.println("The cat sleeps on the sofa.");
		}
	}

	public class Main {
		public static void main(String[] args) {
			Animal dog = new Dog();
			dog.speak();
			dog.eat();
			dog.sleep();

			Animal cat = new Cat();
			cat.speak();
			cat.eat();
			cat.sleep();
		}
	}

}
