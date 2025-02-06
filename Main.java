public class Main {
    public static void main(String[] args) {
        Hrac hrac = new Hrac();
        Registr registry = new Registr();

        Command pohybSever = new Pohyb(hrac, "sever");
        Command utok = new Utok(hrac);
        Command interakceSTruhlem = new Interakce(hrac, "truhlou");

        registry.registerCommand("pohyb sever", pohybSever);
        registry.registerCommand("utok", utok);
        registry.registerCommand("interakce s truhlou", interakceSTruhlem);

        String response = registry.executeCommand("pohyb_sever");
        System.out.println(response);

        response = registry.executeCommand("utok");
        System.out.println(response);

        response = registry.executeCommand("interakce s truhlou");
        System.out.println(response);

        response = registry.executeCommand("neznami prikaz");
        System.out.println(response);
    }
}