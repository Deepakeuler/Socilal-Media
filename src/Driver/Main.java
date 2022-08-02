package Driver;

import Services.Instagram;

public class Main {
	
	
	public static void main(String args[]) {

		Instagram instagramUser = new Instagram();
	
	/*
	 * REGISTER_USER | jon | Jon Snow | Night's Watch
New user created jon

REGISTER_USER | jon | Jon Snow | Night's Watch
Error: User id jon already taken

REGISTER_USER | ned | Ned Stark | Hand of the King
New user created ned

FOLLOW_USER | jon | ned
jon is following ned

UNFOLLOW_USER | ned | jon
Error: ned was not following jon

UNFOLLOW_USER | jon | ned
jon unfollowed ned

GET_ALL_USER_INFO
id: ned, name: Ned Stark, description: Hand of the King, posts: 0, followers: 0, following: 0
id: jon, name: Jon Snow, description: Night's Watch, posts: 0, followers: 0, following: 0

CREATE_POST | ned | ned_post_1 (post_id) | Winter is coming!!
Post created

	 */
		instagramUser.registerUser("jon","Jon Snow","Night's watch");
		
		instagramUser.registerUser("jon", "Jon Snow", "Night's Watch");
		
		instagramUser.registerUser("ned", "Ned Stark", "Hand Of The King");
		
		instagramUser.followUser("jon", "ned");
		
		//instagramUser.followUser("Deepak", "Harsh");
		
		instagramUser.followUser("jon", "jon");
		
		//instagramUser.unfollowUser("Deepak", "Harsh");
		
		instagramUser.unfollowUser("jon", "jon");
		
		instagramUser.unfollowUser("ned", "jon");
		
		instagramUser.unfollowUser("jon", "ned");
		
		instagramUser.unfollowUser("jon", "ned");
		
		instagramUser.createPost("ned", "1", "Checking");
		
		instagramUser.createPost("Deepak", "2", "Writing Content");
		
		instagramUser.createPost("ned", "1", "Winter is Coming!");
		
		instagramUser.getAllUsersInfo();
		
		
	
	}
	
}
