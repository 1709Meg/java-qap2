public class CampusMap {

    private MyRectangle[] buildings;
    private MyLine[] walkways;
    private MyCircle[] fountains;

    private int buildingCount;
    private int walkwayCount;
    private int fountainCount;

    public CampusMap() {
        buildings = new MyRectangle[10];
        walkways = new MyLine[10];
        fountains = new MyCircle[10];

        buildingCount = 0;
        walkwayCount = 0;
        fountainCount = 0;
    }

    public void addBuilding(MyRectangle building) {
        buildings[buildingCount] = building;
        buildingCount++;
    }

    public void addFountain(MyCircle fountain) {
        fountains[fountainCount] = fountain;
        fountainCount++;
    }

    public void addWalkway(MyRectangle from, MyRectangle to) {

        boolean foundFrom = false;
        boolean foundTo = false;

        for (int i = 0; i < buildingCount; i++) {

            if (buildings[i] == from) {
                foundFrom = true;
            }

            if (buildings[i] == to) {
                foundTo = true;
            }
        }

        if (!foundFrom || !foundTo) {
            System.out.println("Error: One or both buildings are not in the campus map.");
            return;
        }

        MyLine walkway = new MyLine(
                from.getCenter(),
                to.getCenter());

        walkways[walkwayCount] = walkway;
        walkwayCount++;
    }

    public boolean isWalkwayFromTo(MyRectangle fromBuilding,
            MyRectangle toBuilding) {

        MyPoint fromCenter = fromBuilding.getCenter();
        MyPoint toCenter = toBuilding.getCenter();

        for (int i = 0; i < walkwayCount; i++) {

            MyLine current = walkways[i];

            if (current.getBegin().getX() == fromCenter.getX()
                    && current.getBegin().getY() == fromCenter.getY()
                    && current.getEnd().getX() == toCenter.getX()
                    && current.getEnd().getY() == toCenter.getY()) {

                return true;
            }
        }

        return false;
    }

    public double calculateTotalWalkwayLength() {
        double total = 0;

        for (int i = 0; i < walkwayCount; i++) {
            total += walkways[i].getLength();
        }

        return total;
    }

    public double calculateTotalFountainArea() {
        double total = 0;

        for (int i = 0; i < fountainCount; i++) {
            total += fountains[i].getArea();
        }

        return total;
    }
}