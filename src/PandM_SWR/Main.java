package PandM_SWR;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Planet earth = new Planet(1, 150000000, 40000, 12700);
        Planet jupiter = new Planet(67, 768000000, 439000, 139000);
        Planet mars = new Planet(2, 209000000, 21000, 6700);
        System.out.println(earth.getMooon());
        System.out.println(jupiter.planetTestDistance(mars));
    }
}
