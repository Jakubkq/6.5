package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("UserOne");
        User user2 = new YGeneration("UserTwo");
        User user3 = new ZGeneration("UserThree");

        //When
        String user1ShouldPublish = user1.sharePost();
        System.out.println("UserOne should " + user1ShouldPublish);
        String user2ShouldPublish = user2.sharePost();
        System.out.println("UserTwo should " + user2ShouldPublish);
        String user3ShouldPublish = user3.sharePost();
        System.out.println("UserThree should " + user3ShouldPublish);

        //Then
        assertEquals("Facebook is my life", user1ShouldPublish);
        assertEquals("snap is my life", user2ShouldPublish);
        assertEquals("twitter is my live", user3ShouldPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("UserOne");

        //When
        String user1ShouldPublish = user1.sharePost();
        System.out.println("UserOne should " + user1ShouldPublish);
        user1.setPublishStrategy(new TwitterPublisher());
        user1ShouldPublish = user1.sharePost();
        System.out.println("UserOne now should " + user1ShouldPublish);

        //Then
        assertEquals("twitter is my live", user1ShouldPublish);
    }
}

