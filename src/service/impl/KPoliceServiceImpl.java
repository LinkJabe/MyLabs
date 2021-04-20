package service.impl;

import entity.BlackListDetails;
import entity.KarmaAction;
import entity.Person;
import service.KPoliceService;

import java.util.Arrays;
import java.util.List;

public class KPoliceServiceImpl implements KPoliceService {

    @Override
    public List<BlackListDetails> GetBlackListParticiples() {
        List<BlackListDetails> BlackListParticiples = getAllBlackListDetailsData();
        return BlackListParticiples;
    }

    @Override
    public List<KarmaAction> GetBlackActions() {
        List<KarmaAction> blackActions = getAllKarmaActionData();
        return blackActions;
    }

    @Override
    public void addToBlackList(Person person, KarmaAction karmaAction) {
        List<BlackListDetails> blackListParticiples = GetBlackListParticiples();
        BlackListDetails PERSON2 = new BlackListDetails();
        PERSON2.setPerson_ID(person);
        PERSON2.setKarmaAction_ID(karmaAction);
        blackListParticiples.add(PERSON2);
    }

    private List<Person> getAllPersonData() {
        Person person1 = new Person();
        person1.setID(1);
        person1.setName("John");
        person1.setJob("Builder");

        Person person2 = new Person();
        person2.setID(2);
        person2.setName("James");
        person2.setJob("Officer");

        return Arrays.asList(person1, person2);

    }

    private List<KarmaAction> getAllKarmaActionData() {
        KarmaAction action1 = new KarmaAction();
        action1.setID(1);
        action1.setBlackAction("Smoking");

        KarmaAction action2 = new KarmaAction();
        action2.setID(2);
        action2.setBlackAction("Drinking alcohol");

        KarmaAction action3 = new KarmaAction();
        action3.setID(3);
        action3.setBlackAction("Abuse");

        return Arrays.asList(action1, action2, action3);

    }

    private List<BlackListDetails> getAllBlackListDetailsData() {
        BlackListDetails PERSON1 = new BlackListDetails();
        PERSON1.setPerson_ID(getAllPersonData().get(0));
        PERSON1.setKarmaAction_ID(getAllKarmaActionData().get(1));

        return Arrays.asList(PERSON1);

    }



}
