/* https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1 */

class SquaresInNchessboard {
    static Long squaresInChessBoard(Long N) {
        return (N*(N+1)*(2*N+1))/6;
    }
}
