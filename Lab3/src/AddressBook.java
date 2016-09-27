import java.util.List;
import java.util.ArrayList;

public class AddressBook {
	private List<BuddyInfo> buddies;
	
	public AddressBook()
	{
		buddies = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		if (buddy != null)
		{
			buddies.add(buddy);
		}
	}
	
	public boolean removeBuddy(BuddyInfo buddy)
	{
		return buddies.remove(buddy);
	}
	
	public static void main(String[] args)
	{
		BuddyInfo buddy = new BuddyInfo("Cyrus", "Carleton", "613");
		System.out.println(buddy.toString());
		AddressBook book = new AddressBook();
		
		book.addBuddy(buddy);
		book.removeBuddy(buddy);
	}
}
