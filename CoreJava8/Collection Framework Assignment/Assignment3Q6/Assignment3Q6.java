import java.util.*;

class Chatroom
	{
    private String name;
    private Set<String> username;
    private List<String> messages;
    
    Chatroom()
    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) 
	{
        this.username.remove(username);
        if(this.username.contains(username))
        return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUsername() {
        return username;
    }

    public void setUsername(Set<String> username) {
        this.username = username;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(String message) {
        messages.add(message);
    }
}

class User
	{

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}


class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) 
	{
        if(chatrooms.containsKey(name))
        return true;
        return false;
    }

    public boolean isUsernameExists(String username) 
	{
        if(users.containsKey(username))
        {
        System.out.println("ChatRoom Successful");
        return true;
        }
        System.out.println("ChatRoom Failed");
        return false;
    }


    public boolean authenticateUser(String username, String password) 
	{
        if(users.containsKey(username))
        {
            User user= users.get(username);
            if(user.getPassword().equals(password))
            {
            System.out.println(" Successful");
            return true;
            }
        }
        System.out.println("Failed");
        return false;
    }

    public void createChatroom() {
        Chatroom chat= new Chatroom();
        System.out.println(" ChatRoom name :");
        Scanner in = new Scanner(System.in);
        chat.setName(in.nextLine());
        System.out.println("Enter Usernames to be added :");
        Set<String> usernames= new HashSet<>();
        while(in.hasNextLine())
        {
            String n=in.nextLine();
            if(n=="")
            break;
            if(isUsernameExists(n)) 
            usernames.add(n);
            else
            {
                System.out.println("Chatroom Creation Failed");
               
            }
        System.out.println("Enter Username :");

        }
        chat.setUsername(usernames);
        System.out.println("Created Room Successfully");
        chatrooms.put(chat.getName(), chat);
        
    }

    public void listUsersFromChatroom(Chatroom room) 
	{
        System.out.println("Users in the Chatroom :");
        Set<String> set= room.getUsername();
        for(String i:set)
        {
            System.out.println(i);
        }
    }

    public void logout(String key)
	{
        System.out.println("LoggedOut Successfully");
        
    }

    public void deleteUser(String key)
	{
        users.remove(key);
        System.out.println("Removed "+key+" from UserList");
       
    }


    public Map<String, Chatroom> getChatrooms() 
	{
        return chatrooms;
    }

    public void setChatrooms(Map<String, Chatroom> chatrooms) 
	{
        this.chatrooms = chatrooms;
    }

    public Map<String, User> getUsers() 
	{
        return users;
    }

    public void setUsers(Map<String, User> users) 
	{
        this.users = users;
    }

    public Set<String> getLoggedInUsers() 
	{
        return loggedInUsers;
    }

    public void setLoggedInUsers(Set<String> loggedInUsers) 
	{
        this.loggedInUsers = loggedInUsers;
    }
}

public class Assignment3Q6
	{
    public static void main(String[] args){
        ChatApplication chatapplication = new ChatApplication();

    }
}