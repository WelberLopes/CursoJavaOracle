
public class ShoppingCart02 {
    public static void main(String[] args) {
        double preco = 15;
        double imposto = 1.05;
        int quantidade = 2;
        double TotalPreco = (preco * imposto) * quantidade;
        String Custname = "Alex";
        String ItemDesc = "Calças";
        String message = Custname + " quer comprar " + (quantidade) + " " + ItemDesc
                + "\n" + "O custo total com imposto é: $"
                + TotalPreco;

        System.out.println(message);

    }
}
