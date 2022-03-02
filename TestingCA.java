public class TestingCA {
    public int min(int A, int B, int C) {
        if (A==B || A==C)
            throw new IllegalArgumentException("the inputs must not be equal");
        if (A < B) {
            if (B < C) return A;
            else {
                if (A < C) return A;
                else return B;
            }
        } else {
            if (B > C) return C;
        }
        if (A < B) return A;
        else return C;
    }
}
