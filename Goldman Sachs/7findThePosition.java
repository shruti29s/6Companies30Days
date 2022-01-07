/* https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1/ */

class findThePosition {
    static int findPosition(int N , int M , int K) {
        M=M+K-1;
        if(M%N==0)
            return N;
        return M%N;
    }
}
