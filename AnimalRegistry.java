import java.util.ArrayList;
import java.util.Scanner;

public class AnimalRegistry {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static int animalCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Показать команды животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Показать список животных по дате рождения");
            System.out.println("5. Показать количество созданных животных");
            System.out.println("6. Переименовать животное"); // Переименованное
            System.out.println("7. Изменить команды животного"); // Перемещено
            System.out.println("8. Удалить животное"); // Перемещено
            System.out.println("9. Выход");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    addNewAnimal(scanner);
                    break;
                case 2:
                    showAnimalCommands(scanner);
                    break;
                case 3:
                    trainNewCommand(scanner);
                    break;
                case 4:
                    showAnimalsByBirthDate();
                    break;
                case 5:
                    System.out.println("Общее количество созданных животных: " + animalCount);
                    break;
                case 6:
                    renameAnimal(scanner); // Переименовать животное
                    break;
                case 7:
                    changeAnimalCommands(scanner); // Изменить команды животного
                    break;
                case 8:
                    deleteAnimal(scanner); // Удалить животное
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
        scanner.close();
    }

    // 1. Добавление нового животного
    private static void addNewAnimal(Scanner scanner) {
        System.out.print("Введите тип животного (Dog, Cat, Hamster, Horse, Camel, Donkey): ");
        String type = scanner.nextLine();
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения (формат YYYY-MM-DD): ");
        String birthDate = scanner.nextLine();
        System.out.print("Введите команды (через запятую): ");
        String[] commands = scanner.nextLine().split(", ");

        Animal animal = null;
        switch (type.toLowerCase()) {
            case "dog":
                animal = new Dog(name, birthDate, commands);
                break;
            case "cat":
                animal = new Cat(name, birthDate, commands);
                break;
            case "hamster":
                animal = new Hamster(name, birthDate, commands);
                break;
            case "horse":
                animal = new Horse(name, birthDate, commands);
                break;
            case "camel":
                animal = new Camel(name, birthDate, commands);
                break;
            case "donkey":
                animal = new Donkey(name, birthDate, commands);
                break;
            default:
                System.out.println("Неизвестный тип животного.");
                return;
        }
        animals.add(animal);
        animalCount++;
        System.out.println("Животное добавлено в реестр.");
    }

    // 2. Список команд животного
    private static void showAnimalCommands(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Команды для " + name + ":");
                animal.displayCommands();
                return;
            }
        }
        System.out.println("Животное с таким именем не найдено.");
    }

    // 3. Обучение новым командам
    private static void trainNewCommand(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.print("Введите новую команду: ");
                String newCommand = scanner.nextLine();
                animal.addCommand(newCommand);
                System.out.println(name + " Животоное обучено новой команде.");
                return;
            }
        }
        System.out.println("Животное с таким именем не найдено.");
    }

    // 4. Показать список животных по дате рождения
    private static void showAnimalsByBirthDate() {
        animals.stream()
                .sorted((a1, a2) -> a1.getBirthDate().compareTo(a2.getBirthDate()))
                .forEach(a -> System.out.println(a.getName() + " - " + a.getBirthDate()));
    }

    // 5. Переименование животного
    private static void renameAnimal(Scanner scanner) {
        System.out.print("Введите имя животного, которое хотите переименовать: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.print("Введите новое имя для животного: ");
                String newName = scanner.nextLine();
                animal.setName(newName);
                System.out.println(name + " теперь переименован(а) в " + newName);
                return;
            }
        }
        System.out.println("Животное с таким именем не найдено.");
    }

    // 6. Изменение команд животного
    private static void changeAnimalCommands(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.print("Введите новые команды (через запятую): ");
                String[] newCommands = scanner.nextLine().split(", ");
                animal.setCommands(newCommands);
                System.out.println("Команды для " + name + " изменены.");
                return;
            }
        }
        System.out.println("Животное с таким именем не найдено.");
    }

    // 7. Удаление животного
    private static void deleteAnimal(Scanner scanner) {
        System.out.print("Введите имя животного для удаления: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animals.remove(animal);
                animalCount--;
                System.out.println(name + " удален(а) из реестра.");
                return;
            }
        }
        System.out.println("Животное с таким именем не найдено.");
    }
}
