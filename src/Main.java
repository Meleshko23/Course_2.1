public class Main {

    public static void main(String[] args) {
        boolean result = Validator.validate("tesSt_1234", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин и/или пароль некорректные");
        }
    }
}

//
//1. Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
//2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания. *Например, java_skypro.go*
//        1. У параметра login есть ограничение по длине - он должен быть равен или меньше 20 символов.
//                Если login длиннее 20 символов, то  необходимо выбросить исключение - `WrongLoginException`.
//        3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
//        *Например, D_1hWiKjjP_9*
//        4. У параметра password тоже есть ограничение по длине - он должен быть строго меньше 20 символов.
//        5. Параметры password и confirmPassword должны быть равны.
//                Если это требование не соблюдается, то нужно выбросить`WrongPasswordException`.
//        6. Обработка исключений проводится внутри метода.
//        7. Для обработки исключений используйте multi-catch block.