package ch06.exercise.p18;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getShopService();
        ShopService obj2 = ShopService.getShopService();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
