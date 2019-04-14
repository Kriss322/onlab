
package com.tribe.Tribes.village;

import com.tribe.Tribes.player.Player;
import com.tribe.Tribes.village.buildings.Building;
import com.tribe.Tribes.village.units.SoldierUnit;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VillageDTO {
    
    private Integer id;
    
    private String name;
    
    private int villagePoints;
    
    private Player ownerPlayer; //??????? if valid from db
//    
    private WorldPosition position;
//    
    private Resources resourcesInWareHouse;
//    
    private ResourceProduction resourceProducementPerHour;
//    
    private List<SoldierUnit> army;
//    
    private List<Building> buildings;
//    
    private WorldMap worldMap;
//    
}
