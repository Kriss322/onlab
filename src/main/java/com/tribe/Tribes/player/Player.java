package com.tribe.Tribes.player;

import com.tribe.Tribes.com.tribe.Tribes.tribe.Tribe;
import com.tribe.Tribes.village.Village;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.tribe.Tribes.village.WorldMap;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Player implements Serializable {

    @Id @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private Integer playerPoints;

    @ManyToOne
    @JoinColumn(name="tribe_id")
    private Tribe joinedTribe;

    private String titleInTribe;

    @OneToMany(mappedBy="ownerPlayer")
    private List<Village> villages;

    @ManyToOne
    @JoinColumn(name="worldmap_id")
    private WorldMap world;

}
