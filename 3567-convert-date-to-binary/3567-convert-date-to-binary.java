import java.util.*;
class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");

        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);

        String yrBinary=Integer.toBinaryString(year);
        String monBinary=Integer.toBinaryString(month);
        String dayBinary=Integer.toBinaryString(day);

        return yrBinary+"-"+monBinary+"-"+dayBinary;
    }
}