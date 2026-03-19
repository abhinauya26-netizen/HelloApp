class HelloAp {

    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
    }
}