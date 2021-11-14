package com.pb.derkach.hw7;

public class Atelier {
    public static void main(String[] args) {
//       public static void dressMan (Clothes.class[] char);
//
        Clothes [] clothesDress = new Clothes[4];
        clothesDress [0] = new Tshirt(Size.L,10, "blue");
        clothesDress [1] = new Pants(Size.S, 20, "white");
        clothesDress [2] = new Skirt(Size.XS, 30, "black");
        clothesDress [3] = new Tie(Size.XXS, 40,"red");

        dressMan (clothesDress);
        System.out.println();
        dressWoman (clothesDress);

   }
    public static void dressMan (Clothes[] clothes) {
        for (Clothes clothes1: clothes) {
            if (clothes1 instanceof ManClothes) {
                ((ManClothes)clothes1).dressMan();
            }
        }
    }
    public static void dressWoman (Clothes[] clothes) {
        for (Clothes clothes2: clothes) {
            if (clothes2 instanceof WomenClothes) {
                ((WomenClothes)clothes2).dressWomen();
            }
        }
    }
}
