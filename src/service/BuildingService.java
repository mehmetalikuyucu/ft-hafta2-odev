package service;

import model.Building;
import model.enums.HomeType;
import repsoitory.BuildingRepository;

import java.util.List;

public class BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }
    public void addBuildings(List<Building>  buildings){
        for (Building building : buildings) {
            buildingRepository.save(building);
        }
    }
    public void addBuilding(Building  building){
        buildingRepository.save(building);
    }
    public double getTotalPriceAllBuildingsByType(HomeType homeType){
        return buildingRepository.getBuildings().stream().filter(building -> building.getHomeType().equals(homeType)).map(Building::getPrice).reduce(0D,Double::sum);
    }
    public double getTotalPriceAllBuildings(){
        return buildingRepository.getBuildings().stream().map(Building::getPrice).reduce(0D,Double::sum);
    }
    public double getAverageM2AllBuildingsByType(HomeType homeType){
        return buildingRepository.getBuildings().stream().filter(building -> building.getHomeType().equals(homeType)).map(Building::getM2).reduce(0D,Double::sum)/ buildingRepository.getBuildings().size();
    }
    public double getAverageM2AllBuildings(){
        return buildingRepository.getBuildings().stream().map(Building::getM2).reduce(0D,Double::sum)/ buildingRepository.getBuildings().size();
    }
}
