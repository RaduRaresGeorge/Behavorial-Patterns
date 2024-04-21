package src.main.java.SocialNetworkProfiles.social_networks;

import src.main.java.SocialNetworkProfiles.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
