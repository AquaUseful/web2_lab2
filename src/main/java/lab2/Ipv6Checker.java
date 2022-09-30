package lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv6Checker {
    private static final String ipv6Seg = "[0-9a-fA-F]{1,4}";
    private static final String ipv6RegexStr = "(" +
            "(" + ipv6Seg + ":){7,7}" + ipv6Seg + "|" + // 1:2:3:4:5:6:7:8
            "(" + ipv6Seg + ":){1,7}:|" + // 1:: 1:2:3:4:5:6:7::
            "(" + ipv6Seg + ":){1,6}:" + ipv6Seg + "|" + // 1::8 1:2:3:4:5:6::8 1:2:3:4:5:6::8
            "(" + ipv6Seg + ":){1,5}(:" + ipv6Seg + "){1,2}|" + // 1::7:8 1:2:3:4:5::7:8 1:2:3:4:5::8
            "(" + ipv6Seg + ":){1,4}(:" + ipv6Seg + "){1,3}|" + // 1::6:7:8 1:2:3:4::6:7:8 1:2:3:4::8
            "(" + ipv6Seg + ":){1,3}(:" + ipv6Seg + "){1,4}|" + // 1::5:6:7:8 1:2:3::5:6:7:8 1:2:3::8
            "(" + ipv6Seg + ":){1,2}(:" + ipv6Seg + "){1,5}|" + // 1::4:5:6:7:8 1:2::4:5:6:7:8 1:2::8
            ipv6Seg + ":((:" + ipv6Seg + "){1,6})|" + // 1::3:4:5:6:7:8 1::3:4:5:6:7:8 1::8
            ":((:" + ipv6Seg + "){1,7}|:)|" + // ::2:3:4:5:6:7:8 ::2:3:4:5:6:7:8 ::8 ::
            ")";
    private static final Pattern pattern = Pattern.compile(ipv6RegexStr);

    public static boolean checkStr(String str) {
        final Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
