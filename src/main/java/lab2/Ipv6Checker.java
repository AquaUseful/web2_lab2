package lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv6Checker {
    private static final String ipv6Seg = "[0-9a-fA-F]{1,4}";
    private static final String ipv6RegexStr = "(" +
            "(" + ipv6Seg + ":){7,7}" + ipv6Seg + "|" +
            "(" + ipv6Seg + ":){1,7}:|" +
            "(" + ipv6Seg + ":){1,6}:" + ipv6Seg + "|" +
            "(" + ipv6Seg + ":){1,5}(:" + ipv6Seg + "){1,2}|" +
            "(" + ipv6Seg + ":){1,4}(:" + ipv6Seg + "){1,3}|" +
            "(" + ipv6Seg + ":){1,3}(:" + ipv6Seg + "){1,4}|" +
            "(" + ipv6Seg + ":){1,2}(:" + ipv6Seg + "){1,5}|" +
            ipv6Seg + ":((:" + ipv6Seg + "){1,6})|" +
            ":((:" + ipv6Seg + "){1,7}|:)|" +
            "fe80:(:" + ipv6Seg + "){0,4}%[0-9a-zA-Z]{1,}|" +
            ")";
    private static final Pattern pattern = Pattern.compile(ipv6RegexStr);

    public static boolean checkStr(String str) {
        final Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
