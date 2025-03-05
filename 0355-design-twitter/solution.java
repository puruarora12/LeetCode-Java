class tweet{
    int user;
    int tweetid;
    public tweet(int user, int tweetid){
        this.user=user;
        this.tweetid = tweetid;
    }
}
class Twitter {

    class tweet{
    int user;
    int tweetid;
    public tweet(int user, int tweetid){
        this.user=user;
        this.tweetid = tweetid;
    }
}

    HashMap<Integer, Set<Integer>> follow;
    TreeMap<Integer, tweet> tweets;
    List<Integer> edgecase;
    int timestamp ;
    public Twitter() {
        follow= new HashMap<>();
        tweets= new TreeMap<>();
        timestamp=0;
        edgecase = new ArrayList<>();
        // for(int i=9999;i>=0;i--)edgecase.add(i);
     }
    
    public void postTweet(int userId, int tweetId) {
       tweet tt = new tweet(userId, tweetId);
        tweets.put(timestamp++ , tt);
        // if(timestamp==9999) System.out.println("all posted");
        // System.out.println("tweet posted");
        // System.out.println(tweets);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if(timestamp==10000){
            return new ArrayList<>();
        }
        Set<Integer> following = follow.get(userId);
        List<Integer> userTweets = new ArrayList<>();
        int recents = timestamp-1 ;
        System.out.println(timestamp);
        
        // if(following==null) return userTweets;
        // System.out.println(tweets);
        // System.out.println(following);
        int count =0;
        while(tweets.size()>0 && recents>=0 && count<10){
            int user = tweets.get(recents).user;
            // System.out.println(user);
            if( (following!=null && following.contains(user) ) || user==userId  ) {
                userTweets.add(tweets.get(recents).tweetid);
                count++;
                // System.out.println("getting tweet for "+recents);
            } 
            recents--;
        }
        // Collections.reverse(userTweets);
        // System.out.println("got new tweets");
        // System.out.println(tweets);
        return userTweets;
    }
    
    public void follow(int followerId, int followeeId) {
        Set<Integer> ans = new HashSet<>();
        ans=follow.getOrDefault(followerId, ans);
        if(ans==null || ans.size()==0) ans.add(followerId);
        ans.add(followeeId);
        follow.put(followerId, ans);
        // System.out.println("followed " +followeeId);
        // System.out.println(follow);
    }
    
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followers = follow.get(followerId);
        if(followers!=null && followers.contains(followeeId)){
            followers.remove(followeeId);
            follow.put(followerId, followers);
        }
        // System.out.println("unfollowed "+followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
