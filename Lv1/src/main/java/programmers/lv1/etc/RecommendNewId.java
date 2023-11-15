// 신규 아이디 추천
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
package programmers.lv1.etc;

public class RecommendNewId {
    /**
     * Make String pass the set rules.
     * @param new_id input
     * @return result from process
     */
    public String recommendNewId(String new_id){
        new_id = new_id.toLowerCase();

        // Except alphabet lower case, number, -, _, . remove.
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // If . is repeated make it short.
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // If string start with or end with . remove it.
        new_id = new_id.replaceAll("[.]$", "");
        new_id = new_id.replaceAll("^[.]", "");

        // If String is null make it "a"
        if(new_id.isEmpty()){
            new_id = "a";
        }

        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }

        while(new_id.length() <= 2){
            new_id = new_id + new_id.charAt(new_id.length()-1);
        }

        return new_id;
    }
}
