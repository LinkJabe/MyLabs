package entity;

import java.util.List;


public class BlackList {

    private Integer ID;
    private String name;
    private List<BlackListDetails> details;

    public void setID (Integer ID) { this.ID = ID; }
    public Integer getID () { return ID; }

    public void setName (String name) { this.name = name; }
    public String getName () { return name;}

    public void setDetails (List<BlackListDetails> details) { this.details = details; }
    public List<BlackListDetails> getDetails () { return details; }

}
