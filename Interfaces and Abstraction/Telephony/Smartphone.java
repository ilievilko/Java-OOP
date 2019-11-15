package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String number : numbers) {
            boolean isValid = true;
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                stringBuilder.append("Calling... ").append(number);
            } else {
                stringBuilder.append("Invalid number!");
            }
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String url : urls) {

            boolean isValid = true;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                stringBuilder.append("Browsing: ").append(url).append("!");
            } else {
                stringBuilder.append("Invalid URL!");
            }
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }

}
