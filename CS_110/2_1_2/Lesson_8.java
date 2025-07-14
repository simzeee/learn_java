
public class Lesson_8 {

    public class FishermanLicense {

        private int year;
        private int id;

        public void setYear(int inputYear) {
            year = inputYear;
        }

        public void setId(int inputId) {
            id = inputId;
        }

        public int getYear() {
            return year;
        }

        public int getId() {
            return id;
        }
    }

    public class Weight {

        private double pounds;

        public void setPounds(double inputPounds) {
            pounds = inputPounds;
        }

        public double getPounds() {
            return pounds;
        }

        private double convertToOunces() {
            return pounds * 16;
        }

        public void printInOunces() {
            System.out.printf("%.1f ounces\n", convertToOunces());
        }
    }
}
