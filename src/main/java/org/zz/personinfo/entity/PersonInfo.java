package org.zz.personinfo.entity;

import lombok.Data;

@Data
public class PersonInfo {

    private Integer id;
    private Integer type;
    private String name;
    private String company;
    private String phone;
    private String mail;
    private String address;
    private String position;

}
