package com.example.ternakburung;

import java.util.ArrayList;

public class BirdData {

    private static String[] catergoryName = {
            "Perkutut",
            "Tekukur",
            "Love bird",
            "Dara"
    };

    private static int[] categoryImage = {
            R.drawable.perkutut,
            R.drawable.tekukur,
            R.drawable.lovebird,
            R.drawable.dara
    };

    static ArrayList<Category> getListData(){
        ArrayList<Category> list = new ArrayList<>();
        for (int position = 0; position < catergoryName.length; position++) {
            Category category = new Category();
            category.setNama(catergoryName[position]);
            category.setGambar(categoryImage[position]);
            list.add(category);
        }
        return list;
    }
}
