package com.HJh.test.oop.zifuchuan.lianxi;
/*给你一个由英文字母组成的字符串 s ，请你找出并返回 s 中的 最好 英文字母。返回的字母必须为大写形式。
如果不存在满足条件的字母，则返回一个空字符串。
最好 英文字母的大写和小写形式必须 都 在 s 中出现。
英文字母 b 比另一个英文字母 a 更好 的前提是：英文字母表中，b 在 a 之 后 出现。
示例 1：
输入：s = "lEeTcOdE"
输出："E"
解释：
字母 'E' 是唯一一个大写和小写形式都出现的字母。
示例 2：
输入：s = "arRAzFif"
输出："R"
解释：
字母 'R' 是大写和小写形式都出现的最好英文字母。
注意 'A' 和 'F' 的大写和小写形式也都出现了，但是 'R' 比 'F' 和 'A' 更好。
示例 3：
输入：s = "AbCdEfGhIjK"
输出：""
解释：
不存在大写和小写形式都出现的字母。*/

public class test4 {

        public String greatestLetter(String s) {
            char max = ' ';
            for(int i = 0; i < s.length(); i++){
                char a = s.charAt(i);
                char lower = Character.isUpperCase(a) ? (char)(a + 32) : (char)(a - 32);

                boolean found = false;
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j) == lower){
                        found = true;
                        break;
                    }
                }

                if(found && Character.isUpperCase(a)){
                    if(max == ' ' || a > max){
                        max = a;
                    }
                } else if(found && Character.isLowerCase(a)){
                    char upper = (char)(a - 32);
                    if(max == ' ' || upper > max){
                        max = upper;
                    }
                }
            }

            if(max == ' '){
                return "";
            }
            //字符转字符串
            return String.valueOf(max);
        }
}


