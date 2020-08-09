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

    private static String[] detailKodePerkutut = {
            "RMM 137",
            "AAD 112",
            "AXZ 121",
            "OPN 201",
            "KKN 212"
    };

    private static String[] detailNetasPerkutut = {
            "08-05-2020",
            "02-11-2019",
            "19-02-2020",
            "11-07-2019",
            "01-12-2019"
    };

    private static int[] detailGambarPerkutut = {
            R.drawable.gambar_perkutut1,
            R.drawable.gambar_perkutut2,
            R.drawable.gambar_perkutut3,
            R.drawable.gambar_perkutut4,
            R.drawable.gambar_perkutut5
    };

    private static String[] detailKandangPerkutut = {
            "SUMELEH",
            "PALLAU",
            "LOMAKE",
            "SELAMEA",
            "KAKAPA"
    };

    private static String[] detailJantanPerkutut = {
            "NIP 717",
            "LLN 129",
            "HVJ 176",
            "GYN 211",
            "MCG 812"
    };
    private static String[] detailBetinaPerkutut = {
            "JAH 211",
            "KKJ 211",
            "IYV 953",
            "DFT 214",
            "JCY 868"
    };

//    TEKUKUR

    private static String[] detailKodeTekukur = {
            "OAQ 768",
            "JBU 291",
    };

    private static int[] detailGambarTekukur = {
            R.drawable.gambar_tekukur1,
            R.drawable.gambar_tekukur2
    };

    private static String[] detailNetasTekukur = {
            "19-04-2020",
            "12-09-2020",
    };

    private static String[] detailKandangTekukur = {
            "MAMALA",
            "MAMALA",
    };

    private static String[] detailJantanTekukur = {
            "TKK 021",
            "TKQ 141",
    };
    private static String[] detailBetinaTekukur = {
            "QXZ 189",
            "KAP 184",
    };

//    Love Bird

    private static String[] detailKodeLoveBird = {
            "JGL 089",
            "BFA 972",
            "CAF 291",
            "BJF 976"
    };

    private static int[] detailGambarLoveBird = {
            R.drawable.gambar_lovebird1,
            R.drawable.gambar_lovebird2,
            R.drawable.gambar_lovebird3,
            R.drawable.gambar_lovebird4
    };

    private static String[] detailNetasLoveBird = {
            "18-07-2020",
            "22-05-2019",
            "17-12-2020",
            "14-03-2019"
    };

    private static String[] detailKandangLoveBird = {
            "KULULU",
            "KULULU",
            "KULULU",
            "KULULU"
    };

    private static String[] detailJantanLoveBird = {
            "BHA 742",
            "JGD 965",
            "LFT 648",
            "GBH 123"
    };
    private static String[] detailBetinaLoveBird = {
            "BDF 145",
            "KDC 841",
            "GJC 184",
            "ODV 834",
    };

//    DARA

    private static String[] detailKodeDara = {
            "OPA 192",
            "FBA 912",
    };

    private static int[] detailGambarDara = {
            R.drawable.gambar_dara1,
            R.drawable.gambar_dara2,
    };

    private static String[] detailNetasDara = {
            "18-06-2020",
            "21-03-2019",
    };

    private static String[] detailKandangDara = {
            "KUKULIR",
            "KUKULIR",
    };

    private static String[] detailJantanDara = {
            "J1B 291",
            "JFB 182",
    };
    private static String[] detailBetinaDara = {
            "NVF 134",
            "NVO 905",
    };


    static ArrayList<Detail> getListDetail(String burung){
        ArrayList<Detail> list = new ArrayList<>();
        switch (burung){

            case "Perkutut":
                for(int position = 0; position < detailKodePerkutut.length; position++) {
                    Detail detail = new Detail();
                    detail.setKode(detailKodePerkutut[position]);
                    detail.setTanggal(detailNetasPerkutut[position]);
                    detail.setKandang(detailKandangPerkutut[position]);
                    detail.setJantan(detailJantanPerkutut[position]);
                    detail.setBetina(detailBetinaPerkutut[position]);
                    detail.setGambar(detailGambarPerkutut[position]);
                    list.add(detail);
                }
                break;

            case "Tekukur":
                for(int position = 0; position < detailKodeTekukur.length; position++) {
                    Detail detail = new Detail();
                    detail.setKode(detailKodeTekukur[position]);
                    detail.setTanggal(detailNetasTekukur[position]);
                    detail.setKandang(detailKandangTekukur[position]);
                    detail.setJantan(detailJantanTekukur[position]);
                    detail.setBetina(detailBetinaTekukur[position]);
                    detail.setGambar(detailGambarTekukur[position]);
                    list.add(detail);
                }
                break;

            case "Love bird":
                for(int position = 0; position < detailKodeLoveBird.length; position++) {
                    Detail detail = new Detail();
                    detail.setKode(detailKodeLoveBird[position]);
                    detail.setTanggal(detailNetasLoveBird[position]);
                    detail.setKandang(detailKandangLoveBird[position]);
                    detail.setJantan(detailJantanLoveBird[position]);
                    detail.setBetina(detailBetinaLoveBird[position]);
                    detail.setGambar(detailGambarLoveBird[position]);
                    list.add(detail);
                }
                break;

            case "Dara":
                for(int position = 0; position < detailKodeDara.length; position++) {
                    Detail detail = new Detail();
                    detail.setKode(detailKodeDara[position]);
                    detail.setTanggal(detailNetasDara[position]);
                    detail.setKandang(detailKandangDara[position]);
                    detail.setJantan(detailJantanDara[position]);
                    detail.setBetina(detailBetinaDara[position]);
                    detail.setGambar(detailGambarDara[position]);
                    list.add(detail);
                }
                break;
        }
        return list;
    };
}
