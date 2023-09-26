public class NameChecker {
    public static String checkName(String name, int playerNum) {
        if (name.isEmpty()){
            System.out.println(System.lineSeparator() + "You have not chosen the name for Player "+ playerNum +", so it will be set to P" + playerNum + ".");
            return "P" + playerNum;
        }
        else{
            System.out.println(System.lineSeparator() + "You have chosen the name " + name + " for Player " + playerNum + ".");
            return name;
        }
    }
}
