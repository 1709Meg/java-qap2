public class TestCampusMap {

    public static void main(String[] args) {

        CampusMap map = new CampusMap();

        MyRectangle scienceHall = new MyRectangle(
                new MyPoint(100, 300),
                new MyPoint(300, 100));

        MyRectangle library = new MyRectangle(
                new MyPoint(500, 300),
                new MyPoint(700, 100));

        MyCircle fountain = new MyCircle(400, 400, 50);

        map.addBuilding(scienceHall);
        map.addBuilding(library);

        map.addFountain(fountain);

        map.addWalkway(scienceHall, library);

        System.out.println("Total Walkway Length: "
                + map.calculateTotalWalkwayLength());

        System.out.println("Total Fountain Area: "
                + map.calculateTotalFountainArea());

        System.out.println("Walkway from Science Hall to Library: "
                + map.isWalkwayFromTo(scienceHall, library));
    }
}