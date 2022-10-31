public class Sandwich {
    private String breadType;
    private double baseCost;
    private double costPerItem;
    ArrayList<String> items;

    public Sandwich(String breadType) {
        this.breadType = breadType;
        baseCost=4.0
        costPerItem=1.25
        Items=new ArrayList<>{};
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public double getCostPerItem() {
        return costPerItem;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public String getBreadType() {
        return breadType;
    }
    public void additem(String itemName) {
        items.add(itemName);
    }
    public double TotalCost(){
        int numItems=items.size();
        double cost=baseCost+costPerItem;
        return cost;
    }


}
