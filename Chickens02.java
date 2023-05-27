public class Chickens02 {
    public static void main(String[] args) {

        int eggs_Segunda = 100;
        int eggs_Terça = 121;
        int eggs_Quarta = 117;

        double dailyAverage = (eggs_Segunda + eggs_Quarta + eggs_Terça) / 3.0;

        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("A média diaria de ovos coletados é: " + dailyAverage);
        System.out.println(" ");
        System.out.println("A média mensal de ovos coletados é: " + monthlyAverage);
        System.out.println(" ");
        System.out.println("O lucro mensal de venda dos ovos à US$0.18 será: US$" + monthlyProfit);
    }
}
