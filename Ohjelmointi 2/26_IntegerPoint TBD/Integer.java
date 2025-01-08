public class Integer {

    static class IntegerValue {
        int num;

        public IntegerValue(int inum) {
            num = inum;
        }

        public int getInt() {
            return num;
        }

        public IntegerValue add(IntegerValue other) {
            return new IntegerValue(this.num + other.num);
        }
    }

    static class IntegerPoint {
        IntegerValue x;
        IntegerValue y;

        public IntegerPoint(IntegerValue ix, IntegerValue iy) {
            x = ix;
            y = iy;
        }

        public IntegerValue getX() {
            return x;
        }

        public IntegerValue getY() {
            return y;
        }

        public IntegerPoint add(IntegerPoint other) {
            IntegerValue newX = this.x.add(other.x);
            IntegerValue newY = this.y.add(other.y);
            return new IntegerPoint(newX, newY);
        }
    }

    public static void main(String args[]) {

        IntegerValue intv1 = new IntegerValue(1);
        IntegerValue intv2 = new IntegerValue(2);
        IntegerValue intv3 = new IntegerValue(3);
        IntegerValue intv4 = new IntegerValue(4);
        IntegerPoint intp = new IntegerPoint(intv1, intv2);
        IntegerPoint intp2 = new IntegerPoint(intv3, intv4);

        intp = intp.add(intp2);

        System.out.println(intp.getX().getInt() + " " + intp.getY().getInt());
    }
}
