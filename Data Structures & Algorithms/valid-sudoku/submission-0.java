class Solution {
    public boolean isValidSudoku(char[][] board) {
         
         Map<Integer,HashSet<Character>> row = new HashMap<>();
         Map<Integer,HashSet<Character>> col = new HashMap<>();
         Map<String,HashSet<Character>> sqaure = new HashMap<>();

         for(int r =0;r<board.length;r++)
         {
            for(int c=0;c<board[0].length;c++)
            {
                String squareKey = (r/3)+","+(c/3);

                if(board[r][c]=='.') continue;
                if(row.computeIfAbsent(r,k->new HashSet<>()).contains(board[r][c]) ||
                  col.computeIfAbsent(c,k->new HashSet<>()).contains(board[r][c])  ||  
                  sqaure.computeIfAbsent(squareKey,k->new HashSet<>()).contains(board[r][c])
                  )
                  return false;
                  else
                    row.get(r).add(board[r][c]);
                    col.get(c).add(board[r][c]);
                    sqaure.get(squareKey).add(board[r][c]);
            }
         }
         return true;
    }

}
