import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            participantMap.replace(name, participantMap.get(name) - 1);
        }
        for (String name : participantMap.keySet()) {
            if (participantMap.get(name) != 0) {
                answer = name;
                break;
            }
        }
        return answer;
    }
}
