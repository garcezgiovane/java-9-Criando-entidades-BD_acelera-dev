package com.challenge.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserChallenge {

    @ManyToOne
    private User user;
    
    @ManyToOne
    private Challenge challenge;

}
