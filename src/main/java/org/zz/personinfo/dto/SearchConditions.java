package org.zz.personinfo.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class SearchConditions {

    public Integer id;
    public Integer type;
    public String name;
    public String company;
    public String phone;
    public String mail;
    public String address;
    public String position;
}
