package com.itheima.demo2map;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        clac();
    }

    private static void clac() {
        ArrayList<String> list = DataConstruct();
//        System.out.println(list);
        Map<String, Integer> maps = new HashMap<>();
        for (String place : list) {
//            if (maps.containsKey(place)) {
//                maps.put(place, maps.get(place) + 1);
//            } else {
//                maps.put(place, 1);
//            }

            maps.put(place, maps.containsKey(place) ? maps.get(place) + 1 : 1);
        }

        maps.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    private static ArrayList<String> DataConstruct() {
        ArrayList<String> list = new ArrayList<>();
        String[] places = {"雅鲁藏布江", "汨罗江", "青秀江", "龙川江"};

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
//            int num = r.nextInt(4);
            list.add(places[r.nextInt(4)]);
//            switch(num){
//                case 0:
//                    list.add("雅鲁藏布江");
//                    break;
//                case 1:
//                    list.add("汨罗江");
//                    break;
//                case 2:
//                    list.add("青秀江");
//                    break;
//                case 3:
//                    list.add("龙川江");
//                    break;
//                default:
//            }
        }

        return list;
    }
}
