package com.texas.student.management.model.attendence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="daily_based_attendence")
public class DailyBasedAttendance extends Attendance {

    @Column(name = "checkout")
    private long checkout;

    @Column(name = "checkin")
    private long checkin;

    public long getCheckout() {
        return checkout;
    }

    public void setCheckout(long checkout) {
        this.checkout = checkout;
    }

    public long getCheckin() {
        return checkin;
    }

    public void setCheckin(long checkin) {
        this.checkin = checkin;
    }
}
