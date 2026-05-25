import java.time.*;
import java.time.format.*;
import java.util.*;
import java.io.*;

public class Script {
    
    private static final String[] QUOTES = {
        "\"Write once, run anywhere.\" - Sun Microsystems",
        "\"Java is to JavaScript what car is to carpet.\" - Chris Heilmann",
        "\"Simplicity is the soul of efficiency.\" - Java Philosophy",
        "\"Code is like humor. When you have to explain it, it's bad.\" - Cory House",
        "\"The best error message is the one that never shows up.\" - Unknown",
        "\"99 bugs in the code, 99 bugs. Take one down, patch it around...\"",
        "\"Java: The only language where you need 20 lines to print Hello World properly.\"",
        "\"NullPointerException: because why not?\"",
        "\"I'm not a control freak, but I love Spring.\"",
        "\"Thread.sleep(1000);\""
    };
    
    private static String progressBar(int percentage) {
        int filled = percentage / 5;
        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < 20; i++) {
            bar.append(i < filled ? "█" : "░");
        }
        bar.append("] ").append(percentage).append("%");
        return bar.toString();
    }
    
    private static String randomColor() {
        String[] colors = {"#ff0055", "#00ff9d", "#ffb86c", "#bd93f9", "#50fa7b"};
        return colors[new Random().nextInt(colors.length)];
    }
    
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd EEEE");
        
        Random rand = new Random();
        int javaLevel = 85 + rand.nextInt(10);
        int caffeine = rand.nextInt(101);
        
        StringBuilder readme = new StringBuilder();
        
        readme.append("```\n");
        readme.append(" ██╗ █████╗ ██╗   ██╗ █████╗     ██████╗ ███████╗██╗   ██╗\n");
        readme.append(" ██║██╔══██╗██║   ██║██╔══██╗    ██╔══██╗██╔════╝██║   ██║\n");
        readme.append(" ██║███████║██║   ██║███████║    ██║  ██║█████╗  ██║   ██║\n");
        readme.append(" ██║██╔══██║╚██╗ ██╔╝██╔══██║    ██║  ██║██╔══╝  ╚██╗ ██╔╝\n");
        readme.append(" ██║██║  ██║ ╚████╔╝ ██║  ██║    ██████╔╝███████╗ ╚████╔╝ \n");
        readme.append(" ╚═╝╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚═════╝ ╚══════╝  ╚═══╝  \n");
        readme.append("```\n\n");
        
        readme.append("```bash\n");
        readme.append("┌─[ SideDev@JVM-Matrix ]\n");
        readme.append("├─[ OS: Java Virtual Machine v21 ]\n");
        readme.append("├─[ Shell: ☕ javac ]\n");
        readme.append(String.format("├─[ Time: %s | Date: %s ]\n", 
            now.format(timeFormat), now.format(dateFormat)));
        readme.append(String.format("├─[ Caffeine Level: %s ]\n", progressBar(caffeine)));
        readme.append(String.format("└─[ Java Mastery: %s ]\n", progressBar(javaLevel)));
        readme.append("```\n\n");
        
        String quote = QUOTES[rand.nextInt(QUOTES.length)];
        readme.append("```java\n");
        readme.append("// 🔮 箴言\n");
        readme.append("System.out.println(\"" + quote + "\");\n");
        readme.append("```\n\n");
        
        String color1 = randomColor();
        String color2 = randomColor();
        readme.append("<div align=\"center\">\n\n");
        readme.append(String.format("<img height=\"180\" src=\"https://github-readme-stats.vercel.app/api?username=SideDev&show_icons=true&theme=radical&hide_border=true&ring_color=%s&title_color=%s\" />\n", color1, color2));
        readme.append(String.format("<img height=\"180\" src=\"https://github-readme-stats.vercel.app/api/top-langs/?username=SideDev&theme=radical&hide_border=true&title_color=%s&layout=compact\" />\n", color2));
        readme.append("\n</div>\n\n");
        
        readme.append("<div align=\"center\">\n\n");
        readme.append(String.format("<img src=\"https://nirzak-streak-stats.vercel.app/?user=SideDev&theme=radical&hide_border=true&stroke=%s&ring=%s&fire=%s\" />\n", color1, color1, color1));
        readme.append("\n</div>\n\n");
        
        readme.append("<div align=\"center\">\n\n");
        readme.append("<img src=\"https://github-profile-trophy.vercel.app/?username=SideDev&theme=radical&no-frame=true&row=1&column=6&margin-w=15\" />\n");
        readme.append("\n</div>\n\n");
        
        String[] statusEmoji = {"⚡", "🔥", "💀", "🎯", "🚀", "💻", "☕"};
        String status = statusEmoji[rand.nextInt(statusEmoji.length)];
        String[] activities = {"Compiling spells", "Taming the JVM", "Hunting NullPointer", "Crafting bytecode", "Drinking coffee", "Refactoring life"};
        String activity = activities[rand.nextInt(activities.length)];
        
        readme.append("```yaml\n");
        readme.append("status:\n");
        readme.append(String.format("  emoji: \"%s\"\n", status));
        readme.append("  current_quest: \"" + activity + "\"\n");
        readme.append("  learning: \"GraalVM · Project Loom · Rust\"\n");
        readme.append("  building: \"High-performance RPC framework\"\n");
        readme.append("```\n\n");
        
        readme.append("<div align=\"center\">\n\n");
        readme.append("[![X](https://img.shields.io/badge/X-000000?style=for-the-badge&logo=x&logoColor=white)](https://x.com/ImSideDev) &nbsp;\n");
        readme.append("[![Twitch](https://img.shields.io/badge/Twitch-9146FF?style=for-the-badge&logo=twitch&logoColor=white)](https://twitch.tv/imsidedev) &nbsp;\n");
        readme.append("[![YouTube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@SideDev) &nbsp;\n");
        readme.append("[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:chushoubaikaishui@163.com)\n\n");
        readme.append("</div>\n\n");
        
        readme.append("<div align=\"center\">\n\n");
        readme.append("[![Ko-Fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/SideDev) &nbsp;\n");
        readme.append("[![PayPal](https://img.shields.io/badge/PayPal-00457C?style=flat-square&logo=paypal&logoColor=white)](https://paypal.me/ImSideDev) &nbsp;\n");
        readme.append("[![Patreon](https://img.shields.io/badge/Patreon-F96854?style=flat-square&logo=patreon&logoColor=white)](https://patreon.com/SideDev)\n\n");
        readme.append("</div>\n\n");
        
        readme.append("```diff\n");
        readme.append("- ⚠️ 最后更新于: " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " (UTC+8)\n");
        readme.append(String.format("+ 💀 Java Level: %d%% | Runtime: JVM %s\n", javaLevel, System.getProperty("java.version")));
        readme.append("```\n\n");
        
        readme.append("<div align=\"center\">\n");
        readme.append(String.format("<img src=\"https://komarev.com/ghpvc/?username=SideDev&color=%s&style=flat-square&label=PROFILE+ACCESSES\" />\n", color1.substring(1)));
        readme.append("</div>");
        
        try (PrintWriter out = new PrintWriter(new File("README.md"))) {
            out.print(readme.toString());
            System.out.println("✅ README 生成成功！");
        } catch (IOException e) {
            System.err.println("❌ 写入失败: " + e.getMessage());
        }
    }
}
