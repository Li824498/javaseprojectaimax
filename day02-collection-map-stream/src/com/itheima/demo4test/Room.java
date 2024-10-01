package com.itheima.demo4test;


import java.util.*;

public class Room {
    private List<Card> cards = new ArrayList<>();
    public void start() {
        //1、准备点数
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥", "♠", "♣", "♦"};
        int num = 0;
        for (String size : nums) {
            num++;
            for (String color : colors) {
                cards.add(new Card(size, color, num));
            }
        }

        Collections.addAll(cards, new Card("小王","", 14), new Card("大王","", 15));

        Collections.shuffle(cards);

        System.out.println(cards);

        List<Card> lhc = new ArrayList<>();
        List<Card> lhb = new ArrayList<>();
        List<Card> lhz = new ArrayList<>();

        Map<String, List<Card>> players = new HashMap<>();
        players.put("令狐冲", lhc);
        players.put("令狐白", lhb);
        players.put("令狐紫", lhz);

        for (int i = 0; i < cards.size() - 3; i++) {
            Card card = cards.get(i);
            if (i % 3 == 0){
                lhc.add(card);
            } else if (i % 3 == 1) {
                lhb.add(card);
            } else {
                lhz.add(card);
            }
        }

        List<Card> lastCards = new ArrayList<>();
        lastCards.addAll(cards.subList(cards.size()-3, cards.size()));

        lhc.addAll(lastCards);

        sortcard(lhc);
        sortcard(lhb);
        sortcard(lhz);



        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }


    }

    private void sortcard(List<Card> lhc) {
        lhc.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getNums() - o2.getNums();
            }
        });
    }

}
