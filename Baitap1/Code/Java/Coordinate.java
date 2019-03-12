class Coordinate {
    int x, y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void println() {
        System.out.println("<" + x + "," + y + ">");
    }

    double distance(Coordinate other) {
        int x_diff_sq = (this.x - other.x)*(this.x - other.x);
        int y_diff_sq = (this.y - other.y)*(this.y - other.y);
        return Math.sqrt((double) x_diff_sq + y_diff_sq);
    }

    double distance(Coordinate self, Coordinate other) {
        int x_diff_sq = (self.x - other.x)*(this.x - other.x);
        int y_diff_sq = (self.y - other.y)*(this.y - other.y);
        return Math.sqrt((double) x_diff_sq + y_diff_sq);
    }
}