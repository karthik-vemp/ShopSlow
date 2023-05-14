import java.util.*;
public class Brands {
    // instance variables
    public ArrayList<Brand> list;

    // constructor
    public Brands() {
        list = new ArrayList<Brand>();
        list.add(new Brand("BOODY", 2, "Sustainable Materials", "Basics", "Size Inclusive", "W"));
        list.add(new Brand("CHNGE", 1, "Sustainable Materials", "Casual", "Carbon Neutral", "W"));
        list.add(new Brand("Honest Basics", 1, "Basics", "Colorful Designs", "Quality", "MW"));
        list.add(new Brand("Dilly Socks", 1, "Basics", "Colorful Designs", "Sustainable Materials", "MW"));
        list.add(new Brand("Mighty Good Basics", 1, "Basics", "Carbon Neutral", "Quality", "MW"));
        list.add(new Brand("Yes Friends", 1, "Colorful Designs", "Size Inclusive", "Ethical Production", "MW"));
        list.add(new Brand("PACT", 2, "Basics", "Sweaters", "Ethical Production", "MWK"));
        list.add(new Brand("tentree", 2, "Sustainable Materials", "Size Inclusive", "Basics", "MWK"));
        list.add(new Brand("Kotn", 2, "Charity Driven", "Work Friendly", "Basics", "MW"));
        list.add(new Brand("Happy Earth", 2, "Size Inclusive", "Charity Driven", "Basics", "MW"));
        list.add(new Brand("Little Emperor", 1, "Sustainable Materials", "Cute Designs", "Charity Driven", "K"));
        list.add(new Brand("Sense Organics", 2, "Cute Designs", "Carbon Neutral", "Accessories", "K"));
        list.add(new Brand("eclipse", 1, "Basics", "Sustainable Materials", "Patterns and Prints", "MW"));
        list.add(new Brand("Plant Faced Clothing", 2, "Ethical Production", "Sweaters", "Patterns and Prints", "MW"));
        list.add(new Brand("Etiko", 2, "Ethical Production", "Sweaters", "Footwear", "MWK"));
        list.add(new Brand("Noctu", 2, "Casual", "Charity Driven", "Basics", "MWK"));
        list.add(new Brand("ABLE", 3, "Size Inclusive", "Long-Lasting", "Charity Driven", "MW"));
        list.add(new Brand("Rapanui", 2, "Accessories", "Charity Driven", "Size Inclusive", "MW"));
        list.add(new Brand("Glass Onion", 3, "Vintage", "Colorful Designs", "Recycled Materials", "MW"));
        list.add(new Brand("Proclaim", 3, "Basics", "Recycled Materials", "Charity Driven", "W"));
        list.add(new Brand("Svala", 3, "Recycled Materials", "Accessories", "Quality", "MW"));
        list.add(new Brand("Katla", 3, "Casual", "Ethical Production", "Sustainable Materials", "MWK"));
        list.add(new Brand("Reformation", 1, "Denim", "Fancy", "Sustainable Materials", "MW"));
        list.add(new Brand("Quince", 1, "Ethical Production", "Fancy", "Accessories", "MW"));
        list.add(new Brand("Amour Vert", 3, "Size Inclusive", "Fancy", "Work Friendly", "W"));
        list.add(new Brand("Girlfriend", 3, "Size Inclusive", "Swimwear", "Sustainable Materials", "MWK"));
        list.add(new Brand("MATE The Label", 2, "Recycled Materials", "Denim", "Casual", "MW"));
        list.add(new Brand("Whimsy + Row", 2, "Fancy", "Quality", "Denim", "W"));
        list.add(new Brand("TAMGA", 2, "Fancy", "Colorful Designs", "Sustainable Materials", "W"));
        list.add(new Brand("Hanna Anderson", 1, "Colorful Designs", "Organic", "Sustainable Materials", "K"));
        list.add(new Brand("Colorful Standard", 2, "Size Inclusive", "Recycled Materials", "Colorful Designs", "MW"));
        list.add(new Brand("Thought", 3, "Size Inclusive", "Basics", "Sustainable Materials", "MW"));
        list.add(new Brand("Passion Life", 2, "Size Inclusive", "Fancy", "Charity Driven", "MWK"));
        list.add(new Brand("Harvest & Mill", 1, "Basics", "Cute Designs", "Sustainable Materials", "MWK"));
    }
    public String run(String atr1, String atr2, String atr3, String atr4, String atr5, String gender, int price) {
        for(int i = 0; i < list.size(); i++) {
            if(!list.get(i).genderMatch(gender))  {
                list.remove(i);
                i--;
            }
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() != price) {
                list.remove(i);
                i--;
            }
        }
        for(int i = 0; i < list.size(); i++) {
            list.get(i).setNum(list.get(i).atrMatch(atr1, atr2, atr3, atr4, atr5));
        }
        String result = "";
        if(list.size() < 5) {
            for(int i = 0; i < list.size(); i++) {
                result += list.get(i).getName();
            }
            return result;
        }
        for(int i = 0; i < 5; i++) {
            Brand max = list.get(0);
            int index = 0;
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).getNum() > max.getNum()) {
                    max = list.get(j);
                    index = j;
                }
            }
            result += max.getName() + ", ";
            list.remove(index);
            
        }
        return result;
    }
}
