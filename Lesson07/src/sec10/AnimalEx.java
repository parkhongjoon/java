package sec10;

public class AnimalEx {

	public static void main(String[] args) {

//		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breath(); // animal �޼ҵ�
		cat.sound();
		
		dog.breath();
		dog.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
		//�������� �̿��� ���
		public static void animalSound(Animal animal) {
			animal.sound();
		}
	}


