public class Menu {

    String starters[] = {
            "Spring Rolls","Paneer Tikka","Chicken Tikka","Veg Manchurian","Chilli Paneer",
            "Garlic Bread","Hara Bhara Kebab","Fish Fingers","Crispy Corn","French Fries",
            "Peri Peri Fries","Chicken Wings","Cheese Balls","Veg Cutlet","Chicken Cutlet",
            "Onion Rings","Veg Soup","Tomato Soup","Sweet Corn Soup","Hot & Sour Soup",
            "Aloo Tikki","Samosa","Kachori","Veg Momos","Chicken Momos"
    };

    double startersPrice[] = {
            90,120,150,110,130,80,100,160,90,60,70,140,110,60,90,70,
            80,90,100,110,50,20,25,80,100
    };

    String mainCourse[] = {
            "Veg Biryani","Chicken Biryani","Paneer Butter Masala","Dal Makhani","Kadhai Paneer",
            "Butter Chicken","Chole Bhature","Rajma Chawal","Veg Thali","Non-Veg Thali",
            "Fish Curry","Egg Curry","Aloo Paratha","Laccha Paratha","Masala Dosa",
            "Idli Sambar","Uttapam","Poori Sabji","Mutter Paneer","Palak Paneer",
            "Chicken Curry","Veg Fried Rice","Chicken Fried Rice","Veg Pulao","Mushroom Curry"
    };

    double mainPrice[] = {
            140,180,160,130,150,200,100,110,200,250,180,120,70,40,110,
            80,100,90,150,160,170,120,150,130,140
    };

    String snacks[] = {
            "Veg Sandwich","Cheese Sandwich","Grilled Sandwich","Club Sandwich","Chicken Sandwich",
            "Veg Burger","Cheese Burger","Chicken Burger","Pav Bhaji","Vada Pav",
            "Dabeli","Paneer Roll","Chicken Roll","Veg Pizza","Cheese Pizza",
            "Farmhouse Pizza","Margherita Pizza","Garlic Cheese Pizza","Pani Puri","Bhel Puri",
            "Sev Puri","Masala Maggi","Cheese Maggi","Veg Pasta","White Sauce Pasta"
    };

    double snacksPrice[] = {
            60,70,80,100,120,80,100,120,90,50,40,90,110,150,180,
            250,200,180,40,50,55,60,80,120,140
    };

    String desserts[] = {
            "Gulab Jamun","Rasgulla","Kaju Katli","Brownie","Ice Cream Vanilla",
            "Ice Cream Chocolate","Ice Cream Strawberry","Kulfi","Falooda","Milkshake Chocolate",
            "Milkshake Mango","Milkshake Oreo","Chocolate Cake","Black Forest Cake","Pastry",
            "Donut","Muffin","Fruit Salad","Gajar Halwa","Kheer",
            "Rabri","Jalebi","Basundi","Sweet Lassi","Cold Coffee"
    };

    double dessertsPrice[] = {
            40,40,120,90,60,60,60,70,120,90,90,100,120,130,80,
            60,50,70,100,90,130,50,80,60,70
    };

    public void showCategory(int cat) {
        if (cat == 1) print(starters, startersPrice);
        else if (cat == 2) print(mainCourse, mainPrice);
        else if (cat == 3) print(snacks, snacksPrice);
        else if (cat == 4) print(desserts, dessertsPrice);
    }

    public void print(String arr[], double pr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i] + " - ₹" + pr[i]);
        }
    }
}
