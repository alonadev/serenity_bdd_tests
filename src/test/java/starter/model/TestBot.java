package starter.model;

public class TestBot {

    private final String login;
    private final String password;

    public TestBot(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
//логика и удобство, повторяющиеся элементы, переиспользование - зачем выносить в отдельные классы
//режим остановки браузера