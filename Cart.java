public class Cart {

    int startersQty[] = new int[25];
    int mainQty[] = new int[25];
    int snacksQty[] = new int[25];
    int dessertsQty[] = new int[25];

    public void add(int cat, int index, int q) {
        if (cat == 1) startersQty[index] += q;
        else if (cat == 2) mainQty[index] += q;
        else if (cat == 3) snacksQty[index] += q;
        else if (cat == 4) dessertsQty[index] += q;
    }
}
