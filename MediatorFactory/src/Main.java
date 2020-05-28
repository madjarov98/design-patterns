
public class Main {
	public static void main(String[] args) {
	
	UserFactory factory = new UserFactory();
	User userOne = factory.createUser("Ivan");
	User userTwo = factory.createUser("Petkan");
	User userThree = factory.createUser("Dragan");

	ChatRoom.addUser(userOne);
	ChatRoom.addUser(userTwo);
	ChatRoom.addUser(userThree);
		
	userOne.sendMessage("Hi!");
	userTwo.sendMessage("Hello!");
	userThree.sendMessage("Opiiii");

	
	userOne.sendMessage("Do you like cats?");
	userTwo.sendMessage("addBot");
	userThree.sendMessage("Yes, I have a cat at home.");
	userThree.sendMessage("His name is Garfield.");

    }
}