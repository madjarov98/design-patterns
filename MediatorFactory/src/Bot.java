public class Bot {
	private static Bot bot;



		public static Bot getBot() {
			

			if(bot == null) {
				
				bot = new Bot();
			}
			return bot;
		}
		
	
		public void sendMessage() {
			System.out.println("Bot: Cat is a forbidden word!");
		}


		public void removeUser(User user) {
			ChatRoom.removeUser(user);
		}
	}
	