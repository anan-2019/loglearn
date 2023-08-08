import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName com.self.learn.com.self.learn.com.self.learn.log4j.Main
 * @Author 51205
 * @Date 2023/8/8 0008 22:17
 * @Version 1.0
 * @Description Class Function Description Here
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(com.self.learn.log4j.Main.class);

    public static void main(String[] args) {
        com.self.learn.log4j.Main.main(args);
        com.self.learn.log4j2.Main.main(args);
        com.self.learn.logback.Main.main(args);
    }
}
