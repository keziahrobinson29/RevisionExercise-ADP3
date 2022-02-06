package za.ac.cput.HumaamMohamed_214044750;

public class TestDrivenDevelopment {


        private String Name;
        private String Sname;
        private int FirstNum;
        private int SecondNum;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getSname() {
            return Sname;
        }

        public void setSname(String sname) {
            Sname = sname;
        }

        public int getFirstNum() {
            return FirstNum;
        }

        public void setFirstNum(int firstNum) {
            FirstNum = firstNum;
        }

        public int getSecondNum() {
            return SecondNum;
        }

        public void setSecondNum(int secondNum) {
            SecondNum = secondNum;
        }

        @Override
        public String toString() {
            return "TestDrivenDevelopment{" +
                    "Name='" + Name + '\'' +
                    ", Sname='" + Sname + '\'' +
                    ", FirstNum=" + FirstNum +
                    ", SecondNum=" + SecondNum +
                    '}';
        }
    }


