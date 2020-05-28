import java.util.ArrayList;

public class ChatRoom {
	
	private static ArrayList<User> users = new ArrayList<User>();
	private static Bot bot;
	

	public static void showMessage(User user, String message){

		
		if(!users.contains(user)){
			System.out.println("System info: "+ user.getName()+ " cannot send messages anymore!");
			return;
		}	
		
		System.out.println(user.getName() + ": " + message);
		

		
		if(bot != null && message.contains("cat")){
			bot.removeUser(user);
			bot.sendMessage();			
		}		

		
		else if(message.equalsIgnoreCase("addBot")){
			bot = Bot.getBot();		
		}
	}
	

	
	public static void addUser(User user) {
		if(user!= null) {
			users.add(user);
		}
	}
	

	
	public static void removeUser(User user) {
		
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getName() + " has been removed from the chat!");
			
		}
	}

}