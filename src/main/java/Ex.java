public class Ex {

    public static String function(int age, float time, boolean day) {
        //if (age < 0 || time < 0 || time > 24) return "Lỗi input";
        if (age < 18) {
            if (time <= 1.5) return "Được";
            else if (time > 3) return "Không";
            else if (!day) return "Được";
            else return "Không";
        }
        else return "Được";
    }
}
