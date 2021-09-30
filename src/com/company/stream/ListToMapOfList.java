package com.company.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

final class ListToMapOfList {
    public static void main(String[] args) {
        Set<Long> osmIdsUniq = new HashSet<>();

        List<Geometry3G> matchGeometries = new ArrayList<>();

        Geometry3G geometry3G = new Geometry3G();
        geometry3G.setOsmId(1l);
        geometry3G.setFeatId(UUID.fromString("00005858-5800-1200-0000-00007735ba8e"));
        matchGeometries.add(geometry3G);

        Geometry3G geometry3G1 = new Geometry3G();
        geometry3G1.setOsmId(1l);
        geometry3G1.setFeatId(UUID.fromString("00005858-5800-1200-0000-00007735ba8f"));
        matchGeometries.add(geometry3G1);

        Geometry3G geometry3G2 = new Geometry3G();
        geometry3G2.setOsmId(1l);
        geometry3G2.setFeatId(UUID.fromString("00005858-5800-1200-0000-00007735ba8d"));
        matchGeometries.add(geometry3G2);

        Map<Long,List<Geometry3G>> map =
                matchGeometries.stream()
                        .flatMap(
                                geom -> {
                                    Map<Long,Geometry3G> um = new HashMap<>();
                                    um.put(geom.getOsmId(),geom);
                                    return um.entrySet().stream();
                                    }
                        ) // produces a Stream<Map.Entry<String,String>>
                        .collect(
                                    Collectors.groupingBy(Map.Entry::getKey,
                                        Collectors.mapping(Map.Entry::getValue,Collectors.toList())
                                    )
                                );


        map.forEach((x,y) -> System.out.println("k : "+ x + "val : "+ y) ) ;
        System.out.println("Map : "+ map.size() + ", ksize : "+map.values().size());
     }
}
