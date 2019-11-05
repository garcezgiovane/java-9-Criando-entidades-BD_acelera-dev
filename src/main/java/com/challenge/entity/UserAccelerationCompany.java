package com.challenge.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserAccelerationCompany {

    @ManyToOne
    private User userId;

    @ManyToOne
    private Acceleration accelerationId;

    @ManyToOne
    private Company companyId;
}
