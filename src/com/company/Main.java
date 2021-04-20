package com.company;

import entity.BlackListDetails;
import entity.KarmaAction;
import service.KPoliceService;
import service.impl.KPoliceServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        KPoliceService policeService = new KPoliceServiceImpl();

        // 1. посмотрим детали черного списка (кто попал и за что)
        List<BlackListDetails> blackListParticiples = policeService.GetBlackListParticiples();
        System.out.println("Amount : " + blackListParticiples.size());

        // 2. посмотрим за что вообще можно попасть в черный список
        List<KarmaAction> blackActions = policeService.GetBlackActions();
        for(int i = 0; i < blackActions.size(); i++) {
            System.out.println(blackActions.get(i));
        }

        // 3. Добавим в черный список грешника


    }
}
