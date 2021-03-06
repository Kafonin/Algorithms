class Solution {
    public String validIPAddress(String IP) {
        boolean ipv4flag = validateIPv4(IP);
        boolean ipv6flag = validateIPv6(IP);
        if (ipv4flag) return "IPv4";
        if (ipv6flag) return "IPv6";

        return "Neither"; 
    }
    
    public boolean validateIPv4(String stringParam) {
        if (stringParam.length()<7) return false;
        int count = 0;
        for (int i=0; i<stringParam.length(); i++) {
            if (stringParam.charAt(i)=='.')
                count++;
            else if (!Character.isDigit(stringParam.charAt(i))) {
                return false;
            }
        }
        if (count!=3) return false;
        
        String[] temp = stringParam.split("[.]");
        for (int i=0; i<temp.length; i++) {
            int j=0;
            if (temp[i].length()>3 || temp[i].length()<1)
                return false;
            else if (Integer.parseInt(temp[i])>255)
                return false;
            else if (temp[i].length()!=String.valueOf(Integer.parseInt(temp[i])).length())
                return false;
            else
                while (j<temp[i].length()) {
                    if (!Character.isDigit(temp[i].charAt(j))) {
                        return false;
                    }
                    j++;
                }    
        }
        return true;
    }
    
    public boolean validateIPv6(String stringParam) {
        String[] str = stringParam.split(":");
        // Check if String length is less thn 8
        if(str.length != 8) return false;
        // Check if last char is not :
        if(stringParam.charAt(stringParam.length()-1) == ':')return false;
        for(int i = 0; i < str.length; i++){
            String currentStr = str[i].toLowerCase();
            if(currentStr.length() >4 || currentStr.length() < 1) return false;
            int count = 0;
            for(int j = 0; j < currentStr.length(); j++){
                char c = currentStr.charAt(j);
                if( ((c >= 48 && c<= 57) || (c >= 97 && c <= 102 ))){
                    if(c == 48){
                        count++;
                    }else if(count  == 4 ){
                        return false;
                    }
                }
                else return false;
            }

        }
        return true;
    }
}