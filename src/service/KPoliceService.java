package service;

import entity.BlackListDetails;
import entity.KarmaAction;
import entity.Person;

import java.util.List;

public interface KPoliceService {

    List<BlackListDetails> GetBlackListParticiples();

    List<KarmaAction> GetBlackActions();

    void addToBlackList(Person person,KarmaAction karmaAction);

}
