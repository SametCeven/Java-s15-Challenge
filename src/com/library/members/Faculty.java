package com.library.members;
import java.util.Date;


public class Faculty extends MemberRecord {
    public Faculty(Long memberId, String name, Date dateOfMembership, Integer noBooksIssued, String address, String phoneNumber) {
        super(memberId, name, Type.FACULTY, dateOfMembership, noBooksIssued, address, phoneNumber);
    }
}
