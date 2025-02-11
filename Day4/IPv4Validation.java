class IPv4Validation{
    public boolean isValidIP(String ip) {
        return validate(ip, 0, 0);
    }
    private boolean validate(String ip, int segmentCount, int start) {
        if (segmentCount == 4) {
            return start == ip.length();
        }
        int end = start;
        while (end < ip.length() && ip.charAt(end) != '.') {
            end++;
        }
        String segment = ip.substring(start, end);
        if (!isValidSegment(segment)) {
            return false;
        }
        return end == ip.length() || validate(ip, segmentCount + 1, end + 1);
    }
    private boolean isValidSegment(String segment) {
        if (segment.isEmpty() || segment.length() > 3) {
            return false;
        }
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
    public static void main(String[] args) {
        IPv4Validation solution = new IPv4Validation();
        System.out.println(solution.isValidIP("222.111.111.111")); // true
        System.out.println(solution.isValidIP("5555..555")); // false
        System.out.println(solution.isValidIP("0.0.0.255")); // true
        System.out.println(solution.isValidIP("0.0.0.0255")); // false
    }
}