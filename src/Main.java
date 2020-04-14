public class Main {
    private static final String[] valid = {"C0318G", "A1111L", "P1234I", "C9959H", "A5678K", "P0001M"};
    private static final String[] invalid = {"B0318E", " X1211Y", "F12@4I", "79959H", "(*5678K", "!!0001M"};

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        boolean isValid;

        for (String name : valid){
            isValid = validateClassName.isValidateClassName(name);
            System.out.println("Class name: "+name+" is valid: "+isValid);
        }
        System.out.println("---------------");
        for (String name : invalid){
            isValid = validateClassName.isValidateClassName(name);
            System.out.println("Class name: "+name+" is valid: "+isValid);
        }
    }
}