package statustwitter;

import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {

        Twitter twitter;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("0AOUWd7NMNgCi11E1mqpKCkuL")
                .setOAuthConsumerSecret("xW2KlbmdUaKNnBSWm73p9VpL9ywNeGrx726tXVv7R4Wji8a0KK")
                .setOAuthAccessToken("3055142195-sx2xtJqgPrjUXrP7Dtd8YuRHdzH6GsOMSHIG4nq")
                .setOAuthAccessTokenSecret("gZekOzP1RBvqbOwg2zUHhVy4OcMSdub8YIeRTXGqGGVG7");
        twitter = new TwitterFactory(cb.build()).getInstance();
        
 
        Query query = new Query("#Cangas");
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }

}
