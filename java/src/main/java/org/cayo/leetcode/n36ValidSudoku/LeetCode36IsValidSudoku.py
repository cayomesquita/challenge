import collections
from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        size = len(board)
        rows, columns, squares = collections.defaultdict(set),collections.defaultdict(set),collections.defaultdict(set)
        for r in range(size):
            for c in range(size):
                value = board[r][c]
                if value == '.':
                    continue
                key = (r//3, c//3)
                if value in rows[r] or value in columns[c] or value in squares[key]:
                    return False
                rows[r].add(value)
                columns[c].add(value)
                squares[key].add(value)
        return True
board = [["5","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]]
print(Solution().isValidSudoku(board))
board = [["8","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]]
print(Solution().isValidSudoku(board))
