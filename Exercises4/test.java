public class test {
    public static void main(String[] args) {
        MovablePoint mp=new MovablePoint(5,5,1,1);
        System.out.println(mp.toString());
        mp.moveUp();
        System.out.println(mp.toString());
    }
}
