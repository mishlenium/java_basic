import org.apache.commons.lang3.StringUtils;

public class Main {

    public static boolean isValidPhoneNumber(String pNumber) {
        /**
         * TODO: вернуть true, если номер является правильным номером телефона
         * номер считается правильным, если он начинается с 8 или 7 и имеет длину 11 цифр
         * а также содержит только цифры
         * в остальных случаях вернуть false
         *
         * Пример:
         * 79296721561 true
         * 55555555555 false
         * 829384838 false
         * 7929627156a false
         *
         * Для проверки того, что строка является числом нужно использовать утилиту StringUtils от Apache
         */
        if (pNumber.length() != 11) {
            return false;
        }
        if (pNumber.charAt(0) != '7' && pNumber.charAt(0) != '8') {
            return false;
        }
        if (!StringUtils.isNumeric(pNumber)) {
            return false;
        }
        return true;
    }
}
