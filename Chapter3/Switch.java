public class Switch {

    public static void main(String[] args) {
        printDayofWeek(2);
        printDayOfWeekEx(3);
        fish();
    }

    private static void printDayofWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        
    }

    public static void printDayOfWeekEx(int day){
        var result = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
            System.out.println(result);
    }

    private static void fish(){
        var fish = 5;
        var lenght = 12;

        var name = switch(fish){
            case 1 -> "GoldFish";
            case 2 -> {yield "Trout";}
            case 3 -> {if (lenght>10) yield "Goldfish";
                    else yield "Green";
            }
            default -> "Swordfish";
        };
        System.out.println(name);
    }
}