import model.Building;
import model.enums.HomeType;
import repsoitory.BuildingRepository;
import service.BuildingService;

public class Main {
    public static void main(String[] args) {
        BuildingRepository buildingRepository = new BuildingRepository();
        BuildingService buildingService=new BuildingService(buildingRepository);
        Building villa1=new Building(HomeType.VILLA,180000.00,100.00,8,2);
        Building villa2=new Building(HomeType.VILLA,180000.00,100.00,8,2);
        Building villa3=new Building(HomeType.VILLA,180000.00,100.00,8,2);
        Building house1=new Building(HomeType.HOUSE,10000.00,80.00,4,1);
        Building house2=new Building(HomeType.HOUSE,10000.00,80.00,4,1);
        Building house3=new Building(HomeType.HOUSE,10000.00,80.00,4,1);
        Building cootage1=new Building(HomeType.COOTAGE,200000.00,160.00,10,2);
        Building cootage2=new Building(HomeType.COOTAGE,200000.00,160.00,10,2);
        Building cootage3=new Building(HomeType.COOTAGE,200000.00,160.00,10,2);
        buildingService.addBuilding(villa1);
        buildingService.addBuilding(villa2);
        buildingService.addBuilding(villa3);
        buildingService.addBuilding(house1);
        buildingService.addBuilding(house2);
        buildingService.addBuilding(house3);
        buildingService.addBuilding(cootage1);
        buildingService.addBuilding(cootage2);
        buildingService.addBuilding(cootage3);
        System.out.println(buildingService.getAverageM2AllBuildingsByType(HomeType.VILLA));
        System.out.println(buildingService.getAverageM2AllBuildingsByType(HomeType.HOUSE));
        System.out.println(buildingService.getAverageM2AllBuildingsByType(HomeType.COOTAGE));
        System.out.println(buildingService.getAverageM2AllBuildings());
        System.out.println("-----------------------------");
        System.out.println(buildingService.getTotalPriceAllBuildingsByType(HomeType.VILLA));
        System.out.println(buildingService.getTotalPriceAllBuildingsByType(HomeType.HOUSE));
        System.out.println(buildingService.getTotalPriceAllBuildingsByType(HomeType.COOTAGE));
        System.out.println(buildingService.getTotalPriceAllBuildings());

    }
}