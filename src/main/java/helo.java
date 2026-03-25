public class helo {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}