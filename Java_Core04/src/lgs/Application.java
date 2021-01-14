package lgs;

public class Application {
	public static void main(String[] args) {

		Robot R = new Robot("I Robot - я просто працюю!");
		//System.out.println(R);

		Robot Coffe = new Robot("I CoffeRobot - я варю каву!");
		//System.out.println(Coffe);

		Robot Dancer = new Robot("I RobotDancer - я просто танцюю! ");
		//System.out.println(Dancer);

		Robot Coocker = new Robot("I RobotCoocker - я просто готую! ");
		//System.out.println(Coocker);

		System.out.println("Array");

		Robot[] array = new Robot[4];
		array[0] = R;
		array[1] = Coffe;
		array[2] = Dancer;
		array[3] = Coocker;
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}

		
		
		System.out.println();
		System.out.println();


		
		Animal a = new Animal("Caty", 30, 8);

		System.out.print("Назва тварини = " + a.getName());
		System.out.print(", Вік тварини = " + a.getAge());
		System.out.print(", Швидкість тварини = " + a.getSpeed());
		System.out.println("!!!!");

		a.setName("Бик");
		a.setSpeed(2);
		a.setAge(14);

		System.out.println(a);

	}

}
