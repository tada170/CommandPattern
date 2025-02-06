import java.util.HashMap;

class Registr {
    private HashMap<String, Command> commandMap = new HashMap<>();

    public void registerCommand(String prikaz, Command command) {
        commandMap.put(prikaz, command);
    }

    public String executeCommand(String input) {
        Command command = commandMap.get(input);

        if (command != null) {
            command.execute();
            return "Prikaz " + input + " byl proveden.";
        } else {
            return "Neznámý prikaz: " + input;
        }
    }
}