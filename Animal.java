import java.util.ArrayList;

public class Animal {
    private String name;                  // Имя животного
    private String birthDate;             // Дата рождения животного
    private ArrayList<String> commands;   // Команды, которые знает животное

    // Конструктор
    public Animal(String name, String birthDate, String[] commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
        for (String command : commands) {
            this.commands.add(command.trim());
        }
    }

    // Получить имя животного
    public String getName() {
        return name;
    }

    // Установить имя животного
    public void setName(String name) {
        this.name = name;
    }

    // Получить дату рождения
    public String getBirthDate() {
        return birthDate;
    }

    // Получить команды
    public ArrayList<String> getCommands() {
        return commands;
    }

    // Установить новые команды
    public void setCommands(String[] commands) {
        this.commands.clear(); // Очищаем старые команды
        for (String command : commands) {
            this.commands.add(command.trim()); // Добавляем новые команды
        }
    }

    // Добавить новую команду
    public void addCommand(String command) {
        commands.add(command.trim());
    }

    // Вывести команды животного
    public void displayCommands() {
        if (commands.isEmpty()) {
            System.out.println("Нет доступных команд.");
        } else {
            for (String command : commands) {
                System.out.println(command);
            }
        }
    }
}
