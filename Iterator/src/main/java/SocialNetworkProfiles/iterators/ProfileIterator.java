package src.main.java.SocialNetworkProfiles.iterators;

import src.main.java.SocialNetworkProfiles.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
