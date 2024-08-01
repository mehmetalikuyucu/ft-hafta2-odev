package repsoitory;

import model.Building;

import java.util.ArrayList;
import java.util.List;

public class BuildingRepository {
    private List<Building> buildings=new ArrayList<>();

    public void save(Building building){
        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}
