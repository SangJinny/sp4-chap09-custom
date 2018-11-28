@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("testApp Started.");
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }
}
