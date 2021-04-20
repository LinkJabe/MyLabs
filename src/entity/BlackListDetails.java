package entity;

public class BlackListDetails {
    private Person person_ID;
    private KarmaAction karmaAction_ID;
    private BlackList blackList_ID;

    public void setPerson_ID (Person person_ID) { this.person_ID = person_ID; }
    public Person getPerson_ID () { return person_ID; }

    public void setKarmaAction_ID (KarmaAction karmaAction_ID) { this.karmaAction_ID = karmaAction_ID; }
    public KarmaAction getKarmaAction_ID () { return karmaAction_ID; }

    public void setBlackList_ID (BlackList blackList_ID) { this.blackList_ID = blackList_ID; }
    public BlackList getBlackList_ID () { return blackList_ID; }

}
