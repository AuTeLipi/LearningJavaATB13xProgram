package Ex_29_ENUM;

public class Lab211_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.google.getUrl());

        int a = 10;

    }
}
