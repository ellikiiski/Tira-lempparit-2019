
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    
    static boolean joo = false;

    public static boolean looppi(int is, int ie, int es, int ee, int v, int[][] sudoku) {
        for (int i = is; i < ie; i++) {
            for (int e = es; e < ee; e++) {
                if (sudoku[i][e] == v) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sopii(int r, int c, int v, int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][c] == v || sudoku[r][i] == v) {
                return false;
            }
        }
        if (r < 3) {
            if (c < 3) {
                if (!looppi(0, 3, 0, 3, v, sudoku)) {
                    return false;
                }
            } else if (c < 6) {
                if (!looppi(0, 3, 3, 6, v, sudoku)) {
                    return false;
                }
            } else if (c < 9) {
                if (!looppi(0, 3, 6, 9, v, sudoku)) {
                    return false;
                }
            }
        } else if (r < 6) {
            if (c < 3) {
                if (!looppi(3, 6, 0, 3, v, sudoku)) {
                    return false;
                }
            } else if (c < 6) {
                if (!looppi(3, 6, 3, 6, v, sudoku)) {
                    return false;
                }
            } else if (c < 9) {
                if (!looppi(3, 6, 6, 9, v, sudoku)) {
                    return false;
                }
            }
        } else if (r < 9) {
            if (c < 3) {
                if (!looppi(6, 9, 0, 3, v, sudoku)) {
                    return false;
                }
            } else if (c < 6) {
                if (!looppi(6, 9, 3, 6, v, sudoku)) {
                    return false;
                }
            } else if (c < 9) {
                if (!looppi(6, 9, 6, 9, v, sudoku)) {
                    return false;
                }
            }
        }
        joo = false;
        return true;
    }

    public static void testi(int[] rc, int[][] sudoku, Set<String> rivit) {
        int r = rc[0];
        int c = rc[1];
        int n = 9;

        for (int i = 1; i < n + 1; i++) {
            if (sopii(r, c, i, sudoku)) {
                sudoku[r][c] = i;
                int[] b = seurVapaa(r, c, sudoku, rivit);
                if (!joo) {
                    testi(b, sudoku, rivit);
                }
            }
        }
        if (!joo) {
            sudoku[r][c] = 0;
        }
    }

    public static int[] seurVapaa(int r, int c, int[][] sudoku, Set<String> rivit) {
        c++;
        while (!rivit.contains(String.valueOf(r) + String.valueOf(c))) {
            if (c == 9) {
                r++;
                c = 0;
            } else {
                c++;
            }
            if (r == 9) {
                joo = true;
                break;
            }
        }
        int[] a = {r, c};
        return a;
    }

    public static void ratkaise(int[][] sudoku) {
        Set<String> rivit = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (sudoku[r][c] == 0) {
                    rivit.add(String.valueOf(r) + String.valueOf(c));
                }
            }
        }
        testi(seurVapaa(0, -1, sudoku, rivit), sudoku, rivit);
    }

    private static String[] esim1 = new String[]{
        "8??93???2",
        "??9????4?",
        "7?21??96?",
        "2??????9?",
        "?6?????7?",
        "?7???6??5",
        "?27??84?6",
        "?3????5??",
        "5???62??8"};

    private static String[] esim2 = new String[]{
        "619?42735",
        "74?63519?",
        "325971684",
        "87?4?9316",
        "136?87549",
        "594316827",
        "987164253",
        "251?93468",
        "46?528971"};

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];
        sudoku = toIntArray(esim2);
        ratkaise(sudoku);
        System.out.println("Ratkaisu:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] toIntArray(String[] rs) {
        int[][] s = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (rs[i].charAt(j) != '?') {
                    s[i][j] = Character.digit(rs[i].charAt(j), 10);
                }
            }
        }
        return s;
    }
}
